package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Position")
@js.native
class Position protected ()
  extends typings.estree.mod.Position {
  def this(line: Double, col: Double) = this()
  /** >= 0 */
  /* CompleteClass */
  override var column: Double = js.native
  /** >= 1 */
  /* CompleteClass */
  override var line: Double = js.native
  def offset(n: Double): Position = js.native
}

