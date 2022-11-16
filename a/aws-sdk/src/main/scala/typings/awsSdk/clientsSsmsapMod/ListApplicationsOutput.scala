package typings.awsSdk.clientsSsmsapMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationsOutput extends StObject {
  
  /**
    * 
    */
  var Applications: js.UndefOr[ApplicationSummaryList] = js.undefined
  
  /**
    * 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSsmsapMod.NextToken] = js.undefined
}
object ListApplicationsOutput {
  
  inline def apply(): ListApplicationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationsOutput]
  }
  
  extension [Self <: ListApplicationsOutput](x: Self) {
    
    inline def setApplications(value: ApplicationSummaryList): Self = StObject.set(x, "Applications", value.asInstanceOf[js.Any])
    
    inline def setApplicationsUndefined: Self = StObject.set(x, "Applications", js.undefined)
    
    inline def setApplicationsVarargs(value: ApplicationSummary*): Self = StObject.set(x, "Applications", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
