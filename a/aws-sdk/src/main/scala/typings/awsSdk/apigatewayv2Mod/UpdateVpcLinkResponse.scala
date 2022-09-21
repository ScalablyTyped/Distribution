package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVpcLinkResponse extends StObject {
  
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the VPC link.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.undefined
  
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.undefined
  
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.undefined
  
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: js.UndefOr[Id] = js.undefined
  
  /**
    * The status of the VPC link.
    */
  var VpcLinkStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkStatus] = js.undefined
  
  /**
    * A message summarizing the cause of the status of the VPC link.
    */
  var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * The version of the VPC link.
    */
  var VpcLinkVersion: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkVersion] = js.undefined
}
object UpdateVpcLinkResponse {
  
  inline def apply(): UpdateVpcLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVpcLinkResponse]
  }
  
  extension [Self <: UpdateVpcLinkResponse](x: Self) {
    
    inline def setCreatedDate(value: js.Date): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIdList): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: string*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSubnetIds(value: SubnetIdList): Self = StObject.set(x, "SubnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsUndefined: Self = StObject.set(x, "SubnetIds", js.undefined)
    
    inline def setSubnetIdsVarargs(value: string*): Self = StObject.set(x, "SubnetIds", js.Array(value*))
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVpcLinkId(value: Id): Self = StObject.set(x, "VpcLinkId", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkIdUndefined: Self = StObject.set(x, "VpcLinkId", js.undefined)
    
    inline def setVpcLinkStatus(value: VpcLinkStatus): Self = StObject.set(x, "VpcLinkStatus", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkStatusMessage(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "VpcLinkStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkStatusMessageUndefined: Self = StObject.set(x, "VpcLinkStatusMessage", js.undefined)
    
    inline def setVpcLinkStatusUndefined: Self = StObject.set(x, "VpcLinkStatus", js.undefined)
    
    inline def setVpcLinkVersion(value: VpcLinkVersion): Self = StObject.set(x, "VpcLinkVersion", value.asInstanceOf[js.Any])
    
    inline def setVpcLinkVersionUndefined: Self = StObject.set(x, "VpcLinkVersion", js.undefined)
  }
}
