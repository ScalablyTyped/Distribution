package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatasetRequest extends StObject {
  
  /**
    * The unique identifier for a Dataset.
    */
  var datasetId: StringValueLength1to255_
}
object GetDatasetRequest {
  
  inline def apply(datasetId: StringValueLength1to255_): GetDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetId(value: StringValueLength1to255_): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
  }
}
