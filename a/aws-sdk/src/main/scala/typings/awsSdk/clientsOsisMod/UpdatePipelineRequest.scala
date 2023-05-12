package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipelineRequest extends StObject {
  
  /**
    * Key-value pairs to configure log publishing.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsOsisMod.LogPublishingOptions] = js.undefined
  
  /**
    * The maximum pipeline capacity, in Ingestion Compute Units (ICUs)
    */
  var MaxUnits: js.UndefOr[PipelineUnits] = js.undefined
  
  /**
    * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
    */
  var MinUnits: js.UndefOr[PipelineUnits] = js.undefined
  
  /**
    * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a .yaml file. If you provide the configuration as a string, each new line must be escaped with \n.
    */
  var PipelineConfigurationBody: js.UndefOr[typings.awsSdk.clientsOsisMod.PipelineConfigurationBody] = js.undefined
  
  /**
    * The name of the pipeline to update.
    */
  var PipelineName: typings.awsSdk.clientsOsisMod.PipelineName
}
object UpdatePipelineRequest {
  
  inline def apply(PipelineName: PipelineName): UpdatePipelineRequest = {
    val __obj = js.Dynamic.literal(PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setLogPublishingOptions(value: LogPublishingOptions): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setMaxUnits(value: PipelineUnits): Self = StObject.set(x, "MaxUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxUnitsUndefined: Self = StObject.set(x, "MaxUnits", js.undefined)
    
    inline def setMinUnits(value: PipelineUnits): Self = StObject.set(x, "MinUnits", value.asInstanceOf[js.Any])
    
    inline def setMinUnitsUndefined: Self = StObject.set(x, "MinUnits", js.undefined)
    
    inline def setPipelineConfigurationBody(value: PipelineConfigurationBody): Self = StObject.set(x, "PipelineConfigurationBody", value.asInstanceOf[js.Any])
    
    inline def setPipelineConfigurationBodyUndefined: Self = StObject.set(x, "PipelineConfigurationBody", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
  }
}
