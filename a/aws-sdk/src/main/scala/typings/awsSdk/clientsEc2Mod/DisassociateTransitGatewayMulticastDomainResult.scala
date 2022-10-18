package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateTransitGatewayMulticastDomainResult extends StObject {
  
  /**
    * Information about the association.
    */
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.undefined
}
object DisassociateTransitGatewayMulticastDomainResult {
  
  inline def apply(): DisassociateTransitGatewayMulticastDomainResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateTransitGatewayMulticastDomainResult]
  }
  
  extension [Self <: DisassociateTransitGatewayMulticastDomainResult](x: Self) {
    
    inline def setAssociations(value: TransitGatewayMulticastDomainAssociations): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
  }
}
