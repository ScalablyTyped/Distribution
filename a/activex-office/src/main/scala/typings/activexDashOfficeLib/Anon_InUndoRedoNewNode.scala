package typings
package activexDashOfficeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedoNewNode extends js.Object {
  val InUndoRedo: scala.Boolean
  val NewNode: activexDashOfficeLib.OfficeNs.CustomXMLNode
}

object Anon_InUndoRedoNewNode {
  @scala.inline
  def apply(InUndoRedo: scala.Boolean, NewNode: activexDashOfficeLib.OfficeNs.CustomXMLNode): Anon_InUndoRedoNewNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InUndoRedo")(InUndoRedo)
    __obj.updateDynamic("NewNode")(NewNode)
    __obj.asInstanceOf[Anon_InUndoRedoNewNode]
  }
}

