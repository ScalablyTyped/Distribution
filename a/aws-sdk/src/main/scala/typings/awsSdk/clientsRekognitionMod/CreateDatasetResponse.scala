package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetResponse extends StObject {
  
  /**
    *  The ARN of the created Amazon Rekognition Custom Labels dataset. 
    */
  var DatasetArn: js.UndefOr[typings.awsSdk.clientsRekognitionMod.DatasetArn] = js.undefined
}
object CreateDatasetResponse {
  
  inline def apply(): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDatasetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetResponse] (val x: Self) extends AnyVal {
    
    inline def setDatasetArn(value: DatasetArn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
  }
}
