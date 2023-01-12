package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFHIRDatastoresRequest extends StObject {
  
  /**
    * Lists all filters associated with a FHIR Data Store request.
    */
  var Filter: js.UndefOr[DatastoreFilter] = js.undefined
  
  /**
    * The maximum number of Data Stores returned in a single page of a ListFHIRDatastoresRequest call.
    */
  var MaxResults: js.UndefOr[MaxResultsInteger] = js.undefined
  
  /**
    * Fetches the next page of Data Stores when results are paginated.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.NextToken] = js.undefined
}
object ListFHIRDatastoresRequest {
  
  inline def apply(): ListFHIRDatastoresRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFHIRDatastoresRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFHIRDatastoresRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: DatastoreFilter): Self = StObject.set(x, "Filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "Filter", js.undefined)
    
    inline def setMaxResults(value: MaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
