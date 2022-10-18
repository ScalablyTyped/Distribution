package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUserImportJobsResponse extends StObject {
  
  /**
    * An identifier that can be used to return the next set of user import jobs in the list.
    */
  var PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
  
  /**
    * The user import jobs.
    */
  var UserImportJobs: js.UndefOr[UserImportJobsListType] = js.undefined
}
object ListUserImportJobsResponse {
  
  inline def apply(): ListUserImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUserImportJobsResponse]
  }
  
  extension [Self <: ListUserImportJobsResponse](x: Self) {
    
    inline def setPaginationToken(value: PaginationKeyType): Self = StObject.set(x, "PaginationToken", value.asInstanceOf[js.Any])
    
    inline def setPaginationTokenUndefined: Self = StObject.set(x, "PaginationToken", js.undefined)
    
    inline def setUserImportJobs(value: UserImportJobsListType): Self = StObject.set(x, "UserImportJobs", value.asInstanceOf[js.Any])
    
    inline def setUserImportJobsUndefined: Self = StObject.set(x, "UserImportJobs", js.undefined)
    
    inline def setUserImportJobsVarargs(value: UserImportJobType*): Self = StObject.set(x, "UserImportJobs", js.Array(value*))
  }
}
