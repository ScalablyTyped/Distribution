package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetExternalDataViewAccessDetailsRequest extends StObject {
  
  /**
    * The unique identifier for the Dataview that you want to access.
    */
  var dataViewId: DataViewId
  
  /**
    * The unique identifier for the Dataset.
    */
  var datasetId: DatasetId
}
object GetExternalDataViewAccessDetailsRequest {
  
  inline def apply(dataViewId: DataViewId, datasetId: DatasetId): GetExternalDataViewAccessDetailsRequest = {
    val __obj = js.Dynamic.literal(dataViewId = dataViewId.asInstanceOf[js.Any], datasetId = datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetExternalDataViewAccessDetailsRequest]
  }
  
  extension [Self <: GetExternalDataViewAccessDetailsRequest](x: Self) {
    
    inline def setDataViewId(value: DataViewId): Self = StObject.set(x, "dataViewId", value.asInstanceOf[js.Any])
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
  }
}
