package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetRequest extends StObject {
  
  /**
    * The name of the dataset to be deleted. 
    */
  var DatasetName: DatasetIdentifier
}
object DeleteDatasetRequest {
  
  inline def apply(DatasetName: DatasetIdentifier): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
  
  extension [Self <: DeleteDatasetRequest](x: Self) {
    
    inline def setDatasetName(value: DatasetIdentifier): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
  }
}
