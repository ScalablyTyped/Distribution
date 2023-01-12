package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkAclDetails extends StObject {
  
  /**
    * Associations between the network ACL and subnets.
    */
  var Associations: js.UndefOr[AwsEc2NetworkAclAssociationList] = js.undefined
  
  /**
    * The set of rules in the network ACL.
    */
  var Entries: js.UndefOr[AwsEc2NetworkAclEntryList] = js.undefined
  
  /**
    * Whether this is the default network ACL for the VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the network ACL.
    */
  var NetworkAclId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the Amazon Web Services account that owns the network ACL.
    */
  var OwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the VPC for the network ACL.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2NetworkAclDetails {
  
  inline def apply(): AwsEc2NetworkAclDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkAclDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEc2NetworkAclDetails] (val x: Self) extends AnyVal {
    
    inline def setAssociations(value: AwsEc2NetworkAclAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: AwsEc2NetworkAclAssociation*): Self = StObject.set(x, "Associations", js.Array(value*))
    
    inline def setEntries(value: AwsEc2NetworkAclEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "Entries", js.undefined)
    
    inline def setEntriesVarargs(value: AwsEc2NetworkAclEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setNetworkAclId(value: NonEmptyString): Self = StObject.set(x, "NetworkAclId", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclIdUndefined: Self = StObject.set(x, "NetworkAclId", js.undefined)
    
    inline def setOwnerId(value: NonEmptyString): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
