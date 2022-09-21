package typings.awsSdk.apprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcConnectorRequest extends StObject {
  
  /**
    * A list of IDs of security groups that App Runner should use for access to Amazon Web Services resources under the specified subnets. If not specified, App Runner uses the default security group of the Amazon VPC. The default security group allows all outbound traffic.
    */
  var SecurityGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * A list of IDs of subnets that App Runner should use when it associates your service with a custom Amazon VPC. Specify IDs of subnets of a single Amazon VPC. App Runner determines the Amazon VPC from the subnets you specify.   App Runner currently only provides support for IPv4.  
    */
  var Subnets: StringList
  
  /**
    * A list of metadata items that you can associate with your VPC connector resource. A tag is a key-value pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A name for the VPC connector.
    */
  var VpcConnectorName: typings.awsSdk.apprunnerMod.VpcConnectorName
}
object CreateVpcConnectorRequest {
  
  inline def apply(Subnets: StringList, VpcConnectorName: VpcConnectorName): CreateVpcConnectorRequest = {
    val __obj = js.Dynamic.literal(Subnets = Subnets.asInstanceOf[js.Any], VpcConnectorName = VpcConnectorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcConnectorRequest]
  }
  
  extension [Self <: CreateVpcConnectorRequest](x: Self) {
    
    inline def setSecurityGroups(value: StringList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: String*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setSubnets(value: StringList): Self = StObject.set(x, "Subnets", value.asInstanceOf[js.Any])
    
    inline def setSubnetsVarargs(value: String*): Self = StObject.set(x, "Subnets", js.Array(value*))
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcConnectorName(value: VpcConnectorName): Self = StObject.set(x, "VpcConnectorName", value.asInstanceOf[js.Any])
  }
}
