package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchVulnerabilitiesRequest extends StObject {
  
  /**
    * The criteria used to filter the results of a vulnerability search.
    */
  var filterCriteria: SearchVulnerabilitiesFilterCriteria
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object SearchVulnerabilitiesRequest {
  
  inline def apply(filterCriteria: SearchVulnerabilitiesFilterCriteria): SearchVulnerabilitiesRequest = {
    val __obj = js.Dynamic.literal(filterCriteria = filterCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchVulnerabilitiesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchVulnerabilitiesRequest] (val x: Self) extends AnyVal {
    
    inline def setFilterCriteria(value: SearchVulnerabilitiesFilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
