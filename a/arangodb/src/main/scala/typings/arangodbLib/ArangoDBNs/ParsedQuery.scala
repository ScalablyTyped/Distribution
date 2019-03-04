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
    val __obj = js.Dynamic.literal(ast = ast, bindVars = bindVars, collections = collections, parameters = parameters, parsed = parsed)
  
    __obj.asInstanceOf[ParsedQuery]
  }
}

