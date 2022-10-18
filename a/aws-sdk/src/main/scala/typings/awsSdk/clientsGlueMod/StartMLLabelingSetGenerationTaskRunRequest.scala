package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMLLabelingSetGenerationTaskRunRequest extends StObject {
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where you generate the labeling set.
    */
  var OutputS3Path: UriString
  
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}
object StartMLLabelingSetGenerationTaskRunRequest {
  
  inline def apply(OutputS3Path: UriString, TransformId: HashString): StartMLLabelingSetGenerationTaskRunRequest = {
    val __obj = js.Dynamic.literal(OutputS3Path = OutputS3Path.asInstanceOf[js.Any], TransformId = TransformId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMLLabelingSetGenerationTaskRunRequest]
  }
  
  extension [Self <: StartMLLabelingSetGenerationTaskRunRequest](x: Self) {
    
    inline def setOutputS3Path(value: UriString): Self = StObject.set(x, "OutputS3Path", value.asInstanceOf[js.Any])
    
    inline def setTransformId(value: HashString): Self = StObject.set(x, "TransformId", value.asInstanceOf[js.Any])
  }
}
