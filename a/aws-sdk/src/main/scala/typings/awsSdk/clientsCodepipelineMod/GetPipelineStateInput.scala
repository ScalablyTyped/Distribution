package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPipelineStateInput extends StObject {
  
  /**
    * The name of the pipeline about which you want to get information.
    */
  var name: PipelineName
}
object GetPipelineStateInput {
  
  inline def apply(name: PipelineName): GetPipelineStateInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPipelineStateInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPipelineStateInput] (val x: Self) extends AnyVal {
    
    inline def setName(value: PipelineName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
