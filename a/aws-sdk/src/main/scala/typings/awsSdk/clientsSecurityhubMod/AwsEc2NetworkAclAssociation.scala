package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkAclAssociation extends StObject {
  
  /**
    * The identifier of the association between the network ACL and the subnet.
    */
  var NetworkAclAssociationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the network ACL.
    */
  var NetworkAclId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the subnet that is associated with the network ACL.
    */
  var SubnetId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2NetworkAclAssociation {
  
  inline def apply(): AwsEc2NetworkAclAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkAclAssociation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2NetworkAclAssociation] (val x: Self) extends AnyVal {
    
    inline def setNetworkAclAssociationId(value: NonEmptyString): Self = StObject.set(x, "NetworkAclAssociationId", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclAssociationIdUndefined: Self = StObject.set(x, "NetworkAclAssociationId", js.undefined)
    
    inline def setNetworkAclId(value: NonEmptyString): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclIdUndefined: Self = StObject.set(x, "NetworkAclId", js.undefined)
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
