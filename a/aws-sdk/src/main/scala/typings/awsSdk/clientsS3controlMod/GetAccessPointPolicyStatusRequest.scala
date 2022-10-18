package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyStatusRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified access point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The name of the access point whose policy status you want to retrieve.
    */
  var Name: AccessPointName
}
object GetAccessPointPolicyStatusRequest {
  
  inline def apply(AccountId: AccountId, Name: AccessPointName): GetAccessPointPolicyStatusRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointPolicyStatusRequest]
  }
  
  extension [Self <: GetAccessPointPolicyStatusRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
