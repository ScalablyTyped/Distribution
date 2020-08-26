package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InUndoRedo extends js.Object {
  val InUndoRedo: Boolean = js.native
  val OldNextSibling: CustomXMLNode = js.native
  val OldNode: CustomXMLNode = js.native
  val OldParentNode: CustomXMLNode = js.native
}

object InUndoRedo {
  @scala.inline
  def apply(
    InUndoRedo: Boolean,
    OldNextSibling: CustomXMLNode,
    OldNode: CustomXMLNode,
    OldParentNode: CustomXMLNode
  ): InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldNextSibling = OldNextSibling.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any], OldParentNode = OldParentNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedo]
  }
  @scala.inline
  implicit class InUndoRedoOps[Self <: InUndoRedo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInUndoRedo(value: Boolean): Self = this.set("InUndoRedo", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldNextSibling(value: CustomXMLNode): Self = this.set("OldNextSibling", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldNode(value: CustomXMLNode): Self = this.set("OldNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldParentNode(value: CustomXMLNode): Self = this.set("OldParentNode", value.asInstanceOf[js.Any])
  }
  
}

