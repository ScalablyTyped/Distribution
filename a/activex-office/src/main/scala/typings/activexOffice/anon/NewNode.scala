package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewNode extends js.Object {
  val InUndoRedo: Boolean = js.native
  val NewNode: CustomXMLNode = js.native
}

object NewNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewNode: CustomXMLNode): NewNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewNode = NewNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewNode]
  }
  @scala.inline
  implicit class NewNodeOps[Self <: NewNode] (val x: Self) extends AnyVal {
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
  }
  
}

