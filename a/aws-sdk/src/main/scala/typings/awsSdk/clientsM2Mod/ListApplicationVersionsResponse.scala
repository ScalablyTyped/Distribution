package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationVersionsResponse extends StObject {
  
  /**
    * The list of application versions.
    */
  var applicationVersions: ApplicationVersionSummaryList
  
  /**
    * If there are more items to return, this contains a token that is passed to a subsequent call to this operation to retrieve the next set of items.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationVersionsResponse {
  
  inline def apply(applicationVersions: ApplicationVersionSummaryList): ListApplicationVersionsResponse = {
    val __obj = js.Dynamic.literal(applicationVersions = applicationVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationVersionsResponse]
  }
  
  extension [Self <: ListApplicationVersionsResponse](x: Self) {
    
    inline def setApplicationVersions(value: ApplicationVersionSummaryList): Self = StObject.set(x, "applicationVersions", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionsVarargs(value: ApplicationVersionSummary*): Self = StObject.set(x, "applicationVersions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
