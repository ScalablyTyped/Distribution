package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetSageMakerPipelineParameters extends StObject {
  
  /**
    * List of Parameter names and values for SageMaker Model Building Pipeline execution.
    */
  var PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList] = js.undefined
}
object PipeTargetSageMakerPipelineParameters {
  
  inline def apply(): PipeTargetSageMakerPipelineParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeTargetSageMakerPipelineParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetSageMakerPipelineParameters] (val x: Self) extends AnyVal {
    
    inline def setPipelineParameterList(value: SageMakerPipelineParameterList): Self = StObject.set(x, "PipelineParameterList", value.asInstanceOf[js.Any])
    
    inline def setPipelineParameterListUndefined: Self = StObject.set(x, "PipelineParameterList", js.undefined)
    
    inline def setPipelineParameterListVarargs(value: SageMakerPipelineParameter*): Self = StObject.set(x, "PipelineParameterList", js.Array(value*))
  }
}
