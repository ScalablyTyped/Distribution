package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneAwarenessConfig extends StObject {
  
  /**
    * An integer value to indicate the number of availability zones for a domain when zone awareness is enabled. This should be equal to number of subnets if VPC endpoints is enabled
    */
  var AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.undefined
}
object ZoneAwarenessConfig {
  
  inline def apply(): ZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneAwarenessConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoneAwarenessConfig] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityZoneCount(value: IntegerClass): Self = StObject.set(x, "AvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "AvailabilityZoneCount", js.undefined)
  }
}
