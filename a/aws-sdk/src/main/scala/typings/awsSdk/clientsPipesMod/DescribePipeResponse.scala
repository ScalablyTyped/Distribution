package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePipeResponse extends StObject {
  
  /**
    * The ARN of the pipe.
    */
  var Arn: js.UndefOr[PipeArn] = js.undefined
  
  /**
    * The time the pipe was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state the pipe is in.
    */
  var CurrentState: js.UndefOr[PipeState] = js.undefined
  
  /**
    * A description of the pipe.
    */
  var Description: js.UndefOr[PipeDescription] = js.undefined
  
  /**
    * The state the pipe should be in.
    */
  var DesiredState: js.UndefOr[RequestedPipeStateDescribeResponse] = js.undefined
  
  /**
    * The ARN of the enrichment resource.
    */
  var Enrichment: js.UndefOr[OptionalArn] = js.undefined
  
  /**
    * The parameters required to set up enrichment on your pipe.
    */
  var EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters] = js.undefined
  
  /**
    * When the pipe was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the pipe.
    */
  var Name: js.UndefOr[PipeName] = js.undefined
  
  /**
    * The ARN of the role that allows the pipe to send data to the target.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsPipesMod.RoleArn] = js.undefined
  
  /**
    * The ARN of the source resource.
    */
  var Source: js.UndefOr[ArnOrUrl] = js.undefined
  
  /**
    * The parameters required to set up a source for your pipe.
    */
  var SourceParameters: js.UndefOr[PipeSourceParameters] = js.undefined
  
  /**
    * The reason the pipe is in its current state.
    */
  var StateReason: js.UndefOr[PipeStateReason] = js.undefined
  
  /**
    * The list of key-value pairs to associate with the pipe.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ARN of the target resource.
    */
  var Target: js.UndefOr[Arn] = js.undefined
  
  /**
    * The parameters required to set up a target for your pipe.
    */
  var TargetParameters: js.UndefOr[PipeTargetParameters] = js.undefined
}
object DescribePipeResponse {
  
  inline def apply(): DescribePipeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePipeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribePipeResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PipeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrentState(value: PipeState): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "CurrentState", js.undefined)
    
    inline def setDescription(value: PipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDesiredState(value: RequestedPipeStateDescribeResponse): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setEnrichment(value: OptionalArn): Self = StObject.set(x, "Enrichment", value.asInstanceOf[js.Any])
    
    inline def setEnrichmentParameters(value: PipeEnrichmentParameters): Self = StObject.set(x, "EnrichmentParameters", value.asInstanceOf[js.Any])
    
    inline def setEnrichmentParametersUndefined: Self = StObject.set(x, "EnrichmentParameters", js.undefined)
    
    inline def setEnrichmentUndefined: Self = StObject.set(x, "Enrichment", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: PipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSource(value: ArnOrUrl): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceParameters(value: PipeSourceParameters): Self = StObject.set(x, "SourceParameters", value.asInstanceOf[js.Any])
    
    inline def setSourceParametersUndefined: Self = StObject.set(x, "SourceParameters", js.undefined)
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStateReason(value: PipeStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTarget(value: Arn): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetParameters(value: PipeTargetParameters): Self = StObject.set(x, "TargetParameters", value.asInstanceOf[js.Any])
    
    inline def setTargetParametersUndefined: Self = StObject.set(x, "TargetParameters", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
