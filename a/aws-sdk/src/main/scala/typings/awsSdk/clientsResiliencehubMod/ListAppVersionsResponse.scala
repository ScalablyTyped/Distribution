package typings.awsSdk.clientsResiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAppVersionsResponse extends StObject {
  
  /**
    * The version of the application.
    */
  var appVersions: AppVersionList
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAppVersionsResponse {
  
  inline def apply(appVersions: AppVersionList): ListAppVersionsResponse = {
    val __obj = js.Dynamic.literal(appVersions = appVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppVersionsResponse]
  }
  
  extension [Self <: ListAppVersionsResponse](x: Self) {
    
    inline def setAppVersions(value: AppVersionList): Self = StObject.set(x, "appVersions", value.asInstanceOf[js.Any])
    
    inline def setAppVersionsVarargs(value: AppVersionSummary*): Self = StObject.set(x, "appVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
