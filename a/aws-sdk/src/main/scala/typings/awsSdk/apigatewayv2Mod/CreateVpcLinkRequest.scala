package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcLinkRequest extends StObject {
  
  /**
    * The name of the VPC link.
    */
  var Name: StringWithLengthBetween1And128
  
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: SubnetIdList
  
  /**
    * A list of tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.undefined
}
object CreateVpcLinkRequest {
  
  @scala.inline
  def apply(Name: StringWithLengthBetween1And128, SubnetIds: SubnetIdList): CreateVpcLinkRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SubnetIds = SubnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcLinkRequest]
  }
  
  @scala.inline
  implicit class CreateVpcLinkRequestMutableBuilder[Self <: CreateVpcLinkRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
