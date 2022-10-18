package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayPrefixListReferenceResult extends StObject {
  
  /**
    * Information about the deleted prefix list reference.
    */
  var TransitGatewayPrefixListReference: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayPrefixListReference] = js.undefined
}
object DeleteTransitGatewayPrefixListReferenceResult {
  
  inline def apply(): DeleteTransitGatewayPrefixListReferenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayPrefixListReferenceResult]
  }
  
  extension [Self <: DeleteTransitGatewayPrefixListReferenceResult](x: Self) {
    
    inline def setTransitGatewayPrefixListReference(value: TransitGatewayPrefixListReference): Self = StObject.set(x, "TransitGatewayPrefixListReference", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPrefixListReferenceUndefined: Self = StObject.set(x, "TransitGatewayPrefixListReference", js.undefined)
  }
}
