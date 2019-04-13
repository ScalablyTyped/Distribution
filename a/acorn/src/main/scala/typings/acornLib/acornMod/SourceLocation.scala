package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "SourceLocation")
@js.native
class SourceLocation protected ()
  extends estreeLib.estreeMod.SourceLocation {
  def this(p: Parser, start: Position, end: Position) = this()
  /* CompleteClass */
  override var end: estreeLib.estreeMod.Position = js.native
  @JSName("end")
  var end_SourceLocation: Position = js.native
  /* CompleteClass */
  override var start: estreeLib.estreeMod.Position = js.native
  @JSName("start")
  var start_SourceLocation: Position = js.native
}

