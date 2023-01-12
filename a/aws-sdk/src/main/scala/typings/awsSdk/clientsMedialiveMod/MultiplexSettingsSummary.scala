package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexSettingsSummary extends StObject {
  
  /**
    * Transport stream bit rate.
    */
  var TransportStreamBitrate: js.UndefOr[integerMin1000000Max100000000] = js.undefined
}
object MultiplexSettingsSummary {
  
  inline def apply(): MultiplexSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexSettingsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiplexSettingsSummary] (val x: Self) extends AnyVal {
    
    inline def setTransportStreamBitrate(value: integerMin1000000Max100000000): Self = StObject.set(x, "TransportStreamBitrate", value.asInstanceOf[js.Any])
    
    inline def setTransportStreamBitrateUndefined: Self = StObject.set(x, "TransportStreamBitrate", js.undefined)
  }
}
