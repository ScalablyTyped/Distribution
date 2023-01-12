package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapturePipelineSummary extends StObject {
  
  /**
    * The ARN of the media pipeline in the summary.
    */
  var MediaPipelineArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The ID of the media pipeline in the summary.
    */
  var MediaPipelineId: js.UndefOr[GuidString] = js.undefined
}
object MediaCapturePipelineSummary {
  
  inline def apply(): MediaCapturePipelineSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaCapturePipelineSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaCapturePipelineSummary] (val x: Self) extends AnyVal {
    
    inline def setMediaPipelineArn(value: AmazonResourceName): Self = StObject.set(x, "MediaPipelineArn", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineArnUndefined: Self = StObject.set(x, "MediaPipelineArn", js.undefined)
    
    inline def setMediaPipelineId(value: GuidString): Self = StObject.set(x, "MediaPipelineId", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineIdUndefined: Self = StObject.set(x, "MediaPipelineId", js.undefined)
  }
}
