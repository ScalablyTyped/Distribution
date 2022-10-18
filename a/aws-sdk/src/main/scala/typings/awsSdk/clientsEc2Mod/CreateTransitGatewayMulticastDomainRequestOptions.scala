package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTransitGatewayMulticastDomainRequestOptions extends StObject {
  
  /**
    * Indicates whether to automatically accept cross-account subnet associations that are associated with the transit gateway multicast domain.
    */
  var AutoAcceptSharedAssociations: js.UndefOr[AutoAcceptSharedAssociationsValue] = js.undefined
  
  /**
    * Specify whether to enable Internet Group Management Protocol (IGMP) version 2 for the transit gateway multicast domain.
    */
  var Igmpv2Support: js.UndefOr[Igmpv2SupportValue] = js.undefined
  
  /**
    * Specify whether to enable support for statically configuring multicast group sources for a domain.
    */
  var StaticSourcesSupport: js.UndefOr[StaticSourcesSupportValue] = js.undefined
}
object CreateTransitGatewayMulticastDomainRequestOptions {
  
  inline def apply(): CreateTransitGatewayMulticastDomainRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayMulticastDomainRequestOptions]
  }
  
  extension [Self <: CreateTransitGatewayMulticastDomainRequestOptions](x: Self) {
    
    inline def setAutoAcceptSharedAssociations(value: AutoAcceptSharedAssociationsValue): Self = StObject.set(x, "AutoAcceptSharedAssociations", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptSharedAssociationsUndefined: Self = StObject.set(x, "AutoAcceptSharedAssociations", js.undefined)
    
    inline def setIgmpv2Support(value: Igmpv2SupportValue): Self = StObject.set(x, "Igmpv2Support", value.asInstanceOf[js.Any])
    
    inline def setIgmpv2SupportUndefined: Self = StObject.set(x, "Igmpv2Support", js.undefined)
    
    inline def setStaticSourcesSupport(value: StaticSourcesSupportValue): Self = StObject.set(x, "StaticSourcesSupport", value.asInstanceOf[js.Any])
    
    inline def setStaticSourcesSupportUndefined: Self = StObject.set(x, "StaticSourcesSupport", js.undefined)
  }
}
