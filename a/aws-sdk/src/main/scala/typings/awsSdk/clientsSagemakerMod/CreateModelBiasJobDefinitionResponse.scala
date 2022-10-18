package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelBiasJobDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model bias job.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
}
object CreateModelBiasJobDefinitionResponse {
  
  inline def apply(JobDefinitionArn: MonitoringJobDefinitionArn): CreateModelBiasJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelBiasJobDefinitionResponse]
  }
  
  extension [Self <: CreateModelBiasJobDefinitionResponse](x: Self) {
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
  }
}
