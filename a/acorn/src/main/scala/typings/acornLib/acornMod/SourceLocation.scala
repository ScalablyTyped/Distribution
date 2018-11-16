package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "SourceLocation")
@js.native
class SourceLocation protected ()
  extends acornLib.acornMod.acornNs.SourceLocation {
  def this(p: acornLib.acornMod.acornNs.Parser, start: acornLib.acornMod.acornNs.Position, end: acornLib.acornMod.acornNs.Position) = this()
  /* CompleteClass */
  override var end: estreeLib.estreeMod.Position = js.native
  /* CompleteClass */
  @JSName("end")
  override var end_SourceLocation: acornLib.acornMod.acornNs.Position = js.native
  /* CompleteClass */
  override var start: estreeLib.estreeMod.Position = js.native
  /* CompleteClass */
  @JSName("start")
  override var start_SourceLocation: acornLib.acornMod.acornNs.Position = js.native
}

