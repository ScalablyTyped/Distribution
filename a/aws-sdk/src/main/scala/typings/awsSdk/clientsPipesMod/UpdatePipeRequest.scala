package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePipeRequest extends StObject {
  
  /**
    * A description of the pipe.
    */
  var Description: js.UndefOr[PipeDescription] = js.undefined
  
  /**
    * The state the pipe should be in.
    */
  var DesiredState: js.UndefOr[RequestedPipeState] = js.undefined
  
  /**
    * The ARN of the enrichment resource.
    */
  var Enrichment: js.UndefOr[OptionalArn] = js.undefined
  
  /**
    * The parameters required to set up enrichment on your pipe.
    */
  var EnrichmentParameters: js.UndefOr[PipeEnrichmentParameters] = js.undefined
  
  /**
    * The name of the pipe.
    */
  var Name: PipeName
  
  /**
    * The ARN of the role that allows the pipe to send data to the target.
    */
  var RoleArn: typings.awsSdk.clientsPipesMod.RoleArn
  
  /**
    * The parameters required to set up a source for your pipe.
    */
  var SourceParameters: js.UndefOr[UpdatePipeSourceParameters] = js.undefined
  
  /**
    * The ARN of the target resource.
    */
  var Target: js.UndefOr[Arn] = js.undefined
  
  /**
    * The parameters required to set up a target for your pipe.
    */
  var TargetParameters: js.UndefOr[PipeTargetParameters] = js.undefined
}
object UpdatePipeRequest {
  
  inline def apply(Name: PipeName, RoleArn: RoleArn): UpdatePipeRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePipeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePipeRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: PipeDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDesiredState(value: RequestedPipeState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setEnrichment(value: OptionalArn): Self = StObject.set(x, "Enrichment", value.asInstanceOf[js.Any])
    
    inline def setEnrichmentParameters(value: PipeEnrichmentParameters): Self = StObject.set(x, "EnrichmentParameters", value.asInstanceOf[js.Any])
    
    inline def setEnrichmentParametersUndefined: Self = StObject.set(x, "EnrichmentParameters", js.undefined)
    
    inline def setEnrichmentUndefined: Self = StObject.set(x, "Enrichment", js.undefined)
    
    inline def setName(value: PipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSourceParameters(value: UpdatePipeSourceParameters): Self = StObject.set(x, "SourceParameters", value.asInstanceOf[js.Any])
    
    inline def setSourceParametersUndefined: Self = StObject.set(x, "SourceParameters", js.undefined)
    
    inline def setTarget(value: Arn): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetParameters(value: PipeTargetParameters): Self = StObject.set(x, "TargetParameters", value.asInstanceOf[js.Any])
    
    inline def setTargetParametersUndefined: Self = StObject.set(x, "TargetParameters", js.undefined)
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
