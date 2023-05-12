package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidatePipelineRequest extends StObject {
  
  /**
    * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a .yaml file. If you provide the configuration as a string, each new line must be escaped with \n.
    */
  var PipelineConfigurationBody: typings.awsSdk.clientsOsisMod.PipelineConfigurationBody
}
object ValidatePipelineRequest {
  
  inline def apply(PipelineConfigurationBody: PipelineConfigurationBody): ValidatePipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineConfigurationBody = PipelineConfigurationBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidatePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidatePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setPipelineConfigurationBody(value: PipelineConfigurationBody): Self = StObject.set(x, "PipelineConfigurationBody", value.asInstanceOf[js.Any])
  }
}
