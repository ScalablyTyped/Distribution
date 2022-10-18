package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordingConfiguration extends StObject {
  
  /**
    * Recording-configuration ARN.
    */
  var arn: RecordingConfigurationArn
  
  /**
    * A complex type that contains information about where recorded video will be stored.
    */
  var destinationConfiguration: DestinationConfiguration
  
  /**
    * Recording-configuration name. The value does not need to be unique.
    */
  var name: js.UndefOr[RecordingConfigurationName] = js.undefined
  
  /**
    * If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be considered a single broadcast and merged together. Default: 0.
    */
  var recordingReconnectWindowSeconds: js.UndefOr[RecordingReconnectWindowSeconds] = js.undefined
  
  /**
    * Indicates the current state of the recording configuration. When the state is ACTIVE, the configuration is ready for recording a channel stream.
    */
  var state: RecordingConfigurationState
  
  /**
    * Array of 1-50 maps, each of the form string:string (key:value). See Tagging Amazon Web Services Resources for more information, including restrictions that apply to tags and "Tag naming limits and requirements"; Amazon IVS has no service-specific constraints beyond what is documented there.
    */
  var tags: js.UndefOr[Tags] = js.undefined
  
  /**
    * A complex type that allows you to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
    */
  var thumbnailConfiguration: js.UndefOr[ThumbnailConfiguration] = js.undefined
}
object RecordingConfiguration {
  
  inline def apply(
    arn: RecordingConfigurationArn,
    destinationConfiguration: DestinationConfiguration,
    state: RecordingConfigurationState
  ): RecordingConfiguration = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], destinationConfiguration = destinationConfiguration.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordingConfiguration]
  }
  
  extension [Self <: RecordingConfiguration](x: Self) {
    
    inline def setArn(value: RecordingConfigurationArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setDestinationConfiguration(value: DestinationConfiguration): Self = StObject.set(x, "destinationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setName(value: RecordingConfigurationName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecordingReconnectWindowSeconds(value: RecordingReconnectWindowSeconds): Self = StObject.set(x, "recordingReconnectWindowSeconds", value.asInstanceOf[js.Any])
    
    inline def setRecordingReconnectWindowSecondsUndefined: Self = StObject.set(x, "recordingReconnectWindowSeconds", js.undefined)
    
    inline def setState(value: RecordingConfigurationState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setThumbnailConfiguration(value: ThumbnailConfiguration): Self = StObject.set(x, "thumbnailConfiguration", value.asInstanceOf[js.Any])
    
    inline def setThumbnailConfigurationUndefined: Self = StObject.set(x, "thumbnailConfiguration", js.undefined)
  }
}
