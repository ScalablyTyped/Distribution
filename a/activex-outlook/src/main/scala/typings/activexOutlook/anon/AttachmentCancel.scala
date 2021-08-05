package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentCancel extends StObject {
  
  val Attachment: typings.activexOutlook.Outlook.Attachment
  
  var Cancel: Boolean
}
object AttachmentCancel {
  
  inline def apply(Attachment: typings.activexOutlook.Outlook.Attachment, Cancel: Boolean): AttachmentCancel = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any], Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentCancel]
  }
  
  extension [Self <: AttachmentCancel](x: Self) {
    
    inline def setAttachment(value: typings.activexOutlook.Outlook.Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
