package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineBlueprint extends StObject {
  
  /**
    * The name of the blueprint.
    */
  var BlueprintName: js.UndefOr[String] = js.undefined
  
  /**
    * The YAML configuration of the blueprint.
    */
  var PipelineConfigurationBody: js.UndefOr[String] = js.undefined
}
object PipelineBlueprint {
  
  inline def apply(): PipelineBlueprint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineBlueprint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipelineBlueprint] (val x: Self) extends AnyVal {
    
    inline def setBlueprintName(value: String): Self = StObject.set(x, "BlueprintName", value.asInstanceOf[js.Any])
    
    inline def setBlueprintNameUndefined: Self = StObject.set(x, "BlueprintName", js.undefined)
    
    inline def setPipelineConfigurationBody(value: String): Self = StObject.set(x, "PipelineConfigurationBody", value.asInstanceOf[js.Any])
    
    inline def setPipelineConfigurationBodyUndefined: Self = StObject.set(x, "PipelineConfigurationBody", js.undefined)
  }
}
