package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePublishingDestinationRequest extends StObject {
  
  /**
    * The ID of the publishing destination to update.
    */
  var DestinationId: String
  
  /**
    * A DestinationProperties object that includes the DestinationArn and KmsKeyArn of the publishing destination.
    */
  var DestinationProperties: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.DestinationProperties] = js.undefined
  
  /**
    * The ID of the detector associated with the publishing destinations to update.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
}
object UpdatePublishingDestinationRequest {
  
  inline def apply(DestinationId: String, DetectorId: DetectorId): UpdatePublishingDestinationRequest = {
    val __obj = js.Dynamic.literal(DestinationId = DestinationId.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePublishingDestinationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePublishingDestinationRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinationId(value: String): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    inline def setDestinationProperties(value: DestinationProperties): Self = StObject.set(x, "DestinationProperties", value.asInstanceOf[js.Any])
    
    inline def setDestinationPropertiesUndefined: Self = StObject.set(x, "DestinationProperties", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
  }
}
