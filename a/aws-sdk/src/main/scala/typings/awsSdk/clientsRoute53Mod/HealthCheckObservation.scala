package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HealthCheckObservation extends StObject {
  
  /**
    * The IP address of the Amazon Route 53 health checker that provided the failure reason in StatusReport.
    */
  var IPAddress: js.UndefOr[typings.awsSdk.clientsRoute53Mod.IPAddress] = js.undefined
  
  /**
    * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
    */
  var Region: js.UndefOr[HealthCheckRegion] = js.undefined
  
  /**
    * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the time of the failed health check.
    */
  var StatusReport: js.UndefOr[typings.awsSdk.clientsRoute53Mod.StatusReport] = js.undefined
}
object HealthCheckObservation {
  
  inline def apply(): HealthCheckObservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckObservation]
  }
  
  extension [Self <: HealthCheckObservation](x: Self) {
    
    inline def setIPAddress(value: IPAddress): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    inline def setRegion(value: HealthCheckRegion): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStatusReport(value: StatusReport): Self = StObject.set(x, "StatusReport", value.asInstanceOf[js.Any])
    
    inline def setStatusReportUndefined: Self = StObject.set(x, "StatusReport", js.undefined)
  }
}
