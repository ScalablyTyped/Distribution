package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorSummary extends StObject {
  
  /**
    * When the monitor resource was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time the monitor resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    STOPPED - When the resource stopped.    ACTIVE or CREATE_FAILED - When the monitor creation finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource.
    */
  var MonitorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the monitor resource.
    */
  var MonitorName: js.UndefOr[Name] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the predictor being monitored.
    */
  var ResourceArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The status of the monitor. States include:    ACTIVE     ACTIVE_STOPPING, ACTIVE_STOPPED     UPDATE_IN_PROGRESS     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED   
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
}
object MonitorSummary {
  
  inline def apply(): MonitorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorSummary]
  }
  
  extension [Self <: MonitorSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
    
    inline def setMonitorName(value: Name): Self = StObject.set(x, "MonitorName", value.asInstanceOf[js.Any])
    
    inline def setMonitorNameUndefined: Self = StObject.set(x, "MonitorName", js.undefined)
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
