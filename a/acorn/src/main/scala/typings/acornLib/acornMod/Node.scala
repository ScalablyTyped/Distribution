package typings
package acornLib.acornMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "Node")
@js.native
class Node protected ()
  extends acornLib.acornMod.acornNs.Node {
  def this(parser: acornLib.acornMod.acornNs.Parser, pos: scala.Double, loc: scala.Double) = this()
  /* CompleteClass */
  override var end: scala.Double = js.native
  /* CompleteClass */
  override var start: scala.Double = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
}

