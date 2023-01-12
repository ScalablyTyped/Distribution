package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TuningJobStepMetaData extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the tuning job that was run by this step execution.
    */
  var Arn: js.UndefOr[HyperParameterTuningJobArn] = js.undefined
}
object TuningJobStepMetaData {
  
  inline def apply(): TuningJobStepMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TuningJobStepMetaData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TuningJobStepMetaData] (val x: Self) extends AnyVal {
    
    inline def setArn(value: HyperParameterTuningJobArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
  }
}
