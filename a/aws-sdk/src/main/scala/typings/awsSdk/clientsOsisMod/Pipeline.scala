package typings.awsSdk.clientsOsisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipeline extends StObject {
  
  /**
    * The date and time when the pipeline was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ingestion endpoints for the pipeline, which you can send data to.
    */
  var IngestEndpointUrls: js.UndefOr[IngestEndpointUrlsList] = js.undefined
  
  /**
    * The date and time when the pipeline was last updated.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Key-value pairs that represent log publishing settings.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.clientsOsisMod.LogPublishingOptions] = js.undefined
  
  /**
    * The maximum pipeline capacity, in Ingestion Compute Units (ICUs).
    */
  var MaxUnits: js.UndefOr[Integer] = js.undefined
  
  /**
    * The minimum pipeline capacity, in Ingestion Compute Units (ICUs).
    */
  var MinUnits: js.UndefOr[Integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var PipelineArn: js.UndefOr[String] = js.undefined
  
  /**
    * The Data Prepper pipeline configuration in YAML format.
    */
  var PipelineConfigurationBody: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var PipelineName: js.UndefOr[String] = js.undefined
  
  /**
    * The current status of the pipeline.
    */
  var Status: js.UndefOr[PipelineStatus] = js.undefined
  
  /**
    * The reason for the current status of the pipeline.
    */
  var StatusReason: js.UndefOr[PipelineStatusReason] = js.undefined
  
  /**
    * The VPC interface endpoints that have access to the pipeline.
    */
  var VpcEndpoints: js.UndefOr[VpcEndpointsList] = js.undefined
}
object Pipeline {
  
  inline def apply(): Pipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pipeline] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setIngestEndpointUrls(value: IngestEndpointUrlsList): Self = StObject.set(x, "IngestEndpointUrls", value.asInstanceOf[js.Any])
    
    inline def setIngestEndpointUrlsUndefined: Self = StObject.set(x, "IngestEndpointUrls", js.undefined)
    
    inline def setIngestEndpointUrlsVarargs(value: String*): Self = StObject.set(x, "IngestEndpointUrls", js.Array(value*))
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "LastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "LastUpdatedAt", js.undefined)
    
    inline def setLogPublishingOptions(value: LogPublishingOptions): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setMaxUnits(value: Integer): Self = StObject.set(x, "MaxUnits", value.asInstanceOf[js.Any])
    
    inline def setMaxUnitsUndefined: Self = StObject.set(x, "MaxUnits", js.undefined)
    
    inline def setMinUnits(value: Integer): Self = StObject.set(x, "MinUnits", value.asInstanceOf[js.Any])
    
    inline def setMinUnitsUndefined: Self = StObject.set(x, "MinUnits", js.undefined)
    
    inline def setPipelineArn(value: String): Self = StObject.set(x, "PipelineArn", value.asInstanceOf[js.Any])
    
    inline def setPipelineArnUndefined: Self = StObject.set(x, "PipelineArn", js.undefined)
    
    inline def setPipelineConfigurationBody(value: String): Self = StObject.set(x, "PipelineConfigurationBody", value.asInstanceOf[js.Any])
    
    inline def setPipelineConfigurationBodyUndefined: Self = StObject.set(x, "PipelineConfigurationBody", js.undefined)
    
    inline def setPipelineName(value: String): Self = StObject.set(x, "PipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "PipelineName", js.undefined)
    
    inline def setStatus(value: PipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: PipelineStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setVpcEndpoints(value: VpcEndpointsList): Self = StObject.set(x, "VpcEndpoints", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointsUndefined: Self = StObject.set(x, "VpcEndpoints", js.undefined)
    
    inline def setVpcEndpointsVarargs(value: VpcEndpoint*): Self = StObject.set(x, "VpcEndpoints", js.Array(value*))
  }
}
