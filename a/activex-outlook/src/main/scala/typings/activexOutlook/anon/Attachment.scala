package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  val Attachment: typings.activexOutlook.Outlook.Attachment
}
object Attachment {
  
  @scala.inline
  def apply(Attachment: typings.activexOutlook.Outlook.Attachment): Attachment = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  @scala.inline
  implicit class AttachmentMutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: typings.activexOutlook.Outlook.Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
  }
}
