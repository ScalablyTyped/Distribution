package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDetectorRequest extends StObject {
  
  /**
    * The name of the detector model that was used to create the detector instance.
    */
  var detectorModelName: DetectorModelName
  
  /**
    * The value of the key used to identify the detector. 
    */
  var keyValue: js.UndefOr[KeyValue] = js.undefined
  
  /**
    * The ID to assign to the DeleteDetectorRequest. Each "messageId" must be unique within each batch sent.
    */
  var messageId: MessageId
}
object DeleteDetectorRequest {
  
  inline def apply(detectorModelName: DetectorModelName, messageId: MessageId): DeleteDetectorRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDetectorRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDetectorRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    inline def setKeyValue(value: KeyValue): Self = StObject.set(x, "keyValue", value.asInstanceOf[js.Any])
    
    inline def setKeyValueUndefined: Self = StObject.set(x, "keyValue", js.undefined)
    
    inline def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
  }
}
