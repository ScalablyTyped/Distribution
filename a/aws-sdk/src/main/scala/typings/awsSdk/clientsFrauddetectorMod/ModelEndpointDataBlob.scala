package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelEndpointDataBlob extends StObject {
  
  /**
    * The byte buffer of the Amazon SageMaker model endpoint input data blob.
    */
  var byteBuffer: js.UndefOr[blob] = js.undefined
  
  /**
    * The content type of the Amazon SageMaker model endpoint input data blob. 
    */
  var contentType: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.contentType] = js.undefined
}
object ModelEndpointDataBlob {
  
  inline def apply(): ModelEndpointDataBlob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelEndpointDataBlob]
  }
  
  extension [Self <: ModelEndpointDataBlob](x: Self) {
    
    inline def setByteBuffer(value: blob): Self = StObject.set(x, "byteBuffer", value.asInstanceOf[js.Any])
    
    inline def setByteBufferUndefined: Self = StObject.set(x, "byteBuffer", js.undefined)
    
    inline def setContentType(value: contentType): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
  }
}
