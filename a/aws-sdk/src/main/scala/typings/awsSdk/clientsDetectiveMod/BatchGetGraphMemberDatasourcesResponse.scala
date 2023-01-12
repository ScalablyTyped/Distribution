package typings.awsSdk.clientsDetectiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetGraphMemberDatasourcesResponse extends StObject {
  
  /**
    * Details on the status of data source packages for members of the behavior graph.
    */
  var MemberDatasources: js.UndefOr[MembershipDatasourcesList] = js.undefined
  
  /**
    * Accounts that data source package information could not be retrieved for.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccountList] = js.undefined
}
object BatchGetGraphMemberDatasourcesResponse {
  
  inline def apply(): BatchGetGraphMemberDatasourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetGraphMemberDatasourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetGraphMemberDatasourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setMemberDatasources(value: MembershipDatasourcesList): Self = StObject.set(x, "MemberDatasources", value.asInstanceOf[js.Any])
    
    inline def setMemberDatasourcesUndefined: Self = StObject.set(x, "MemberDatasources", js.undefined)
    
    inline def setMemberDatasourcesVarargs(value: MembershipDatasources*): Self = StObject.set(x, "MemberDatasources", js.Array(value*))
    
    inline def setUnprocessedAccounts(value: UnprocessedAccountList): Self = StObject.set(x, "UnprocessedAccounts", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedAccountsUndefined: Self = StObject.set(x, "UnprocessedAccounts", js.undefined)
    
    inline def setUnprocessedAccountsVarargs(value: UnprocessedAccount*): Self = StObject.set(x, "UnprocessedAccounts", js.Array(value*))
  }
}
