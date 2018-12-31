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

