package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVpcConnectionResponse extends StObject {
  
  /**
    * 
    The authentication type of VPC connection.
    
    */
  var Authentication: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The list of client subnets.
    
    */
  var ClientSubnets: js.UndefOr[listOfString] = js.undefined
  
  /**
    * 
    The creation time of VPC connection.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    The list of security groups.
    
    */
  var SecurityGroups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * 
    The State of Vpc Connection.
    
    */
  var State: js.UndefOr[VpcConnectionState] = js.undefined
  
  /**
    * 
    A map of tags for the VPC connection.
    
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * 
    The VPC connection ARN.
    
    */
  var VpcConnectionArn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The VPC ID of the VPC connection.
    
    */
  var VpcId: js.UndefOr[string] = js.undefined
}
object CreateVpcConnectionResponse {
  
  inline def apply(): CreateVpcConnectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcConnectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVpcConnectionResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthentication(value: string): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setClientSubnets(value: listOfString): Self = StObject.set(x, "ClientSubnets", value.asInstanceOf[js.Any])
    
    inline def setClientSubnetsUndefined: Self = StObject.set(x, "ClientSubnets", js.undefined)
    
    inline def setClientSubnetsVarargs(value: string*): Self = StObject.set(x, "ClientSubnets", js.Array(value*))
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setSecurityGroups(value: listOfString): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: string*): Self = StObject.set(x, "SecurityGroups", js.Array(value*))
    
    inline def setState(value: VpcConnectionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setVpcConnectionArn(value: string): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectionArnUndefined: Self = StObject.set(x, "VpcConnectionArn", js.undefined)
    
    inline def setVpcId(value: string): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
