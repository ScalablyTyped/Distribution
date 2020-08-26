package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Token")
@js.native
class Token protected () extends js.Object {
  def this(p: Parser) = this()
  var end: Double = js.native
  var loc: js.UndefOr[SourceLocation] = js.native
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var start: Double = js.native
  var `type`: TokenType = js.native
  var value: js.Any = js.native
}

