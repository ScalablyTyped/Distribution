package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheckConfiguration extends StObject {
  
  /**
    * The number of consecutive checks that must succeed before App Runner decides that the service is healthy. Default: 1 
    */
  var HealthyThreshold: js.UndefOr[HealthCheckHealthyThreshold] = js.undefined
  
  /**
    * The time interval, in seconds, between health checks. Default: 5 
    */
  var Interval: js.UndefOr[HealthCheckInterval] = js.undefined
  
  /**
    * The URL that health check requests are sent to.  Path is only applicable when you set Protocol to HTTP. Default: "/" 
    */
  var Path: js.UndefOr[HealthCheckPath] = js.undefined
  
  /**
    * The IP protocol that App Runner uses to perform health checks for your service. If you set Protocol to HTTP, App Runner sends health check requests to the HTTP path specified by Path. Default: TCP 
    */
  var Protocol: js.UndefOr[HealthCheckProtocol] = js.undefined
  
  /**
    * The time, in seconds, to wait for a health check response before deciding it failed. Default: 2 
    */
  var Timeout: js.UndefOr[HealthCheckTimeout] = js.undefined
  
  /**
    * The number of consecutive checks that must fail before App Runner decides that the service is unhealthy. Default: 5 
    */
  var UnhealthyThreshold: js.UndefOr[HealthCheckUnhealthyThreshold] = js.undefined
}
object HealthCheckConfiguration {
  
  inline def apply(): HealthCheckConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckConfiguration]
  }
  
  extension [Self <: HealthCheckConfiguration](x: Self) {
    
    inline def setHealthyThreshold(value: HealthCheckHealthyThreshold): Self = StObject.set(x, "HealthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setHealthyThresholdUndefined: Self = StObject.set(x, "HealthyThreshold", js.undefined)
    
    inline def setInterval(value: HealthCheckInterval): Self = StObject.set(x, "Interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "Interval", js.undefined)
    
    inline def setPath(value: HealthCheckPath): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setProtocol(value: HealthCheckProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setTimeout(value: HealthCheckTimeout): Self = StObject.set(x, "Timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "Timeout", js.undefined)
    
    inline def setUnhealthyThreshold(value: HealthCheckUnhealthyThreshold): Self = StObject.set(x, "UnhealthyThreshold", value.asInstanceOf[js.Any])
    
    inline def setUnhealthyThresholdUndefined: Self = StObject.set(x, "UnhealthyThreshold", js.undefined)
  }
}
