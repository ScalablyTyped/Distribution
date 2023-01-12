package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartExportLabelsTaskRunRequest extends StObject {
  
  /**
    * The Amazon S3 path where you export the labels.
    */
  var OutputS3Path: UriString
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}
object StartExportLabelsTaskRunRequest {
  
  inline def apply(OutputS3Path: UriString, TransformId: HashString): StartExportLabelsTaskRunRequest = {
    val __obj = js.Dynamic.literal(OutputS3Path = OutputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartExportLabelsTaskRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartExportLabelsTaskRunRequest] (val x: Self) extends AnyVal {
    
    inline def setOutputS3Path(value: UriString): Self = StObject.set(x, "OutputS3Path", value.asInstanceOf[js.Any])
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
