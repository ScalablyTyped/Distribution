package typings.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableHostedZoneDNSSECRequest extends StObject {
  
  /**
    * A unique string used to identify a hosted zone.
    */
  var HostedZoneId: ResourceId
}
object DisableHostedZoneDNSSECRequest {
  
  inline def apply(HostedZoneId: ResourceId): DisableHostedZoneDNSSECRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableHostedZoneDNSSECRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableHostedZoneDNSSECRequest] (val x: Self) extends AnyVal {
    
    inline def setHostedZoneId(value: ResourceId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
  }
}
