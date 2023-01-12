package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceRegistrationStateResourceTypeEventConfiguration extends StObject {
  
  /**
    * Device registration resource type state event configuration object for enabling or disabling Sidewalk related event topics.
    */
  var Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration] = js.undefined
}
object DeviceRegistrationStateResourceTypeEventConfiguration {
  
  inline def apply(): DeviceRegistrationStateResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRegistrationStateResourceTypeEventConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceRegistrationStateResourceTypeEventConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSidewalk(value: SidewalkResourceTypeEventConfiguration): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
