package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEnvironmentHealthResult extends StObject {
  
  /**
    * Application request metrics for the environment.
    */
  var ApplicationMetrics: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.ApplicationMetrics] = js.undefined
  
  /**
    * Descriptions of the data that contributed to the environment's current health status.
    */
  var Causes: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.Causes] = js.undefined
  
  /**
    * The health color of the environment.
    */
  var Color: js.UndefOr[String] = js.undefined
  
  /**
    * The environment's name.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * The health status of the environment. For example, Ok.
    */
  var HealthStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Summary health information for the instances in the environment.
    */
  var InstancesHealth: js.UndefOr[InstanceHealthSummary] = js.undefined
  
  /**
    * The date and time that the health information was retrieved.
    */
  var RefreshedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The environment's operational status. Ready, Launching, Updating, Terminating, or Terminated.
    */
  var Status: js.UndefOr[EnvironmentHealth] = js.undefined
}
object DescribeEnvironmentHealthResult {
  
  inline def apply(): DescribeEnvironmentHealthResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEnvironmentHealthResult]
  }
  
  extension [Self <: DescribeEnvironmentHealthResult](x: Self) {
    
    inline def setApplicationMetrics(value: ApplicationMetrics): Self = StObject.set(x, "ApplicationMetrics", value.asInstanceOf[js.Any])
    
    inline def setApplicationMetricsUndefined: Self = StObject.set(x, "ApplicationMetrics", js.undefined)
    
    inline def setCauses(value: Causes): Self = StObject.set(x, "Causes", value.asInstanceOf[js.Any])
    
    inline def setCausesUndefined: Self = StObject.set(x, "Causes", js.undefined)
    
    inline def setCausesVarargs(value: Cause*): Self = StObject.set(x, "Causes", js.Array(value*))
    
    inline def setColor(value: String): Self = StObject.set(x, "Color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "Color", js.undefined)
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setHealthStatus(value: String): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    inline def setHealthStatusUndefined: Self = StObject.set(x, "HealthStatus", js.undefined)
    
    inline def setInstancesHealth(value: InstanceHealthSummary): Self = StObject.set(x, "InstancesHealth", value.asInstanceOf[js.Any])
    
    inline def setInstancesHealthUndefined: Self = StObject.set(x, "InstancesHealth", js.undefined)
    
    inline def setRefreshedAt(value: js.Date): Self = StObject.set(x, "RefreshedAt", value.asInstanceOf[js.Any])
    
    inline def setRefreshedAtUndefined: Self = StObject.set(x, "RefreshedAt", js.undefined)
    
    inline def setStatus(value: EnvironmentHealth): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
