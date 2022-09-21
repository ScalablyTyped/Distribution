package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * The list of applications.
    */
  var ApplicationInfoList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfoList] = js.undefined
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListApplicationsResponse {
  
  inline def apply(): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  extension [Self <: ListApplicationsResponse](x: Self) {
    
    inline def setApplicationInfoList(value: ApplicationInfoList): Self = StObject.set(x, "ApplicationInfoList", value.asInstanceOf[js.Any])
    
    inline def setApplicationInfoListUndefined: Self = StObject.set(x, "ApplicationInfoList", js.undefined)
    
    inline def setApplicationInfoListVarargs(value: ApplicationInfo*): Self = StObject.set(x, "ApplicationInfoList", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
