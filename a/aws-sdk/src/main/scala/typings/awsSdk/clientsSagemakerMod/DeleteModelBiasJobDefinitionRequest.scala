package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteModelBiasJobDefinitionRequest extends StObject {
  
  /**
    * The name of the model bias job definition to delete.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
}
object DeleteModelBiasJobDefinitionRequest {
  
  inline def apply(JobDefinitionName: MonitoringJobDefinitionName): DeleteModelBiasJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteModelBiasJobDefinitionRequest]
  }
  
  extension [Self <: DeleteModelBiasJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
  }
}
