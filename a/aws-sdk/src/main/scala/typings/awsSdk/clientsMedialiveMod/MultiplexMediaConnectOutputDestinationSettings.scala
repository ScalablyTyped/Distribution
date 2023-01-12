package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexMediaConnectOutputDestinationSettings extends StObject {
  
  /**
    * The MediaConnect entitlement ARN available as a Flow source.
    */
  var EntitlementArn: js.UndefOr[stringMin1] = js.undefined
}
object MultiplexMediaConnectOutputDestinationSettings {
  
  inline def apply(): MultiplexMediaConnectOutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexMediaConnectOutputDestinationSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiplexMediaConnectOutputDestinationSettings] (val x: Self) extends AnyVal {
    
    inline def setEntitlementArn(value: stringMin1): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
  }
}
