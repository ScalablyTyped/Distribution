package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessingJobStepMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the processing job.
    */
  var Arn: js.UndefOr[ProcessingJobArn] = js.undefined
}
object ProcessingJobStepMetadata {
  
  inline def apply(): ProcessingJobStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessingJobStepMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProcessingJobStepMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ProcessingJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
