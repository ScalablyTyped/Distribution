package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProximityResourceTypeEventConfiguration extends StObject {
  
  /**
    * Proximity resource type event configuration object for enabling and disabling wireless device topic.
    */
  var Sidewalk: js.UndefOr[SidewalkResourceTypeEventConfiguration] = js.undefined
}
object ProximityResourceTypeEventConfiguration {
  
  inline def apply(): ProximityResourceTypeEventConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProximityResourceTypeEventConfiguration]
  }
  
  extension [Self <: ProximityResourceTypeEventConfiguration](x: Self) {
    
    inline def setSidewalk(value: SidewalkResourceTypeEventConfiguration): Self = StObject.set(x, "Sidewalk", value.asInstanceOf[js.Any])
    
    inline def setSidewalkUndefined: Self = StObject.set(x, "Sidewalk", js.undefined)
  }
}
