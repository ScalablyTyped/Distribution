package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartContentModerationResponse extends StObject {
  
  /**
    * The identifier for the content analysis job. Use JobId to identify the job in a subsequent call to GetContentModeration.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.JobId] = js.undefined
}
object StartContentModerationResponse {
  
  inline def apply(): StartContentModerationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartContentModerationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartContentModerationResponse] (val x: Self) extends AnyVal {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
