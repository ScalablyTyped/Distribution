package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OldNode extends js.Object {
  val InUndoRedo: Boolean = js.native
  val NewNode: CustomXMLNode = js.native
  val OldNode: CustomXMLNode = js.native
}

object OldNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode, OldNode: CustomXMLNode): OldNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any], OldNode = OldNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldNode]
  }
  @scala.inline
  implicit class OldNodeOps[Self <: OldNode] (val x: Self) extends AnyVal {
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
    def setNewNode(value: CustomXMLNode): Self = this.set("NewNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldNode(value: CustomXMLNode): Self = this.set("OldNode", value.asInstanceOf[js.Any])
  }
  
}

