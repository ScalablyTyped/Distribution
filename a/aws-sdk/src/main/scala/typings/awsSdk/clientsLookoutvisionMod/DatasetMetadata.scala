package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatasetMetadata extends StObject {
  
  /**
    * The Unix timestamp for the date and time that the dataset was created. 
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of the dataset.
    */
  var DatasetType: js.UndefOr[typings.awsSdk.clientsLookoutvisionMod.DatasetType] = js.undefined
  
  /**
    * The status for the dataset.
    */
  var Status: js.UndefOr[DatasetStatus] = js.undefined
  
  /**
    * The status message for the dataset.
    */
  var StatusMessage: js.UndefOr[DatasetStatusMessage] = js.undefined
}
object DatasetMetadata {
  
  inline def apply(): DatasetMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatasetMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreationTimestamp(value: js.Date): Self = StObject.set(x, "CreationTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreationTimestampUndefined: Self = StObject.set(x, "CreationTimestamp", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDatasetTypeUndefined: Self = StObject.set(x, "DatasetType", js.undefined)
    
    inline def setStatus(value: DatasetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: DatasetStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
