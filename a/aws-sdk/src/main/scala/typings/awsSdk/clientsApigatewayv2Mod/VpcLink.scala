package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcLink extends StObject {
  
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the VPC link.
    */
  var Name: StringWithLengthBetween1And128
  
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: SecurityGroupIdList
  
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: SubnetIdList
  
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.Tags] = js.undefined
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: Id
  
  /**
    * The status of the VPC link.
    */
  var VpcLinkStatus: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.VpcLinkStatus] = js.undefined
  
  /**
    * A message summarizing the cause of the status of the VPC link.
    */
  var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * The version of the VPC link.
    */
  var VpcLinkVersion: js.UndefOr[typings.awsSdk.clientsApigatewayv2Mod.VpcLinkVersion] = js.undefined
}
object VpcLink {
  
  inline def apply(
    Name: StringWithLengthBetween1And128,
    SecurityGroupIds: SecurityGroupIdList,
    SubnetIds: SubnetIdList,
    VpcLinkId: Id
  ): VpcLink = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SecurityGroupIds = SecurityGroupIds.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any], VpcLinkId = VpcLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcLink] (val x: Self) extends AnyVal {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVpcLinkId(value: Id): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkStatus(value: VpcLinkStatus): Self = StObject.set(x, "VpcLinkStatus", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkStatusMessage(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "VpcLinkStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkStatusMessageUndefined: Self = StObject.set(x, "VpcLinkStatusMessage", js.undefined)
    
    inline def setVpcLinkStatusUndefined: Self = StObject.set(x, "VpcLinkStatus", js.undefined)
    
    inline def setVpcLinkVersion(value: VpcLinkVersion): Self = StObject.set(x, "VpcLinkVersion", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkVersionUndefined: Self = StObject.set(x, "VpcLinkVersion", js.undefined)
  }
}
