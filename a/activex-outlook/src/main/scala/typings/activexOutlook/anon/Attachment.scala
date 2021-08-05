package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachment extends StObject {
  
  val Attachment: typings.activexOutlook.Outlook.Attachment
}
object Attachment {
  
  inline def apply(Attachment: typings.activexOutlook.Outlook.Attachment): Attachment = {
    val __obj = js.Dynamic.literal(Attachment = Attachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
  
  extension [Self <: Attachment](x: Self) {
    
    inline def setAttachment(value: typings.activexOutlook.Outlook.Attachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
  }
}
