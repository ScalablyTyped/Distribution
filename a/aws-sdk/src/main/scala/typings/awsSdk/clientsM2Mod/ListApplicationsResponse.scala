package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsResponse extends StObject {
  
  /**
    * Returns a list of summary details for all the applications in a runtime environment.
    */
  var applications: ApplicationSummaryList
  
  /**
    * A pagination token that's returned when the response doesn't contain all applications.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListApplicationsResponse {
  
  inline def apply(applications: ApplicationSummaryList): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(applications = applications.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: ApplicationSummaryList): Self = StObject.set(x, "applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsVarargs(value: ApplicationSummary*): Self = StObject.set(x, "applications", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
