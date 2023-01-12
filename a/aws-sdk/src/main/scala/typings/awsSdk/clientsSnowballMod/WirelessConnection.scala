package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WirelessConnection extends StObject {
  
  /**
    * Enables the Wi-Fi adapter on an Snowcone device.
    */
  var IsWifiEnabled: js.UndefOr[Boolean] = js.undefined
}
object WirelessConnection {
  
  inline def apply(): WirelessConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WirelessConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WirelessConnection] (val x: Self) extends AnyVal {
    
    inline def setIsWifiEnabled(value: Boolean): Self = StObject.set(x, "IsWifiEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsWifiEnabledUndefined: Self = StObject.set(x, "IsWifiEnabled", js.undefined)
  }
}
