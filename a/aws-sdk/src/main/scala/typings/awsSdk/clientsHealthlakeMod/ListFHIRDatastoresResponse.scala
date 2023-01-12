package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFHIRDatastoresResponse extends StObject {
  
  /**
    * All properties associated with the listed Data Stores.
    */
  var DatastorePropertiesList: typings.awsSdk.clientsHealthlakeMod.DatastorePropertiesList
  
  /**
    * Pagination token that can be used to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.NextToken] = js.undefined
}
object ListFHIRDatastoresResponse {
  
  inline def apply(DatastorePropertiesList: DatastorePropertiesList): ListFHIRDatastoresResponse = {
    val __obj = js.Dynamic.literal(DatastorePropertiesList = DatastorePropertiesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFHIRDatastoresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFHIRDatastoresResponse] (val x: Self) extends AnyVal {
    
    inline def setDatastorePropertiesList(value: DatastorePropertiesList): Self = StObject.set(x, "DatastorePropertiesList", value.asInstanceOf[js.Any])
    
    inline def setDatastorePropertiesListVarargs(value: DatastoreProperties*): Self = StObject.set(x, "DatastorePropertiesList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
