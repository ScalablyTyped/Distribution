package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDatasetEntriesRequest extends StObject {
  
  /**
    *  The changes that you want to make to the dataset. 
    */
  var Changes: DatasetChanges
  
  /**
    *  The Amazon Resource Name (ARN) of the dataset that you want to update. 
    */
  var DatasetArn: typings.awsSdk.clientsRekognitionMod.DatasetArn
}
object UpdateDatasetEntriesRequest {
  
  inline def apply(Changes: DatasetChanges, DatasetArn: DatasetArn): UpdateDatasetEntriesRequest = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any], DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDatasetEntriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateDatasetEntriesRequest] (val x: Self) extends AnyVal {
    
    inline def setChanges(value: DatasetChanges): Self = StObject.set(x, "Changes", value.asInstanceOf[js.Any])
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
  }
}
