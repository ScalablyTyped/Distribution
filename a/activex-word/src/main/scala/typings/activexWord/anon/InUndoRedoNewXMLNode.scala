package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InUndoRedoNewXMLNode extends js.Object {
  val InUndoRedo: Boolean = js.native
  val NewXMLNode: typings.activexWord.Word.XMLNode = js.native
}

object InUndoRedoNewXMLNode {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewXMLNode: typings.activexWord.Word.XMLNode): InUndoRedoNewXMLNode = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewXMLNode = NewXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedoNewXMLNode]
  }
  @scala.inline
  implicit class InUndoRedoNewXMLNodeOps[Self <: InUndoRedoNewXMLNode] (val x: Self) extends AnyVal {
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
    def setNewXMLNode(value: typings.activexWord.Word.XMLNode): Self = this.set("NewXMLNode", value.asInstanceOf[js.Any])
  }
  
}

