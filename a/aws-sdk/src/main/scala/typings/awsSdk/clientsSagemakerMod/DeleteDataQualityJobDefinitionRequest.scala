package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataQualityJobDefinitionRequest extends StObject {
  
  /**
    * The name of the data quality monitoring job definition to delete.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
}
object DeleteDataQualityJobDefinitionRequest {
  
  inline def apply(JobDefinitionName: MonitoringJobDefinitionName): DeleteDataQualityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataQualityJobDefinitionRequest]
  }
  
  extension [Self <: DeleteDataQualityJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
  }
}
