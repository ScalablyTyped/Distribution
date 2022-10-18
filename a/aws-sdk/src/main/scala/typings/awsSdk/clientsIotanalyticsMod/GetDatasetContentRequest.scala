package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatasetContentRequest extends StObject {
  
  /**
    * The name of the dataset whose contents are retrieved.
    */
  var datasetName: DatasetName
  
  /**
    * The version of the dataset whose contents are retrieved. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to retrieve the contents of the latest or latest successfully completed dataset. If not specified, "$LATEST_SUCCEEDED" is the default.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
}
object GetDatasetContentRequest {
  
  inline def apply(datasetName: DatasetName): GetDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatasetContentRequest]
  }
  
  extension [Self <: GetDatasetContentRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: DatasetContentVersion): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
