package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrunkInterfaceAssociation extends StObject {
  
  /**
    * The ID of the association.
    */
  var AssociationId: js.UndefOr[TrunkInterfaceAssociationId] = js.undefined
  
  /**
    * The ID of the branch network interface.
    */
  var BranchInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The application key when you use the GRE protocol.
    */
  var GreKey: js.UndefOr[Integer] = js.undefined
  
  /**
    * The interface protocol. Valid values are VLAN and GRE.
    */
  var InterfaceProtocol: js.UndefOr[InterfaceProtocolType] = js.undefined
  
  /**
    * The tags for the trunk interface association.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the trunk network interface.
    */
  var TrunkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VLAN when you use the VLAN protocol.
    */
  var VlanId: js.UndefOr[Integer] = js.undefined
}
object TrunkInterfaceAssociation {
  
  inline def apply(): TrunkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrunkInterfaceAssociation]
  }
  
  extension [Self <: TrunkInterfaceAssociation](x: Self) {
    
    inline def setAssociationId(value: TrunkInterfaceAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setBranchInterfaceId(value: String): Self = StObject.set(x, "BranchInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setBranchInterfaceIdUndefined: Self = StObject.set(x, "BranchInterfaceId", js.undefined)
    
    inline def setGreKey(value: Integer): Self = StObject.set(x, "GreKey", value.asInstanceOf[js.Any])
    
    inline def setGreKeyUndefined: Self = StObject.set(x, "GreKey", js.undefined)
    
    inline def setInterfaceProtocol(value: InterfaceProtocolType): Self = StObject.set(x, "InterfaceProtocol", value.asInstanceOf[js.Any])
    
    inline def setInterfaceProtocolUndefined: Self = StObject.set(x, "InterfaceProtocol", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrunkInterfaceId(value: String): Self = StObject.set(x, "TrunkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setTrunkInterfaceIdUndefined: Self = StObject.set(x, "TrunkInterfaceId", js.undefined)
    
    inline def setVlanId(value: Integer): Self = StObject.set(x, "VlanId", value.asInstanceOf[js.Any])
    
    inline def setVlanIdUndefined: Self = StObject.set(x, "VlanId", js.undefined)
  }
}
