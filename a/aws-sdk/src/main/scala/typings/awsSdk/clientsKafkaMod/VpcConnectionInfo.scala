package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcConnectionInfo extends StObject {
  
  /**
    * 
    The time when Amazon MSK creates the VPC Connnection.
    
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * 
    The owner of the VPC Connection.
    
    */
  var Owner: js.UndefOr[string] = js.undefined
  
  /**
    * 
    Description of the requester that calls the API operation.
    
    */
  var UserIdentity: js.UndefOr[typings.awsSdk.clientsKafkaMod.UserIdentity] = js.undefined
  
  /**
    * 
    The Amazon Resource Name (ARN) of the VPC connection.
    
    */
  var VpcConnectionArn: js.UndefOr[string] = js.undefined
}
object VpcConnectionInfo {
  
  inline def apply(): VpcConnectionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcConnectionInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VpcConnectionInfo] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setOwner(value: string): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setUserIdentity(value: UserIdentity): Self = StObject.set(x, "UserIdentity", value.asInstanceOf[js.Any])
    
    inline def setUserIdentityUndefined: Self = StObject.set(x, "UserIdentity", js.undefined)
    
    inline def setVpcConnectionArn(value: string): Self = StObject.set(x, "VpcConnectionArn", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectionArnUndefined: Self = StObject.set(x, "VpcConnectionArn", js.undefined)
  }
}
