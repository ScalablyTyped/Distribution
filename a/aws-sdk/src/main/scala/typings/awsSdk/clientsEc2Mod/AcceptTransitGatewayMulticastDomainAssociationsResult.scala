package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptTransitGatewayMulticastDomainAssociationsResult extends StObject {
  
  /**
    * Information about the multicast domain associations.
    */
  var Associations: js.UndefOr[TransitGatewayMulticastDomainAssociations] = js.undefined
}
object AcceptTransitGatewayMulticastDomainAssociationsResult {
  
  inline def apply(): AcceptTransitGatewayMulticastDomainAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcceptTransitGatewayMulticastDomainAssociationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AcceptTransitGatewayMulticastDomainAssociationsResult] (val x: Self) extends AnyVal {
    
    inline def setAssociations(value: TransitGatewayMulticastDomainAssociations): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
  }
}
