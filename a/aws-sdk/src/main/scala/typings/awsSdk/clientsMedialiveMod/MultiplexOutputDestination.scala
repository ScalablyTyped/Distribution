package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexOutputDestination extends StObject {
  
  /**
    * Multiplex MediaConnect output destination settings.
    */
  var MediaConnectSettings: js.UndefOr[MultiplexMediaConnectOutputDestinationSettings] = js.undefined
}
object MultiplexOutputDestination {
  
  inline def apply(): MultiplexOutputDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexOutputDestination]
  }
  
  extension [Self <: MultiplexOutputDestination](x: Self) {
    
    inline def setMediaConnectSettings(value: MultiplexMediaConnectOutputDestinationSettings): Self = StObject.set(x, "MediaConnectSettings", value.asInstanceOf[js.Any])
    
    inline def setMediaConnectSettingsUndefined: Self = StObject.set(x, "MediaConnectSettings", js.undefined)
  }
}
