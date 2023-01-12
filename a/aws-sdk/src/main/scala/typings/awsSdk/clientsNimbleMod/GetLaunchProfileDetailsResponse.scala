package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchProfileDetailsResponse extends StObject {
  
  /**
    * The launch profile.
    */
  var launchProfile: js.UndefOr[LaunchProfile] = js.undefined
  
  /**
    * A collection of streaming images.
    */
  var streamingImages: js.UndefOr[StreamingImageList] = js.undefined
  
  /**
    * A collection of studio component summaries.
    */
  var studioComponentSummaries: js.UndefOr[StudioComponentSummaryList] = js.undefined
}
object GetLaunchProfileDetailsResponse {
  
  inline def apply(): GetLaunchProfileDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLaunchProfileDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLaunchProfileDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setLaunchProfile(value: LaunchProfile): Self = StObject.set(x, "launchProfile", value.asInstanceOf[js.Any])
    
    inline def setLaunchProfileUndefined: Self = StObject.set(x, "launchProfile", js.undefined)
    
    inline def setStreamingImages(value: StreamingImageList): Self = StObject.set(x, "streamingImages", value.asInstanceOf[js.Any])
    
    inline def setStreamingImagesUndefined: Self = StObject.set(x, "streamingImages", js.undefined)
    
    inline def setStreamingImagesVarargs(value: StreamingImage*): Self = StObject.set(x, "streamingImages", js.Array(value*))
    
    inline def setStudioComponentSummaries(value: StudioComponentSummaryList): Self = StObject.set(x, "studioComponentSummaries", value.asInstanceOf[js.Any])
    
    inline def setStudioComponentSummariesUndefined: Self = StObject.set(x, "studioComponentSummaries", js.undefined)
    
    inline def setStudioComponentSummariesVarargs(value: StudioComponentSummary*): Self = StObject.set(x, "studioComponentSummaries", js.Array(value*))
  }
}
