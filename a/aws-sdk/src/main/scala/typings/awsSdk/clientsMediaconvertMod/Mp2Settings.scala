package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mp2Settings extends StObject {
  
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[integerMin32000Max384000] = js.undefined
  
  /**
    * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.undefined
  
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin32000Max48000] = js.undefined
}
object Mp2Settings {
  
  inline def apply(): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp2Settings]
  }
  
  extension [Self <: Mp2Settings](x: Self) {
    
    inline def setBitrate(value: integerMin32000Max384000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setChannels(value: integerMin1Max2): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setSampleRate(value: integerMin32000Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
  }
}
