package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeChannelResponse extends StObject {
  
  /**
    * The ARN of the channel.
    */
  var Arn: js.UndefOr[_String] = js.undefined
  
  /**
    * The name of the channel.
    */
  var ChannelName: js.UndefOr[_String] = js.undefined
  
  /**
    * Indicates whether the channel is in a running state or not.
    */
  var ChannelState: js.UndefOr[typings.awsSdk.clientsMediatailorMod.ChannelState] = js.undefined
  
  /**
    * The timestamp of when the channel was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Contains information about the slate used to fill gaps between programs in the schedule.
    */
  var FillerSlate: js.UndefOr[SlateSource] = js.undefined
  
  /**
    * The timestamp of when the channel was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The log configuration for the channel.
    */
  var LogConfiguration: LogConfigurationForChannel
  
  /**
    * The channel's output properties.
    */
  var Outputs: js.UndefOr[ResponseOutputs] = js.undefined
  
  /**
    * The channel's playback mode.
    */
  var PlaybackMode: js.UndefOr[_String] = js.undefined
  
  /**
    * The tags assigned to the channel. Tags are key-value pairs that you can associate with Amazon resources to help with organization, access control, and cost tracking. For more information, see Tagging AWS Elemental MediaTailor Resources.
    */
  var Tags: js.UndefOr[mapOfString] = js.undefined
  
  /**
    * The channel's tier.
    */
  var Tier: js.UndefOr[_String] = js.undefined
}
object DescribeChannelResponse {
  
  inline def apply(LogConfiguration: LogConfigurationForChannel): DescribeChannelResponse = {
    val __obj = js.Dynamic.literal(LogConfiguration = LogConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
    
    inline def setChannelState(value: ChannelState): Self = StObject.set(x, "ChannelState", value.asInstanceOf[js.Any])
    
    inline def setChannelStateUndefined: Self = StObject.set(x, "ChannelState", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setFillerSlate(value: SlateSource): Self = StObject.set(x, "FillerSlate", value.asInstanceOf[js.Any])
    
    inline def setFillerSlateUndefined: Self = StObject.set(x, "FillerSlate", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setLogConfiguration(value: LogConfigurationForChannel): Self = StObject.set(x, "LogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: ResponseOutputs): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "Outputs", js.undefined)
    
    inline def setOutputsVarargs(value: ResponseOutputItem*): Self = StObject.set(x, "Outputs", js.Array(value*))
    
    inline def setPlaybackMode(value: _String): Self = StObject.set(x, "PlaybackMode", value.asInstanceOf[js.Any])
    
    inline def setPlaybackModeUndefined: Self = StObject.set(x, "PlaybackMode", js.undefined)
    
    inline def setTags(value: mapOfString): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTier(value: _String): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
  }
}
