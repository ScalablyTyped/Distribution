package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDataQualityJobDefinitionRequest extends StObject {
  
  /**
    * The name of the data quality monitoring job definition to describe.
    */
  var JobDefinitionName: MonitoringJobDefinitionName
}
object DescribeDataQualityJobDefinitionRequest {
  
  inline def apply(JobDefinitionName: MonitoringJobDefinitionName): DescribeDataQualityJobDefinitionRequest = {
    val __obj = js.Dynamic.literal(JobDefinitionName = JobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDataQualityJobDefinitionRequest]
  }
  
  extension [Self <: DescribeDataQualityJobDefinitionRequest](x: Self) {
    
    inline def setJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "JobDefinitionName", value.asInstanceOf[js.Any])
  }
}
