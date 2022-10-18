package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetEntriesResponse extends StObject {
  
  /**
    * The status of the dataset update.
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
}
object UpdateDatasetEntriesResponse {
  
  inline def apply(): UpdateDatasetEntriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateDatasetEntriesResponse]
  }
  
  extension [Self <: UpdateDatasetEntriesResponse](x: Self) {
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
