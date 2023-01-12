package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetContentResponse extends StObject {
  
  /**
    * The version ID of the dataset contents that are being created.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
}
object CreateDatasetContentResponse {
  
  inline def apply(): CreateDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetContentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetContentResponse] (val x: Self) extends AnyVal {
    
    inline def setVersionId(value: DatasetContentVersion): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
