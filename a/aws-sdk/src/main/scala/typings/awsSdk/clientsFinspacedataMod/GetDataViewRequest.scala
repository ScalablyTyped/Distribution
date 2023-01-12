package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataViewRequest extends StObject {
  
  /**
    * The unique identifier for the Dataview.
    */
  var dataViewId: DataViewId
  
  /**
    * The unique identifier for the Dataset used in the Dataview.
    */
  var datasetId: DatasetId
}
object GetDataViewRequest {
  
  inline def apply(dataViewId: DataViewId, datasetId: DatasetId): GetDataViewRequest = {
    val __obj = js.Dynamic.literal(dataViewId = dataViewId.asInstanceOf[js.Any], datasetId = datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataViewRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataViewRequest] (val x: Self) extends AnyVal {
    
    inline def setDataViewId(value: DataViewId): Self = StObject.set(x, "dataViewId", value.asInstanceOf[js.Any])
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
  }
}
