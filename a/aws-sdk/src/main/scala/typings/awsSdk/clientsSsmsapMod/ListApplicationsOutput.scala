package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsOutput extends StObject {
  
  /**
    * The applications registered with AWS Systems Manager for SAP.
    */
  var Applications: js.UndefOr[ApplicationSummaryList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmsapMod.NextToken] = js.undefined
}
object ListApplicationsOutput {
  
  inline def apply(): ListApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationsOutput] (val x: Self) extends AnyVal {
    
    inline def setApplications(value: ApplicationSummaryList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: ApplicationSummary*): Self = StObject.set(x, "Applications", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
