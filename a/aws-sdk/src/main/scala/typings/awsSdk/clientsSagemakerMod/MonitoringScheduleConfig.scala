package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringScheduleConfig extends StObject {
  
  /**
    * Defines the monitoring job.
    */
  var MonitoringJobDefinition: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringJobDefinition] = js.undefined
  
  /**
    * The name of the monitoring job definition to schedule.
    */
  var MonitoringJobDefinitionName: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringJobDefinitionName] = js.undefined
  
  /**
    * The type of the monitoring job definition to schedule.
    */
  var MonitoringType: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MonitoringType] = js.undefined
  
  /**
    * Configures the monitoring schedule.
    */
  var ScheduleConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ScheduleConfig] = js.undefined
}
object MonitoringScheduleConfig {
  
  inline def apply(): MonitoringScheduleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringScheduleConfig]
  }
  
  extension [Self <: MonitoringScheduleConfig](x: Self) {
    
    inline def setMonitoringJobDefinition(value: MonitoringJobDefinition): Self = StObject.set(x, "MonitoringJobDefinition", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionName(value: MonitoringJobDefinitionName): Self = StObject.set(x, "MonitoringJobDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setMonitoringJobDefinitionNameUndefined: Self = StObject.set(x, "MonitoringJobDefinitionName", js.undefined)
    
    inline def setMonitoringJobDefinitionUndefined: Self = StObject.set(x, "MonitoringJobDefinition", js.undefined)
    
    inline def setMonitoringType(value: MonitoringType): Self = StObject.set(x, "MonitoringType", value.asInstanceOf[js.Any])
    
    inline def setMonitoringTypeUndefined: Self = StObject.set(x, "MonitoringType", js.undefined)
    
    inline def setScheduleConfig(value: ScheduleConfig): Self = StObject.set(x, "ScheduleConfig", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfigUndefined: Self = StObject.set(x, "ScheduleConfig", js.undefined)
  }
}
