package typings.awsSdk.chimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactsConcatenationConfiguration extends StObject {
  
  /**
    * The configuration for the audio artifacts concatenation.
    */
  var Audio: AudioConcatenationConfiguration
  
  /**
    * The configuration for the composited video artifacts concatenation.
    */
  var CompositedVideo: CompositedVideoConcatenationConfiguration
  
  /**
    * The configuration for the content artifacts concatenation.
    */
  var Content: ContentConcatenationConfiguration
  
  /**
    * The configuration for the data channel artifacts concatenation.
    */
  var DataChannel: DataChannelConcatenationConfiguration
  
  /**
    * The configuration for the meeting events artifacts concatenation.
    */
  var MeetingEvents: MeetingEventsConcatenationConfiguration
  
  /**
    * The configuration for the transcription messages artifacts concatenation.
    */
  var TranscriptionMessages: TranscriptionMessagesConcatenationConfiguration
  
  /**
    * The configuration for the video artifacts concatenation.
    */
  var Video: VideoConcatenationConfiguration
}
object ArtifactsConcatenationConfiguration {
  
  inline def apply(
    Audio: AudioConcatenationConfiguration,
    CompositedVideo: CompositedVideoConcatenationConfiguration,
    Content: ContentConcatenationConfiguration,
    DataChannel: DataChannelConcatenationConfiguration,
    MeetingEvents: MeetingEventsConcatenationConfiguration,
    TranscriptionMessages: TranscriptionMessagesConcatenationConfiguration,
    Video: VideoConcatenationConfiguration
  ): ArtifactsConcatenationConfiguration = {
    val __obj = js.Dynamic.literal(Audio = Audio.asInstanceOf[js.Any], CompositedVideo = CompositedVideo.asInstanceOf[js.Any], Content = Content.asInstanceOf[js.Any], DataChannel = DataChannel.asInstanceOf[js.Any], MeetingEvents = MeetingEvents.asInstanceOf[js.Any], TranscriptionMessages = TranscriptionMessages.asInstanceOf[js.Any], Video = Video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactsConcatenationConfiguration]
  }
  
  extension [Self <: ArtifactsConcatenationConfiguration](x: Self) {
    
    inline def setAudio(value: AudioConcatenationConfiguration): Self = StObject.set(x, "Audio", value.asInstanceOf[js.Any])
    
    inline def setCompositedVideo(value: CompositedVideoConcatenationConfiguration): Self = StObject.set(x, "CompositedVideo", value.asInstanceOf[js.Any])
    
    inline def setContent(value: ContentConcatenationConfiguration): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setDataChannel(value: DataChannelConcatenationConfiguration): Self = StObject.set(x, "DataChannel", value.asInstanceOf[js.Any])
    
    inline def setMeetingEvents(value: MeetingEventsConcatenationConfiguration): Self = StObject.set(x, "MeetingEvents", value.asInstanceOf[js.Any])
    
    inline def setTranscriptionMessages(value: TranscriptionMessagesConcatenationConfiguration): Self = StObject.set(x, "TranscriptionMessages", value.asInstanceOf[js.Any])
    
    inline def setVideo(value: VideoConcatenationConfiguration): Self = StObject.set(x, "Video", value.asInstanceOf[js.Any])
  }
}
