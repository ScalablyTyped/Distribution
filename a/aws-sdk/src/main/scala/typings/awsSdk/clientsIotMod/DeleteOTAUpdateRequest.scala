package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOTAUpdateRequest extends StObject {
  
  /**
    * When true, the stream created by the OTAUpdate process is deleted when the OTA update is deleted. Ignored if the stream specified in the OTAUpdate is supplied by the user.
    */
  var deleteStream: js.UndefOr[DeleteStream] = js.undefined
  
  /**
    * When true, deletes the IoT job created by the OTAUpdate process even if it is "IN_PROGRESS". Otherwise, if the job is not in a terminal state ("COMPLETED" or "CANCELED") an exception will occur. The default is false.
    */
  var forceDeleteAWSJob: js.UndefOr[ForceDeleteAWSJob] = js.undefined
  
  /**
    * The ID of the OTA update to delete.
    */
  var otaUpdateId: OTAUpdateId
}
object DeleteOTAUpdateRequest {
  
  inline def apply(otaUpdateId: OTAUpdateId): DeleteOTAUpdateRequest = {
    val __obj = js.Dynamic.literal(otaUpdateId = otaUpdateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOTAUpdateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteOTAUpdateRequest] (val x: Self) extends AnyVal {
    
    inline def setDeleteStream(value: DeleteStream): Self = StObject.set(x, "deleteStream", value.asInstanceOf[js.Any])
    
    inline def setDeleteStreamUndefined: Self = StObject.set(x, "deleteStream", js.undefined)
    
    inline def setForceDeleteAWSJob(value: ForceDeleteAWSJob): Self = StObject.set(x, "forceDeleteAWSJob", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteAWSJobUndefined: Self = StObject.set(x, "forceDeleteAWSJob", js.undefined)
    
    inline def setOtaUpdateId(value: OTAUpdateId): Self = StObject.set(x, "otaUpdateId", value.asInstanceOf[js.Any])
  }
}
