package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channel extends StObject {
  
  /**
    * Channel ARN.
    */
  var arn: js.UndefOr[ChannelArn] = js.undefined
  
  /**
    * Whether the channel is private (enabled for playback authorization). Default: false.
    */
  var authorized: js.UndefOr[IsAuthorized] = js.undefined
  
  /**
    * Channel ingest endpoint, part of the definition of an ingest server, used when you set up streaming software.
    */
  var ingestEndpoint: js.UndefOr[IngestEndpoint] = js.undefined
  
  /**
    * Channel latency mode. Use NORMAL to broadcast and deliver live video up to Full HD. Use LOW for near-real-time interaction with viewers. Default: LOW. (Note: In the Amazon IVS console, LOW and NORMAL correspond to Ultra-low and Standard, respectively.)
    */
  var latencyMode: js.UndefOr[ChannelLatencyMode] = js.undefined
  
  /**
    * Channel name.
    */
  var name: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * Channel playback URL.
    */
  var playbackUrl: js.UndefOr[PlaybackURL] = js.undefined
  
  /**
    * Recording-configuration ARN. A value other than an empty string indicates that recording is enabled. Default: "" (empty string, recording is disabled).
    */
  var recordingConfigurationArn: js.UndefOr[ChannelRecordingConfigurationArn] = js.undefined
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value). See Tagging Amazon Web Services Resources for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately. Default: STANDARD. Valid values:    STANDARD: Video is transcoded: multiple qualities are generated from the original input, to automatically give viewers the best experience for their devices and network conditions. Transcoding allows higher playback quality across a range of download speeds. Resolution can be up to 1080p and bitrate can be up to 8.5 Mbps. Audio is transcoded only for renditions 360p and below; above that, audio is passed through. This is the default.    BASIC: Video is transmuxed: Amazon IVS delivers the original input to viewers. The viewer’s video-quality choice is limited to the original input. Resolution can be up to 1080p and bitrate can be up to 1.5 Mbps for 480p and up to 3.5 Mbps for resolutions between 480p and 1080p.  
    */
  var `type`: js.UndefOr[ChannelType] = js.undefined
}
object Channel {
  
  inline def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  
  extension [Self <: Channel](x: Self) {
    
    inline def setArn(value: ChannelArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setAuthorized(value: IsAuthorized): Self = StObject.set(x, "authorized", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedUndefined: Self = StObject.set(x, "authorized", js.undefined)
    
    inline def setIngestEndpoint(value: IngestEndpoint): Self = StObject.set(x, "ingestEndpoint", value.asInstanceOf[js.Any])
    
    inline def setIngestEndpointUndefined: Self = StObject.set(x, "ingestEndpoint", js.undefined)
    
    inline def setLatencyMode(value: ChannelLatencyMode): Self = StObject.set(x, "latencyMode", value.asInstanceOf[js.Any])
    
    inline def setLatencyModeUndefined: Self = StObject.set(x, "latencyMode", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlaybackUrl(value: PlaybackURL): Self = StObject.set(x, "playbackUrl", value.asInstanceOf[js.Any])
    
    inline def setPlaybackUrlUndefined: Self = StObject.set(x, "playbackUrl", js.undefined)
    
    inline def setRecordingConfigurationArn(value: ChannelRecordingConfigurationArn): Self = StObject.set(x, "recordingConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setRecordingConfigurationArnUndefined: Self = StObject.set(x, "recordingConfigurationArn", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setType(value: ChannelType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
