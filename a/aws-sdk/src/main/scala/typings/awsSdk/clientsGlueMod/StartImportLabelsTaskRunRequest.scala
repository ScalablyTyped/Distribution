package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartImportLabelsTaskRunRequest extends StObject {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you import the labels.
    */
  var InputS3Path: UriString
  
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var ReplaceAllLabels: js.UndefOr[ReplaceBoolean] = js.undefined
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}
object StartImportLabelsTaskRunRequest {
  
  inline def apply(InputS3Path: UriString, TransformId: HashString): StartImportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(InputS3Path = InputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartImportLabelsTaskRunRequest]
  }
  
  extension [Self <: StartImportLabelsTaskRunRequest](x: Self) {
    
    inline def setInputS3Path(value: UriString): Self = StObject.set(x, "InputS3Path", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllLabels(value: ReplaceBoolean): Self = StObject.set(x, "ReplaceAllLabels", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllLabelsUndefined: Self = StObject.set(x, "ReplaceAllLabels", js.undefined)
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
