package typings.activexWord.anon

import typings.activexWord.Word.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeletedRange extends js.Object {
  
  val DeletedRange: Range = js.native
  
  val InUndoRedo: Boolean = js.native
  
  val OldXMLNode: typings.activexWord.Word.XMLNode = js.native
}
object DeletedRange {
  
  @scala.inline
  def apply(DeletedRange: Range, InUndoRedo: Boolean, OldXMLNode: typings.activexWord.Word.XMLNode): DeletedRange = {
    val __obj = js.Dynamic.literal(DeletedRange = DeletedRange.asInstanceOf[js.Any], InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldXMLNode = OldXMLNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedRange]
  }
  
  @scala.inline
  implicit class DeletedRangeOps[Self <: DeletedRange] (val x: Self) extends AnyVal {
    
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
    def setDeletedRange(value: Range): Self = this.set("DeletedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUndoRedo(value: Boolean): Self = this.set("InUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldXMLNode(value: typings.activexWord.Word.XMLNode): Self = this.set("OldXMLNode", value.asInstanceOf[js.Any])
  }
}
