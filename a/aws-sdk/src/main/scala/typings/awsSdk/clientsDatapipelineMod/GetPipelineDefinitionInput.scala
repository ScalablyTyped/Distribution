package typings.awsSdk.clientsDatapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineDefinitionInput extends StObject {
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  
  /**
    * The version of the pipeline definition to retrieve. Set this parameter to latest (default) to use the last definition saved to the pipeline or active to use the last definition that was activated.
    */
  var version: js.UndefOr[String] = js.undefined
}
object GetPipelineDefinitionInput {
  
  inline def apply(pipelineId: id): GetPipelineDefinitionInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineDefinitionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineDefinitionInput] (val x: Self) extends AnyVal {
    
    inline def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
