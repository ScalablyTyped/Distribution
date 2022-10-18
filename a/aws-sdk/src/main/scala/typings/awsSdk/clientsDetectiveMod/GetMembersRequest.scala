package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembersRequest extends StObject {
  
  /**
    * The list of Amazon Web Services account identifiers for the member account for which to return member details. You can request details for up to 50 member accounts at a time. You cannot use GetMembers to retrieve information about member accounts that were removed from the behavior graph.
    */
  var AccountIds: AccountIdList
  
  /**
    * The ARN of the behavior graph for which to request the member details.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object GetMembersRequest {
  
  inline def apply(AccountIds: AccountIdList, GraphArn: GraphArn): GetMembersRequest = {
    val __obj = js.Dynamic.literal(AccountIds = AccountIds.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersRequest]
  }
  
  extension [Self <: GetMembersRequest](x: Self) {
    
    inline def setAccountIds(value: AccountIdList): Self = StObject.set(x, "AccountIds", value.asInstanceOf[js.Any])
    
    inline def setAccountIdsVarargs(value: AccountId*): Self = StObject.set(x, "AccountIds", js.Array(value*))
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
