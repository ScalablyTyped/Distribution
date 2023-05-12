package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoMLJobStepMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AutoML job.
    */
  var Arn: js.UndefOr[AutoMLJobArn] = js.undefined
}
object AutoMLJobStepMetadata {
  
  inline def apply(): AutoMLJobStepMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoMLJobStepMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoMLJobStepMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AutoMLJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
