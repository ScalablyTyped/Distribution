package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcConnectionRequest extends StObject {
  
  /**
    * 
    The authentication type of VPC connection.
    
    */
  var Authentication: string
  
  /**
    * 
    The list of client subnets.
    
    */
  var ClientSubnets: listOfString
  
  /**
    * 
    The list of security groups.
    
    */
  var SecurityGroups: listOfString
  
  /**
    * 
    A map of tags for the VPC connection.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * 
    The cluster Amazon Resource Name (ARN) for the VPC connection.
    
    */
  var TargetClusterArn: string
  
  /**
    * 
    The VPC ID of VPC connection.
    
    */
  var VpcId: string
}
object CreateVpcConnectionRequest {
  
  inline def apply(
    Authentication: string,
    ClientSubnets: listOfString,
    SecurityGroups: listOfString,
    TargetClusterArn: string,
    VpcId: string
  ): CreateVpcConnectionRequest = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], ClientSubnets = ClientSubnets.asInstanceOf[js.Any], SecurityGroups = SecurityGroups.asInstanceOf[js.Any], TargetClusterArn = TargetClusterArn.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcConnectionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcConnectionRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthentication(value: string): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setClientSubnets(value: listOfString): Self = StObject.set(x, "ClientSubnets", value.asInstanceOf[js.Any])
    
    inline def setClientSubnetsVarargs(value: string*): Self = StObject.set(x, "ClientSubnets", js.Array(value*))
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargetClusterArn(value: string): Self = StObject.set(x, "TargetClusterArn", value.asInstanceOf[js.Any])
    
    inline def setVpcId(value: string): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
  }
}
