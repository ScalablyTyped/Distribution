package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Token")
@js.native
class Token protected () extends AbstractToken {
  def this(p: Parser) = this()
  /* CompleteClass */
  override var end: scala.Double = js.native
  /* CompleteClass */
  override var start: scala.Double = js.native
  var `type`: TokenType = js.native
  var value: js.Any = js.native
}

