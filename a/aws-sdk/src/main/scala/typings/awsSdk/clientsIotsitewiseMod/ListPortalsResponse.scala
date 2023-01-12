package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPortalsResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list that summarizes each portal.
    */
  var portalSummaries: js.UndefOr[PortalSummaries] = js.undefined
}
object ListPortalsResponse {
  
  inline def apply(): ListPortalsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPortalsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPortalsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPortalSummaries(value: PortalSummaries): Self = StObject.set(x, "portalSummaries", value.asInstanceOf[js.Any])
    
    inline def setPortalSummariesUndefined: Self = StObject.set(x, "portalSummaries", js.undefined)
    
    inline def setPortalSummariesVarargs(value: PortalSummary*): Self = StObject.set(x, "portalSummaries", js.Array(value*))
  }
}
