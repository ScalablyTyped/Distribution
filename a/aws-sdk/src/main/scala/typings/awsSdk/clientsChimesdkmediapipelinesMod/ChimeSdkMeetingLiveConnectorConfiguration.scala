package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChimeSdkMeetingLiveConnectorConfiguration extends StObject {
  
  /**
    * The configuration object's Chime SDK meeting ARN.
    */
  var Arn: typings.awsSdk.clientsChimesdkmediapipelinesMod.Arn
  
  /**
    * The media pipeline's composited video.
    */
  var CompositedVideo: js.UndefOr[CompositedVideoArtifactsConfiguration] = js.undefined
  
  /**
    * The configuration object's multiplex type.
    */
  var MuxType: LiveConnectorMuxType
  
  /**
    * The source configuration settings of the media pipeline's configuration object.
    */
  var SourceConfiguration: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.SourceConfiguration] = js.undefined
}
object ChimeSdkMeetingLiveConnectorConfiguration {
  
  inline def apply(Arn: Arn, MuxType: LiveConnectorMuxType): ChimeSdkMeetingLiveConnectorConfiguration = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], MuxType = MuxType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChimeSdkMeetingLiveConnectorConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChimeSdkMeetingLiveConnectorConfiguration] (val x: Self) extends AnyVal {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCompositedVideo(value: CompositedVideoArtifactsConfiguration): Self = StObject.set(x, "CompositedVideo", value.asInstanceOf[js.Any])
    
    inline def setCompositedVideoUndefined: Self = StObject.set(x, "CompositedVideo", js.undefined)
    
    inline def setMuxType(value: LiveConnectorMuxType): Self = StObject.set(x, "MuxType", value.asInstanceOf[js.Any])
    
    inline def setSourceConfiguration(value: SourceConfiguration): Self = StObject.set(x, "SourceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceConfigurationUndefined: Self = StObject.set(x, "SourceConfiguration", js.undefined)
  }
}
