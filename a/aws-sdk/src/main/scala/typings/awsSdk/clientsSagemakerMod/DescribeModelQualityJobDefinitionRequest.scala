package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelQualityJobDefinitionRequest extends StObject {
  
  /**
    * The name of the model quality job. The name must be unique within an Amazon Web Services Region in the Amazon Web Services account.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
}
object DescribeModelQualityJobDefinitionRequest {
  
  inline def apply(JobDefinitionName: MonitoringJobDefinitionName): DescribeModelQualityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelQualityJobDefinitionRequest]
  }
  
  extension [Self <: DescribeModelQualityJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
  }
}
