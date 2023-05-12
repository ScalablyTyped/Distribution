package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pipe extends StObject {
  
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
    * The state the pipe should be in.
    */
  var DesiredState: js.UndefOr[RequestedPipeState] = js.undefined
  
  /**
    * The ARN of the enrichment resource.
    */
  var Enrichment: js.UndefOr[OptionalArn] = js.undefined
  
  /**
    * When the pipe was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the pipe.
    */
  var Name: js.UndefOr[PipeName] = js.undefined
  
  /**
    * The ARN of the source resource.
    */
  var Source: js.UndefOr[ArnOrUrl] = js.undefined
  
  /**
    * The reason the pipe is in its current state.
    */
  var StateReason: js.UndefOr[PipeStateReason] = js.undefined
  
  /**
    * The ARN of the target resource.
    */
  var Target: js.UndefOr[Arn] = js.undefined
}
object Pipe {
  
  inline def apply(): Pipe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pipe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Pipe] (val x: Self) extends AnyVal {
    
    inline def setArn(value: PipeArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setCurrentState(value: PipeState): Self = StObject.set(x, "CurrentState", value.asInstanceOf[js.Any])
    
    inline def setCurrentStateUndefined: Self = StObject.set(x, "CurrentState", js.undefined)
    
    inline def setDesiredState(value: RequestedPipeState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setEnrichment(value: OptionalArn): Self = StObject.set(x, "Enrichment", value.asInstanceOf[js.Any])
    
    inline def setEnrichmentUndefined: Self = StObject.set(x, "Enrichment", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setName(value: PipeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSource(value: ArnOrUrl): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStateReason(value: PipeStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setTarget(value: Arn): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
