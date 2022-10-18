package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMembersResponse extends StObject {
  
  /**
    * A list of members.
    */
  var Members: typings.awsSdk.clientsGuarddutyMod.Members
  
  /**
    * A list of objects that contain the unprocessed account and a result string that explains why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsSdk.clientsGuarddutyMod.UnprocessedAccounts
}
object GetMembersResponse {
  
  inline def apply(Members: Members, UnprocessedAccounts: UnprocessedAccounts): GetMembersResponse = {
    val __obj = js.Dynamic.literal(Members = Members.asInstanceOf[js.Any], UnprocessedAccounts = UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMembersResponse]
  }
  
  extension [Self <: GetMembersResponse](x: Self) {
    
    inline def setMembers(value: Members): Self = StObject.set(x, "Members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: Member*): Self = StObject.set(x, "Members", js.Array(value*))
    
    inline def setUnprocessedAccounts(value: UnprocessedAccounts): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value*))
  }
}
