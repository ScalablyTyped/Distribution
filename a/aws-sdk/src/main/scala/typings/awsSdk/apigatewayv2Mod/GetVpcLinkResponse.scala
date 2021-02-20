package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVpcLinkResponse extends StObject {
  
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  
  /**
    * The name of the VPC link.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.native
  
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.native
  
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: js.UndefOr[Id] = js.native
  
  /**
    * The status of the VPC link.
    */
  var VpcLinkStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkStatus] = js.native
  
  /**
    * A message summarizing the cause of the status of the VPC link.
    */
  var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  
  /**
    * The version of the VPC link.
    */
  var VpcLinkVersion: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkVersion] = js.native
}
object GetVpcLinkResponse {
  
  @scala.inline
  def apply(): GetVpcLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcLinkResponse]
  }
  
  @scala.inline
  implicit class GetVpcLinkResponseMutableBuilder[Self <: GetVpcLinkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedDate(value: timestampIso8601): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setVpcLinkId(value: Id): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkIdUndefined: Self = StObject.set(x, "VpcLinkId", js.undefined)
    
    @scala.inline
    def setVpcLinkStatus(value: VpcLinkStatus): Self = StObject.set(x, "VpcLinkStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkStatusMessage(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "VpcLinkStatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkStatusMessageUndefined: Self = StObject.set(x, "VpcLinkStatusMessage", js.undefined)
    
    @scala.inline
    def setVpcLinkStatusUndefined: Self = StObject.set(x, "VpcLinkStatus", js.undefined)
    
    @scala.inline
    def setVpcLinkVersion(value: VpcLinkVersion): Self = StObject.set(x, "VpcLinkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcLinkVersionUndefined: Self = StObject.set(x, "VpcLinkVersion", js.undefined)
  }
}
