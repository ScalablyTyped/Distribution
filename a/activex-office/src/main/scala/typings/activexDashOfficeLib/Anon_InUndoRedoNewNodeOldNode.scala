package typings
package activexDashOfficeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedoNewNodeOldNode extends js.Object {
  val InUndoRedo: scala.Boolean
  val NewNode: activexDashOfficeLib.OfficeNs.CustomXMLNode
  val OldNode: activexDashOfficeLib.OfficeNs.CustomXMLNode
}

object Anon_InUndoRedoNewNodeOldNode {
  @scala.inline
  def apply(
    InUndoRedo: scala.Boolean,
    NewNode: activexDashOfficeLib.OfficeNs.CustomXMLNode,
    OldNode: activexDashOfficeLib.OfficeNs.CustomXMLNode
  ): Anon_InUndoRedoNewNodeOldNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InUndoRedo")(InUndoRedo)
    __obj.updateDynamic("NewNode")(NewNode)
    __obj.updateDynamic("OldNode")(OldNode)
    __obj.asInstanceOf[Anon_InUndoRedoNewNodeOldNode]
  }
}

