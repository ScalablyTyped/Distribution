package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentCancel extends StObject {
  
  val Attachment: typings.activexOutlook.Outlook.Attachment = js.native
  
  var Cancel: Boolean = js.native
}
object AttachmentCancel {
  
  @scala.inline
  def apply(Attachment: typings.activexOutlook.Outlook.Attachment, Cancel: Boolean): AttachmentCancel = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCancel]
  }
  
  @scala.inline
  implicit class AttachmentCancelMutableBuilder[Self <: AttachmentCancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: typings.activexOutlook.Outlook.Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
