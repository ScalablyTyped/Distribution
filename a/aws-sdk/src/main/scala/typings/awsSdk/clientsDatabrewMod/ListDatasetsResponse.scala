package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsResponse extends StObject {
  
  /**
    * A list of datasets that are defined.
    */
  var Datasets: DatasetList
  
  /**
    * A token that you can use in a subsequent call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDatabrewMod.NextToken] = js.undefined
}
object ListDatasetsResponse {
  
  inline def apply(Datasets: DatasetList): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal(Datasets = Datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatasetsResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasets(value: DatasetList): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsVarargs(value: Dataset*): Self = StObject.set(x, "Datasets", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
