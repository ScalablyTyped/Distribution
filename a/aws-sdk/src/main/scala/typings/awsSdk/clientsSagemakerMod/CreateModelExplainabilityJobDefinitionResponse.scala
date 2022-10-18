package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelExplainabilityJobDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model explainability job.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
}
object CreateModelExplainabilityJobDefinitionResponse {
  
  inline def apply(JobDefinitionArn: MonitoringJobDefinitionArn): CreateModelExplainabilityJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelExplainabilityJobDefinitionResponse]
  }
  
  extension [Self <: CreateModelExplainabilityJobDefinitionResponse](x: Self) {
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
  }
}
