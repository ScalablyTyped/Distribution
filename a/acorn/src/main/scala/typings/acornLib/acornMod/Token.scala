package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Token")
@js.native
class Token protected ()
  extends acornLib.acornMod.acornNs.Token {
  def this(p: acornLib.acornMod.acornNs.Parser) = this()
  /* CompleteClass */
  override var end: scala.Double = js.native
  /* CompleteClass */
  override var start: scala.Double = js.native
  /* CompleteClass */
  override var `type`: acornLib.acornMod.acornNs.TokenType = js.native
  /* CompleteClass */
  override var value: js.Any = js.native
}

