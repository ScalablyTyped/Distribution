package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPersonTrackingResponse extends StObject {
  
  /**
    * The identifier for the person detection job. Use JobId to identify the job in a subsequent call to GetPersonTracking.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobId] = js.undefined
}
object StartPersonTrackingResponse {
  
  inline def apply(): StartPersonTrackingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPersonTrackingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartPersonTrackingResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
