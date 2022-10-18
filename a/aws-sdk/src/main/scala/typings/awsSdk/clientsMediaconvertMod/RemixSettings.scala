package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemixSettings extends StObject {
  
  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel, in dB. Specify remix values to indicate how much of the content from your input audio channel you want in your output audio channels. Each instance of the InputChannels or InputChannelsFineTune array specifies these values for one output channel. Use one instance of this array for each output channel. In the console, each array corresponds to a column in the graphical depiction of the mapping matrix. The rows of the graphical matrix correspond to input channels. Valid values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification). Use InputChannels or InputChannelsFineTune to specify your remix values. Don't use both.
    */
  var ChannelMapping: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.ChannelMapping] = js.undefined
  
  /**
    * Specify the number of audio channels from your input that you want to use in your output. With remixing, you might combine or split the data in these channels, so the number of channels in your final output might be different. If you are doing both input channel mapping and output channel mapping, the number of output channels in your input mapping must be the same as the number of input channels in your output mapping.
    */
  var ChannelsIn: js.UndefOr[integerMin1Max64] = js.undefined
  
  /**
    * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.) If you are doing both input channel mapping and output channel mapping, the number of output channels in your input mapping must be the same as the number of input channels in your output mapping.
    */
  var ChannelsOut: js.UndefOr[integerMin1Max64] = js.undefined
}
object RemixSettings {
  
  inline def apply(): RemixSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemixSettings]
  }
  
  extension [Self <: RemixSettings](x: Self) {
    
    inline def setChannelMapping(value: ChannelMapping): Self = StObject.set(x, "ChannelMapping", value.asInstanceOf[js.Any])
    
    inline def setChannelMappingUndefined: Self = StObject.set(x, "ChannelMapping", js.undefined)
    
    inline def setChannelsIn(value: integerMin1Max64): Self = StObject.set(x, "ChannelsIn", value.asInstanceOf[js.Any])
    
    inline def setChannelsInUndefined: Self = StObject.set(x, "ChannelsIn", js.undefined)
    
    inline def setChannelsOut(value: integerMin1Max64): Self = StObject.set(x, "ChannelsOut", value.asInstanceOf[js.Any])
    
    inline def setChannelsOutUndefined: Self = StObject.set(x, "ChannelsOut", js.undefined)
  }
}
