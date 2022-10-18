package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackingConfig extends StObject {
  
  /**
    * Current setting for autotrack.
    */
  var autotrack: Criticality
}
object TrackingConfig {
  
  inline def apply(autotrack: Criticality): TrackingConfig = {
    val __obj = js.Dynamic.literal(autotrack = autotrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackingConfig]
  }
  
  extension [Self <: TrackingConfig](x: Self) {
    
    inline def setAutotrack(value: Criticality): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
  }
}
