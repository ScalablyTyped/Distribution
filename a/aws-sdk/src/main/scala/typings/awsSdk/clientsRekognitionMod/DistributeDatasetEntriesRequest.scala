package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributeDatasetEntriesRequest extends StObject {
  
  /**
    * The ARNS for the training dataset and test dataset that you want to use. The datasets must belong to the same project. The test dataset must be empty. 
    */
  var Datasets: DistributeDatasetMetadataList
}
object DistributeDatasetEntriesRequest {
  
  inline def apply(Datasets: DistributeDatasetMetadataList): DistributeDatasetEntriesRequest = {
    val __obj = js.Dynamic.literal(Datasets = Datasets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributeDatasetEntriesRequest]
  }
  
  extension [Self <: DistributeDatasetEntriesRequest](x: Self) {
    
    inline def setDatasets(value: DistributeDatasetMetadataList): Self = StObject.set(x, "Datasets", value.asInstanceOf[js.Any])
    
    inline def setDatasetsVarargs(value: DistributeDataset*): Self = StObject.set(x, "Datasets", js.Array(value*))
  }
}
