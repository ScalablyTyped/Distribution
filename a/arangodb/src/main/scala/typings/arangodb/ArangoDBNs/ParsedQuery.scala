package typings.arangodb.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedQuery extends js.Object {
  var ast: js.Array[QueryAstNode]
  var bindVars: js.Array[String]
  var collections: js.Array[String]
  var parameters: js.Array[String]
  var parsed: Boolean
}

object ParsedQuery {
  @scala.inline
  def apply(
    ast: js.Array[QueryAstNode],
    bindVars: js.Array[String],
    collections: js.Array[String],
    parameters: js.Array[String],
    parsed: Boolean
  ): ParsedQuery = {
    val __obj = js.Dynamic.literal(ast = ast, bindVars = bindVars, collections = collections, parameters = parameters, parsed = parsed)
  
    __obj.asInstanceOf[ParsedQuery]
  }
}

