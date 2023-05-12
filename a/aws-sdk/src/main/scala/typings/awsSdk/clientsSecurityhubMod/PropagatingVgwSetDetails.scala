package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropagatingVgwSetDetails extends StObject {
  
  /**
    *  The ID of the virtual private gateway. 
    */
  var GatewayId: js.UndefOr[NonEmptyString] = js.undefined
}
object PropagatingVgwSetDetails {
  
  inline def apply(): PropagatingVgwSetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropagatingVgwSetDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropagatingVgwSetDetails] (val x: Self) extends AnyVal {
    
    inline def setGatewayId(value: NonEmptyString): Self = StObject.set(x, "GatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "GatewayId", js.undefined)
  }
}
