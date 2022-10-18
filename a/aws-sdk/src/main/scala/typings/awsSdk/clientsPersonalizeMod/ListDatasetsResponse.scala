package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetsResponse extends StObject {
  
  /**
    * An array of Dataset objects. Each object provides metadata information.
    */
  var datasets: js.UndefOr[Datasets] = js.undefined
  
  /**
    * A token for getting the next set of datasets (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetsResponse {
  
  inline def apply(): ListDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetsResponse]
  }
  
  extension [Self <: ListDatasetsResponse](x: Self) {
    
    inline def setDatasets(value: Datasets): Self = StObject.set(x, "datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsUndefined: Self = StObject.set(x, "datasets", js.undefined)
    
    inline def setDatasetsVarargs(value: DatasetSummary*): Self = StObject.set(x, "datasets", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
