package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePipelineRequest extends StObject {
  
  /**
    * Key-value pairs to configure log publishing.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsOsisMod.LogPublishingOptions] = js.undefined
  
  /**
    * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
    */
  var MaxUnits: PipelineUnits
  
  /**
    * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
    */
  var MinUnits: PipelineUnits
  
  /**
    * The pipeline configuration in YAML format. The command accepts the pipeline configuration as a string or within a .yaml file. If you provide the configuration as a string, each new line must be escaped with \n.
    */
  var PipelineConfigurationBody: typings.awsSdk.clientsOsisMod.PipelineConfigurationBody
  
  /**
    * The name of the OpenSearch Ingestion pipeline to create. Pipeline names are unique across the pipelines owned by an account within an Amazon Web Services Region.
    */
  var PipelineName: typings.awsSdk.clientsOsisMod.PipelineName
  
  /**
    * List of tags to add to the pipeline upon creation.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Container for the values required to configure VPC access for the pipeline. If you don't specify these values, OpenSearch Ingestion creates the pipeline with a public endpoint.
    */
  var VpcOptions: js.UndefOr[typings.awsSdk.clientsOsisMod.VpcOptions] = js.undefined
}
object CreatePipelineRequest {
  
  inline def apply(
    MaxUnits: PipelineUnits,
    MinUnits: PipelineUnits,
    PipelineConfigurationBody: PipelineConfigurationBody,
    PipelineName: PipelineName
  ): CreatePipelineRequest = {
    val __obj = js.Dynamic.literal(MaxUnits = MaxUnits.asInstanceOf[js.Any], MinUnits = MinUnits.asInstanceOf[js.Any], PipelineConfigurationBody = PipelineConfigurationBody.asInstanceOf[js.Any], PipelineName = PipelineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setLogPublishingOptions(value: LogPublishingOptions): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setMaxUnits(value: PipelineUnits): Self = StObject.set(x, "MaxUnits", value.asInstanceOf[js.Any])
    
    inline def setMinUnits(value: PipelineUnits): Self = StObject.set(x, "MinUnits", value.asInstanceOf[js.Any])
    
    inline def setPipelineConfigurationBody(value: PipelineConfigurationBody): Self = StObject.set(x, "PipelineConfigurationBody", value.asInstanceOf[js.Any])
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcOptions(value: VpcOptions): Self = StObject.set(x, "VpcOptions", value.asInstanceOf[js.Any])
    
    inline def setVpcOptionsUndefined: Self = StObject.set(x, "VpcOptions", js.undefined)
  }
}
