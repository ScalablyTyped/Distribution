package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMonitoringMemberRequest extends StObject {
  
  /**
    * The account ID of the member account to try to enable. The account must be an invited member account with a status of ACCEPTED_BUT_DISABLED. 
    */
  var AccountId: typings.awsSdk.clientsDetectiveMod.AccountId
  
  /**
    * The ARN of the behavior graph.
    */
  var GraphArn: typings.awsSdk.clientsDetectiveMod.GraphArn
}
object StartMonitoringMemberRequest {
  
  inline def apply(AccountId: AccountId, GraphArn: GraphArn): StartMonitoringMemberRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], GraphArn = GraphArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMonitoringMemberRequest]
  }
  
  extension [Self <: StartMonitoringMemberRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setGraphArn(value: GraphArn): Self = StObject.set(x, "GraphArn", value.asInstanceOf[js.Any])
  }
}
