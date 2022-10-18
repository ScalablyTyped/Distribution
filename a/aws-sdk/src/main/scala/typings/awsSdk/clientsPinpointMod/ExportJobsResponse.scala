package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportJobsResponse extends StObject {
  
  /**
    * An array of responses, one for each export job that's associated with the application (Export Jobs resource) or segment (Segment Export Jobs resource).
    */
  var Item: ListOfExportJobResponse
  
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ExportJobsResponse {
  
  inline def apply(Item: ListOfExportJobResponse): ExportJobsResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportJobsResponse]
  }
  
  extension [Self <: ExportJobsResponse](x: Self) {
    
    inline def setItem(value: ListOfExportJobResponse): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: ExportJobResponse*): Self = StObject.set(x, "Item", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
