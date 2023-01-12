package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetResponse extends StObject {
  
  /**
    * The unique identifier for updated Dataset.
    */
  var datasetId: js.UndefOr[DatasetId] = js.undefined
}
object UpdateDatasetResponse {
  
  inline def apply(): UpdateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDatasetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatasetResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetId(value: DatasetId): Self = StObject.set(x, "datasetId", value.asInstanceOf[js.Any])
    
    inline def setDatasetIdUndefined: Self = StObject.set(x, "datasetId", js.undefined)
  }
}
