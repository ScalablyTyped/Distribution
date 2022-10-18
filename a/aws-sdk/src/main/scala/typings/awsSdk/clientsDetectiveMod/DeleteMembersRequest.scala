package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMembersRequest extends StObject {
  
  /**
    * The list of Amazon Web Services account identifiers for the member accounts to remove from the behavior graph. You can remove up to 50 member accounts at a time.
    */
  var AccountIds: AccountIdList
  
  /**
    * The ARN of the behavior graph to remove members from.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object DeleteMembersRequest {
  
  inline def apply(AccountIds: AccountIdList, GraphArn: GraphArn): DeleteMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMembersRequest]
  }
  
  extension [Self <: DeleteMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
