package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Token")
@js.native
class Token protected () extends AbstractToken {
  def this(p: Parser) = this()
  /* CompleteClass */
  override var end: Double = js.native
  /* CompleteClass */
  override var start: Double = js.native
  var `type`: TokenType = js.native
  var value: js.Any = js.native
}

