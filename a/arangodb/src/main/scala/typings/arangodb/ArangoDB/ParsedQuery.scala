package typings.arangodb.ArangoDB

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
    val __obj = js.Dynamic.literal(ast = ast.asInstanceOf[js.Any], bindVars = bindVars.asInstanceOf[js.Any], collections = collections.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], parsed = parsed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedQuery]
  }
}

