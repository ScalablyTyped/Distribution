package typings.acorn.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "SourceLocation")
@js.native
class SourceLocation protected ()
  extends typings.estree.estreeMod.SourceLocation {
  def this(p: Parser, start: Position, end: Position) = this()
  /* CompleteClass */
  override var end: typings.estree.estreeMod.Position = js.native
  /* CompleteClass */
  override var start: typings.estree.estreeMod.Position = js.native
}

