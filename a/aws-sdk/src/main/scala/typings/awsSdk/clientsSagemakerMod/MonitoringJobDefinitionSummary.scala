package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringJobDefinitionSummary extends StObject {
  
  /**
    * The time that the monitoring job was created.
    */
  var CreationTime: js.Date
  
  /**
    * The name of the endpoint that the job monitors.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
  
  /**
    * The Amazon Resource Name (ARN) of the monitoring job.
    */
  var MonitoringJobDefinitionArn: typings.awsSdk.clientsSagemakerMod.MonitoringJobDefinitionArn
  
  /**
    * The name of the monitoring job.
    */
  var MonitoringJobDefinitionName: typings.awsSdk.clientsSagemakerMod.MonitoringJobDefinitionName
}
object MonitoringJobDefinitionSummary {
  
  inline def apply(
    CreationTime: js.Date,
    EndpointName: EndpointName,
    MonitoringJobDefinitionArn: MonitoringJobDefinitionArn,
    MonitoringJobDefinitionName: MonitoringJobDefinitionName
  ): MonitoringJobDefinitionSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], EndpointName = EndpointName.asInstanceOf[js.Any], MonitoringJobDefinitionArn = MonitoringJobDefinitionArn.asInstanceOf[js.Any], MonitoringJobDefinitionName = MonitoringJobDefinitionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringJobDefinitionSummary]
  }
  
  extension [Self <: MonitoringJobDefinitionSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionArn(value: MonitoringJobDefinitionArn): Self = StObject.set(x, "MonitoringJobDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "MonitoringJobDefinitionName", value.asInstanceOf[js.Any])
  }
}
