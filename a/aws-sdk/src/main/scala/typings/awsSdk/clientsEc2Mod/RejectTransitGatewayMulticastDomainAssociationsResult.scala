package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectTransitGatewayMulticastDomainAssociationsResult extends StObject {
  
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.undefined
}
object RejectTransitGatewayMulticastDomainAssociationsResult {
  
  inline def apply(): RejectTransitGatewayMulticastDomainAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RejectTransitGatewayMulticastDomainAssociationsResult]
  }
  
  extension [Self <: RejectTransitGatewayMulticastDomainAssociationsResult](x: Self) {
    
    inline def setAssociations(value: TransitGatewayMulticastDomainAssociations): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
  }
}
