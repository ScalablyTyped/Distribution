package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedQuery extends js.Object {
  var ast: js.Array[QueryAstNode]
  var bindVars: js.Array[java.lang.String]
  var collections: js.Array[java.lang.String]
  var parameters: js.Array[java.lang.String]
  var parsed: scala.Boolean
}

object ParsedQuery {
  @scala.inline
  def apply(
    ast: js.Array[QueryAstNode],
    bindVars: js.Array[java.lang.String],
    collections: js.Array[java.lang.String],
    parameters: js.Array[java.lang.String],
    parsed: scala.Boolean
  ): ParsedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ast")(ast)
    __obj.updateDynamic("bindVars")(bindVars)
    __obj.updateDynamic("collections")(collections)
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("parsed")(parsed)
    __obj.asInstanceOf[ParsedQuery]
  }
}

