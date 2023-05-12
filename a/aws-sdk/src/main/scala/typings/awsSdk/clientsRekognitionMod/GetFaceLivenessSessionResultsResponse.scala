package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFaceLivenessSessionResultsResponse extends StObject {
  
  /**
    * A set of images from the Face Liveness video that can be used for audit purposes. It includes a bounding box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the output configuration.
    */
  var AuditImages: js.UndefOr[typings.awsSdk.clientsRekognitionMod.AuditImages] = js.undefined
  
  /**
    * Probabalistic confidence score for if the person in the given video was live, represented as a float value between 0 to 100.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  
  /**
    * A high-quality image from the Face Liveness video that can be used for face comparison or search. It includes a bounding box of the face and the Base64-encoded bytes that return an image. If the CreateFaceLivenessSession request included an OutputConfig argument, the image will be uploaded to an S3Object specified in the output configuration. In case the reference image is not returned, it's recommended to retry the Liveness check.
    */
  var ReferenceImage: js.UndefOr[AuditImage] = js.undefined
  
  /**
    * The sessionId for which this request was called.
    */
  var SessionId: LivenessSessionId
  
  /**
    * Represents a status corresponding to the state of the session. Possible statuses are: CREATED, IN_PROGRESS, SUCCEEDED, FAILED, EXPIRED.
    */
  var Status: LivenessSessionStatus
}
object GetFaceLivenessSessionResultsResponse {
  
  inline def apply(SessionId: LivenessSessionId, Status: LivenessSessionStatus): GetFaceLivenessSessionResultsResponse = {
    val __obj = js.Dynamic.literal(SessionId = SessionId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFaceLivenessSessionResultsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFaceLivenessSessionResultsResponse] (val x: Self) extends AnyVal {
    
    inline def setAuditImages(value: AuditImages): Self = StObject.set(x, "AuditImages", value.asInstanceOf[js.Any])
    
    inline def setAuditImagesUndefined: Self = StObject.set(x, "AuditImages", js.undefined)
    
    inline def setAuditImagesVarargs(value: AuditImage*): Self = StObject.set(x, "AuditImages", js.Array(value*))
    
    inline def setConfidence(value: Percent): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    inline def setReferenceImage(value: AuditImage): Self = StObject.set(x, "ReferenceImage", value.asInstanceOf[js.Any])
    
    inline def setReferenceImageUndefined: Self = StObject.set(x, "ReferenceImage", js.undefined)
    
    inline def setSessionId(value: LivenessSessionId): Self = StObject.set(x, "SessionId", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: LivenessSessionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
