package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingleInstanceHealth extends StObject {
  
  /**
    * Request metrics from your application.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationMetrics] = js.undefined
  
  /**
    * The availability zone in which the instance runs.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the causes, which provide more information about the current health status.
    */
  var Causes: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Causes] = js.undefined
  
  /**
    * Represents the color indicator that gives you information about the health of the EC2 instance. For more information, see Health Colors and Statuses.
    */
  var Color: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the most recent deployment to an instance.
    */
  var Deployment: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Deployment] = js.undefined
  
  /**
    * Returns the health status of the specified instance. For more information, see Health Colors and Statuses.
    */
  var HealthStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon EC2 instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.InstanceId] = js.undefined
  
  /**
    * The instance's type.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the EC2 instance was launched.
    */
  var LaunchedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Operating system metrics from the instance.
    */
  var System: js.UndefOr[SystemStatus] = js.undefined
}
object SingleInstanceHealth {
  
  inline def apply(): SingleInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleInstanceHealth]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SingleInstanceHealth] (val x: Self) extends AnyVal {
    
    inline def setApplicationMetrics(value: ApplicationMetrics): Self = StObject.set(x, "ApplicationMetrics", value.asInstanceOf[js.Any])
    
    inline def setApplicationMetricsUndefined: Self = StObject.set(x, "ApplicationMetrics", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setCauses(value: Causes): Self = StObject.set(x, "Causes", value.asInstanceOf[js.Any])
    
    inline def setCausesUndefined: Self = StObject.set(x, "Causes", js.undefined)
    
    inline def setCausesVarargs(value: Cause*): Self = StObject.set(x, "Causes", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setDeployment(value: Deployment): Self = StObject.set(x, "Deployment", value.asInstanceOf[js.Any])
    
    inline def setDeploymentUndefined: Self = StObject.set(x, "Deployment", js.undefined)
    
    inline def setHealthStatus(value: String): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLaunchedAt(value: js.Date): Self = StObject.set(x, "LaunchedAt", value.asInstanceOf[js.Any])
    
    inline def setLaunchedAtUndefined: Self = StObject.set(x, "LaunchedAt", js.undefined)
    
    inline def setSystem(value: SystemStatus): Self = StObject.set(x, "System", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "System", js.undefined)
  }
}
