package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetResponse extends StObject {
  
  /**
    * Information about the dataset.
    */
  var DatasetMetadata: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.DatasetMetadata] = js.undefined
}
object CreateDatasetResponse {
  
  inline def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetMetadata(value: DatasetMetadata): Self = StObject.set(x, "DatasetMetadata", value.asInstanceOf[js.Any])
    
    inline def setDatasetMetadataUndefined: Self = StObject.set(x, "DatasetMetadata", js.undefined)
  }
}
