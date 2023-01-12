package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinResourceTypeEventConfiguration extends StObject {
  
  /**
    * Join resource type event configuration object for enabling or disabling LoRaWAN related event topics.
    */
  var LoRaWAN: js.UndefOr[LoRaWANJoinResourceTypeEventConfiguration] = js.undefined
}
object JoinResourceTypeEventConfiguration {
  
  inline def apply(): JoinResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinResourceTypeEventConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinResourceTypeEventConfiguration] (val x: Self) extends AnyVal {
    
    inline def setLoRaWAN(value: LoRaWANJoinResourceTypeEventConfiguration): Self = StObject.set(x, "LoRaWAN", value.asInstanceOf[js.Any])
    
    inline def setLoRaWANUndefined: Self = StObject.set(x, "LoRaWAN", js.undefined)
  }
}
