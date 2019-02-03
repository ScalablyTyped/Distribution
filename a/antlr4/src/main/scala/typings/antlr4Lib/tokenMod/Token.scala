package typings
package antlr4Lib.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/Token", "Token")
@js.native
class Token () extends js.Object {
  var channel: js.Any = js.native
  var column: scala.Double = js.native
  var line: scala.Double = js.native
  var source: js.Any = js.native
  var start: scala.Double = js.native
  var stop: scala.Double = js.native
  val text: java.lang.String = js.native
  var tokenIndex: scala.Double = js.native
  var `type`: js.Any = js.native
  def getInputStream(): js.Any = js.native
  def getTokenSource(): js.Any = js.native
}

/* static members */
@JSImport("antlr4/Token", "Token")
@js.native
object Token extends js.Object {
  val EOF: scala.Double = js.native
  val EPSILON: scala.Double = js.native
  val HIDDEN_CHANNEL: scala.Double = js.native
  val INVALID_TYPE: scala.Double = js.native
  val MIN_USER_TOKEN_TYPE: scala.Double = js.native
}

