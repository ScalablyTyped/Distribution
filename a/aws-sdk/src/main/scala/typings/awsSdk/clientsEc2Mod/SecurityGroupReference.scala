package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupReference extends StObject {
  
  /**
    * The ID of your security group.
    */
  var GroupId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC with the referencing security group.
    */
  var ReferencingVpcId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}
object SecurityGroupReference {
  
  inline def apply(): SecurityGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGroupReference] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setReferencingVpcId(value: String): Self = StObject.set(x, "ReferencingVpcId", value.asInstanceOf[js.Any])
    
    inline def setReferencingVpcIdUndefined: Self = StObject.set(x, "ReferencingVpcId", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "VpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "VpcPeeringConnectionId", js.undefined)
  }
}
