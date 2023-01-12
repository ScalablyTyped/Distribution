package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentInformation extends StObject {
  
  /**
    * The name of the attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.undefined
}
object AttachmentInformation {
  
  inline def apply(): AttachmentInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentInformation] (val x: Self) extends AnyVal {
    
    inline def setName(value: AttachmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
