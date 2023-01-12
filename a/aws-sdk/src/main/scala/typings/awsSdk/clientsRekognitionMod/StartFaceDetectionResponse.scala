package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartFaceDetectionResponse extends StObject {
  
  /**
    * The identifier for the face detection job. Use JobId to identify the job in a subsequent call to GetFaceDetection.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobId] = js.undefined
}
object StartFaceDetectionResponse {
  
  inline def apply(): StartFaceDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartFaceDetectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartFaceDetectionResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
