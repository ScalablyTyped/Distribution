package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAccessPointPolicyStatusForObjectLambdaRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified Object Lambda Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The name of the Object Lambda Access Point.
    */
  var Name: ObjectLambdaAccessPointName
}
object GetAccessPointPolicyStatusForObjectLambdaRequest {
  
  inline def apply(AccountId: AccountId, Name: ObjectLambdaAccessPointName): GetAccessPointPolicyStatusForObjectLambdaRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAccessPointPolicyStatusForObjectLambdaRequest]
  }
  
  extension [Self <: GetAccessPointPolicyStatusForObjectLambdaRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ObjectLambdaAccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
