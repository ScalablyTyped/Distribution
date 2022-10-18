package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelQualityJobDefinitionRequest extends StObject {
  
  /**
    * The name of the model quality monitoring job definition to delete.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
}
object DeleteModelQualityJobDefinitionRequest {
  
  inline def apply(JobDefinitionName: MonitoringJobDefinitionName): DeleteModelQualityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelQualityJobDefinitionRequest]
  }
  
  extension [Self <: DeleteModelQualityJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
  }
}
