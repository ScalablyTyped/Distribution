package typings.antlr4.tokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/Token", "Token")
@js.native
class Token () extends js.Object {
  var channel: js.Any = js.native
  var column: Double = js.native
  var line: Double = js.native
  var source: js.Any = js.native
  var start: Double = js.native
  var stop: Double = js.native
  val text: String = js.native
  var tokenIndex: Double = js.native
  var `type`: js.Any = js.native
  def getInputStream(): js.Any = js.native
  def getTokenSource(): js.Any = js.native
}

/* static members */
@JSImport("antlr4/Token", "Token")
@js.native
object Token extends js.Object {
  val EOF: Double = js.native
  val EPSILON: Double = js.native
  val HIDDEN_CHANNEL: Double = js.native
  val INVALID_TYPE: Double = js.native
  val MIN_USER_TOKEN_TYPE: Double = js.native
}

