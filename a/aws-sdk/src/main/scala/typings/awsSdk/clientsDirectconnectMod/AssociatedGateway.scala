package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedGateway extends StObject {
  
  /**
    * The ID of the associated gateway.
    */
  var id: js.UndefOr[GatewayIdentifier] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the associated virtual private gateway or transit gateway.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  
  /**
    * The Region where the associated gateway is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  
  /**
    * The type of associated gateway.
    */
  var `type`: js.UndefOr[GatewayType] = js.undefined
}
object AssociatedGateway {
  
  inline def apply(): AssociatedGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociatedGateway] (val x: Self) extends AnyVal {
    
    inline def setId(value: GatewayIdentifier): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOwnerAccount(value: OwnerAccount): Self = StObject.set(x, "ownerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "ownerAccount", js.undefined)
    
    inline def setRegion(value: Region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setType(value: GatewayType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
