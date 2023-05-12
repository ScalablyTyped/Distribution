package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsResponse extends StObject {
  
  /**
    * The dataset properties list.
    */
  var DatasetPropertiesList: js.UndefOr[typings.awsSdk.clientsComprehendMod.DatasetPropertiesList] = js.undefined
  
  /**
    * Identifies the next page of results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDatasetsResponse {
  
  inline def apply(): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatasetsResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetPropertiesList(value: DatasetPropertiesList): Self = StObject.set(x, "DatasetPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setDatasetPropertiesListUndefined: Self = StObject.set(x, "DatasetPropertiesList", js.undefined)
    
    inline def setDatasetPropertiesListVarargs(value: DatasetProperties*): Self = StObject.set(x, "DatasetPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
