package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneAwarenessConfig extends StObject {
  
  /**
    * If you enabled multiple Availability Zones, this value is the number of zones that you want the domain to use. Valid values are 2 and 3. If your domain is provisioned within a VPC, this value be equal to number of subnets.
    */
  var AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.undefined
}
object ZoneAwarenessConfig {
  
  inline def apply(): ZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneAwarenessConfig]
  }
  
  extension [Self <: ZoneAwarenessConfig](x: Self) {
    
    inline def setAvailabilityZoneCount(value: IntegerClass): Self = StObject.set(x, "AvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "AvailabilityZoneCount", js.undefined)
  }
}
