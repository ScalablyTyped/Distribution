package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDiscovererRequest extends StObject {
  
  /**
    * Support discovery of schemas in events sent to the bus from another account. (default: true)
    */
  var CrossAccount: js.UndefOr[boolean] = js.undefined
  
  /**
    * The description of the discoverer to update.
    */
  var Description: js.UndefOr[stringMin0Max256] = js.undefined
  
  /**
    * The ID of the discoverer.
    */
  var DiscovererId: string
}
object UpdateDiscovererRequest {
  
  inline def apply(DiscovererId: string): UpdateDiscovererRequest = {
    val __obj = js.Dynamic.literal(DiscovererId = DiscovererId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDiscovererRequest]
  }
  
  extension [Self <: UpdateDiscovererRequest](x: Self) {
    
    inline def setCrossAccount(value: boolean): Self = StObject.set(x, "CrossAccount", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountUndefined: Self = StObject.set(x, "CrossAccount", js.undefined)
    
    inline def setDescription(value: stringMin0Max256): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDiscovererId(value: string): Self = StObject.set(x, "DiscovererId", value.asInstanceOf[js.Any])
  }
}
