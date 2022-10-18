package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTransitGatewayPolicyTableAssociationsResult extends StObject {
  
  /**
    * Returns details about the transit gateway policy table association.
    */
  var Associations: js.UndefOr[TransitGatewayPolicyTableAssociationList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetTransitGatewayPolicyTableAssociationsResult {
  
  inline def apply(): GetTransitGatewayPolicyTableAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTransitGatewayPolicyTableAssociationsResult]
  }
  
  extension [Self <: GetTransitGatewayPolicyTableAssociationsResult](x: Self) {
    
    inline def setAssociations(value: TransitGatewayPolicyTableAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: TransitGatewayPolicyTableAssociation*): Self = StObject.set(x, "Associations", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
