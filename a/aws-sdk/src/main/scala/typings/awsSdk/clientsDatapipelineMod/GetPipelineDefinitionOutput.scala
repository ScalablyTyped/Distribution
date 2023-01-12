package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineDefinitionOutput extends StObject {
  
  /**
    * The parameter objects used in the pipeline definition.
    */
  var parameterObjects: js.UndefOr[ParameterObjectList] = js.undefined
  
  /**
    * The parameter values used in the pipeline definition.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.undefined
  
  /**
    * The objects defined in the pipeline.
    */
  var pipelineObjects: js.UndefOr[PipelineObjectList] = js.undefined
}
object GetPipelineDefinitionOutput {
  
  inline def apply(): GetPipelineDefinitionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPipelineDefinitionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineDefinitionOutput] (val x: Self) extends AnyVal {
    
    inline def setParameterObjects(value: ParameterObjectList): Self = StObject.set(x, "parameterObjects", value.asInstanceOf[js.Any])
    
    inline def setParameterObjectsUndefined: Self = StObject.set(x, "parameterObjects", js.undefined)
    
    inline def setParameterObjectsVarargs(value: ParameterObject*): Self = StObject.set(x, "parameterObjects", js.Array(value*))
    
    inline def setParameterValues(value: ParameterValueList): Self = StObject.set(x, "parameterValues", value.asInstanceOf[js.Any])
    
    inline def setParameterValuesUndefined: Self = StObject.set(x, "parameterValues", js.undefined)
    
    inline def setParameterValuesVarargs(value: ParameterValue*): Self = StObject.set(x, "parameterValues", js.Array(value*))
    
    inline def setPipelineObjects(value: PipelineObjectList): Self = StObject.set(x, "pipelineObjects", value.asInstanceOf[js.Any])
    
    inline def setPipelineObjectsUndefined: Self = StObject.set(x, "pipelineObjects", js.undefined)
    
    inline def setPipelineObjectsVarargs(value: PipelineObject*): Self = StObject.set(x, "pipelineObjects", js.Array(value*))
  }
}
