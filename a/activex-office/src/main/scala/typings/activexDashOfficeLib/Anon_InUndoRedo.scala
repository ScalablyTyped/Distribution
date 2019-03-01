package typings
package activexDashOfficeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedo extends js.Object {
  val InUndoRedo: scala.Boolean
  val OldNextSibling: activexDashOfficeLib.OfficeNs.CustomXMLNode
  val OldNode: activexDashOfficeLib.OfficeNs.CustomXMLNode
  val OldParentNode: activexDashOfficeLib.OfficeNs.CustomXMLNode
}

object Anon_InUndoRedo {
  @scala.inline
  def apply(
    InUndoRedo: scala.Boolean,
    OldNextSibling: activexDashOfficeLib.OfficeNs.CustomXMLNode,
    OldNode: activexDashOfficeLib.OfficeNs.CustomXMLNode,
    OldParentNode: activexDashOfficeLib.OfficeNs.CustomXMLNode
  ): Anon_InUndoRedo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("InUndoRedo")(InUndoRedo)
    __obj.updateDynamic("OldNextSibling")(OldNextSibling)
    __obj.updateDynamic("OldNode")(OldNode)
    __obj.updateDynamic("OldParentNode")(OldParentNode)
    __obj.asInstanceOf[Anon_InUndoRedo]
  }
}

