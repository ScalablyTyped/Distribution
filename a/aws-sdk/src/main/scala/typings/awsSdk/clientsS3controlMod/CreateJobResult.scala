package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobResult extends StObject {
  
  /**
    * The ID for this job. Amazon S3 generates this ID automatically and returns it after a successful Create Job request.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsS3controlMod.JobId] = js.undefined
}
object CreateJobResult {
  
  inline def apply(): CreateJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobResult]
  }
  
  extension [Self <: CreateJobResult](x: Self) {
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
