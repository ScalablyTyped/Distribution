package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaCapturePipelineSourceConfiguration extends StObject {
  
  /**
    * The meeting configuration settings in a media capture pipeline configuration object. 
    */
  var ChimeSdkMeetingConfiguration: ChimeSdkMeetingConcatenationConfiguration
  
  /**
    * The media pipeline ARN in the configuration object of a media capture pipeline.
    */
  var MediaPipelineArn: Arn
}
object MediaCapturePipelineSourceConfiguration {
  
  inline def apply(ChimeSdkMeetingConfiguration: ChimeSdkMeetingConcatenationConfiguration, MediaPipelineArn: Arn): MediaCapturePipelineSourceConfiguration = {
    val __obj = js.Dynamic.literal(ChimeSdkMeetingConfiguration = ChimeSdkMeetingConfiguration.asInstanceOf[js.Any], MediaPipelineArn = MediaPipelineArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaCapturePipelineSourceConfiguration]
  }
  
  extension [Self <: MediaCapturePipelineSourceConfiguration](x: Self) {
    
    inline def setChimeSdkMeetingConfiguration(value: ChimeSdkMeetingConcatenationConfiguration): Self = StObject.set(x, "ChimeSdkMeetingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMediaPipelineArn(value: Arn): Self = StObject.set(x, "MediaPipelineArn", value.asInstanceOf[js.Any])
  }
}
