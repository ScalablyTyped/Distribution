package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobRequest extends StObject {
  
  /**
    * The name of the job definition to update.
    */
  var JobName: NameString
  
  /**
    * Specifies the values with which to update the job definition. Unspecified configuration is removed or reset to default values.
    */
  var JobUpdate: typings.awsSdk.clientsGlueMod.JobUpdate
}
object UpdateJobRequest {
  
  inline def apply(JobName: NameString, JobUpdate: JobUpdate): UpdateJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any], JobUpdate = JobUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJobRequest]
  }
  
  extension [Self <: UpdateJobRequest](x: Self) {
    
    inline def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    inline def setJobUpdate(value: JobUpdate): Self = StObject.set(x, "JobUpdate", value.asInstanceOf[js.Any])
  }
}
