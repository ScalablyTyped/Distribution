package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopDiscovererResponse extends StObject {
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the discoverer.
    */
  var State: js.UndefOr[DiscovererState] = js.undefined
}
object StopDiscovererResponse {
  
  inline def apply(): StopDiscovererResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDiscovererResponse]
  }
  
  extension [Self <: StopDiscovererResponse](x: Self) {
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
    
    inline def setDiscovererIdUndefined: Self = StObject.set(x, "DiscovererId", js.undefined)
    
    inline def setState(value: DiscovererState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
