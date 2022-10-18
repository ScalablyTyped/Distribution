package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelQualityJobDefinitionResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the model quality monitoring job.
    */
  var JobDefinitionArn: MonitoringJobDefinitionArn
}
object CreateModelQualityJobDefinitionResponse {
  
  inline def apply(JobDefinitionArn: MonitoringJobDefinitionArn): CreateModelQualityJobDefinitionResponse = {
    val __obj = js.Dynamic.literal(JobDefinitionArn = JobDefinitionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelQualityJobDefinitionResponse]
  }
  
  extension [Self <: CreateModelQualityJobDefinitionResponse](x: Self) {
    
    inline def setJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "JobDefinitionArn", value.asInstanceOf[js.Any])
  }
}
