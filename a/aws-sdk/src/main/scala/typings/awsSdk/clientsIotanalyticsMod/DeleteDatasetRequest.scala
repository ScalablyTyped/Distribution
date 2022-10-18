package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to delete.
    */
  var datasetName: DatasetName
}
object DeleteDatasetRequest {
  
  inline def apply(datasetName: DatasetName): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
  
  extension [Self <: DeleteDatasetRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
  }
}
