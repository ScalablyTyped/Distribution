package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationsResponse extends StObject {
  
  /**
    * The list of applications.
    */
  var ApplicationInfoList: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfoList] = js.native
  
  /**
    * The token used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListApplicationsResponse {
  
  @scala.inline
  def apply(): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListApplicationsResponseMutableBuilder[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationInfoList(value: ApplicationInfoList): Self = StObject.set(x, "ApplicationInfoList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationInfoListUndefined: Self = StObject.set(x, "ApplicationInfoList", js.undefined)
    
    @scala.inline
    def setApplicationInfoListVarargs(value: ApplicationInfo*): Self = StObject.set(x, "ApplicationInfoList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
