package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeregisterTransitGatewayMulticastGroupSourcesResult extends StObject {
  
  /**
    * Information about the deregistered group sources.
    */
  var DeregisteredMulticastGroupSources: js.UndefOr[TransitGatewayMulticastDeregisteredGroupSources] = js.undefined
}
object DeregisterTransitGatewayMulticastGroupSourcesResult {
  
  inline def apply(): DeregisterTransitGatewayMulticastGroupSourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterTransitGatewayMulticastGroupSourcesResult]
  }
  
  extension [Self <: DeregisterTransitGatewayMulticastGroupSourcesResult](x: Self) {
    
    inline def setDeregisteredMulticastGroupSources(value: TransitGatewayMulticastDeregisteredGroupSources): Self = StObject.set(x, "DeregisteredMulticastGroupSources", value.asInstanceOf[js.Any])
    
    inline def setDeregisteredMulticastGroupSourcesUndefined: Self = StObject.set(x, "DeregisteredMulticastGroupSources", js.undefined)
  }
}
