package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTransitGatewayPrefixListReferenceResult extends StObject {
  
  /**
    * Information about the prefix list reference.
    */
  var TransitGatewayPrefixListReference: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayPrefixListReference] = js.undefined
}
object ModifyTransitGatewayPrefixListReferenceResult {
  
  inline def apply(): ModifyTransitGatewayPrefixListReferenceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTransitGatewayPrefixListReferenceResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyTransitGatewayPrefixListReferenceResult] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayPrefixListReference(value: TransitGatewayPrefixListReference): Self = StObject.set(x, "TransitGatewayPrefixListReference", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPrefixListReferenceUndefined: Self = StObject.set(x, "TransitGatewayPrefixListReference", js.undefined)
  }
}
