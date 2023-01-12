package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaConcatenationPipeline extends StObject {
  
  /**
    * The time at which the concatenation pipeline was created.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the media pipeline that you specify in the SourceConfiguration object.
    */
  var MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The ID of the media pipeline being concatenated.
    */
  var MediaPipelineId: js.UndefOr[GuidString] = js.undefined
  
  /**
    * The data sinks of the concatenation pipeline.
    */
  var Sinks: js.UndefOr[ConcatenationSinkList] = js.undefined
  
  /**
    * The data sources being concatnated.
    */
  var Sources: js.UndefOr[ConcatenationSourceList] = js.undefined
  
  /**
    * The status of the concatenation pipeline.
    */
  var Status: js.UndefOr[MediaPipelineStatus] = js.undefined
  
  /**
    * The time at which the concatenation pipeline was last updated.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object MediaConcatenationPipeline {
  
  inline def apply(): MediaConcatenationPipeline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaConcatenationPipeline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaConcatenationPipeline] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setMediaPipelineArn(value: AmazonResourceName): Self = StObject.set(x, "MediaPipelineArn", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineArnUndefined: Self = StObject.set(x, "MediaPipelineArn", js.undefined)
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineIdUndefined: Self = StObject.set(x, "MediaPipelineId", js.undefined)
    
    inline def setSinks(value: ConcatenationSinkList): Self = StObject.set(x, "Sinks", value.asInstanceOf[js.Any])
    
    inline def setSinksUndefined: Self = StObject.set(x, "Sinks", js.undefined)
    
    inline def setSinksVarargs(value: ConcatenationSink*): Self = StObject.set(x, "Sinks", js.Array(value*))
    
    inline def setSources(value: ConcatenationSourceList): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    inline def setSourcesVarargs(value: ConcatenationSource*): Self = StObject.set(x, "Sources", js.Array(value*))
    
    inline def setStatus(value: MediaPipelineStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
