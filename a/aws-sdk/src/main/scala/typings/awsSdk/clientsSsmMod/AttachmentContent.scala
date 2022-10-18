package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentContent extends StObject {
  
  /**
    * The cryptographic hash value of the document content.
    */
  var Hash: js.UndefOr[AttachmentHash] = js.undefined
  
  /**
    * The hash algorithm used to calculate the hash value.
    */
  var HashType: js.UndefOr[AttachmentHashType] = js.undefined
  
  /**
    * The name of an attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.undefined
  
  /**
    * The size of an attachment in bytes.
    */
  var Size: js.UndefOr[ContentLength] = js.undefined
  
  /**
    * The URL location of the attachment content.
    */
  var Url: js.UndefOr[AttachmentUrl] = js.undefined
}
object AttachmentContent {
  
  inline def apply(): AttachmentContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentContent]
  }
  
  extension [Self <: AttachmentContent](x: Self) {
    
    inline def setHash(value: AttachmentHash): Self = StObject.set(x, "Hash", value.asInstanceOf[js.Any])
    
    inline def setHashType(value: AttachmentHashType): Self = StObject.set(x, "HashType", value.asInstanceOf[js.Any])
    
    inline def setHashTypeUndefined: Self = StObject.set(x, "HashType", js.undefined)
    
    inline def setHashUndefined: Self = StObject.set(x, "Hash", js.undefined)
    
    inline def setName(value: AttachmentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSize(value: ContentLength): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setUrl(value: AttachmentUrl): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
