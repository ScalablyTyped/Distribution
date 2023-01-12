package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDatasetRequest extends StObject {
  
  /**
    *  The ARN of the Amazon Rekognition Custom Labels dataset that you want to delete. 
    */
  var DatasetArn: typings.awsSdk.clientsRekognitionMod.DatasetArn
}
object DeleteDatasetRequest {
  
  inline def apply(DatasetArn: DatasetArn): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetArn = DatasetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDatasetRequest] (val x: Self) extends AnyVal {
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
  }
}
