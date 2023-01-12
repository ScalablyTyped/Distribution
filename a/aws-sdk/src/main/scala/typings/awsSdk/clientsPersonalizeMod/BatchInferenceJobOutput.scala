package typings.awsSdk.clientsPersonalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchInferenceJobOutput extends StObject {
  
  /**
    * Information on the Amazon S3 bucket in which the batch inference job's output is stored.
    */
  var s3DataDestination: S3DataConfig
}
object BatchInferenceJobOutput {
  
  inline def apply(s3DataDestination: S3DataConfig): BatchInferenceJobOutput = {
    val __obj = js.Dynamic.literal(s3DataDestination = s3DataDestination.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchInferenceJobOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchInferenceJobOutput] (val x: Self) extends AnyVal {
    
    inline def setS3DataDestination(value: S3DataConfig): Self = StObject.set(x, "s3DataDestination", value.asInstanceOf[js.Any])
  }
}
