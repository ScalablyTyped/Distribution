package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mp3Settings extends StObject {
  
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[integerMin16000Max320000] = js.undefined
  
  /**
    * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.undefined
  
  /**
    * Specify whether the service encodes this MP3 audio output with a constant bitrate (CBR) or a variable bitrate (VBR).
    */
  var RateControlMode: js.UndefOr[Mp3RateControlMode] = js.undefined
  
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin22050Max48000] = js.undefined
  
  /**
    * Required when you set Bitrate control mode (rateControlMode) to VBR. Specify the audio quality of this MP3 output from 0 (highest quality) to 9 (lowest quality).
    */
  var VbrQuality: js.UndefOr[integerMin0Max9] = js.undefined
}
object Mp3Settings {
  
  inline def apply(): Mp3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp3Settings]
  }
  
  extension [Self <: Mp3Settings](x: Self) {
    
    inline def setBitrate(value: integerMin16000Max320000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setChannels(value: integerMin1Max2): Self = StObject.set(x, "Channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "Channels", js.undefined)
    
    inline def setRateControlMode(value: Mp3RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    inline def setSampleRate(value: integerMin22050Max48000): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    inline def setVbrQuality(value: integerMin0Max9): Self = StObject.set(x, "VbrQuality", value.asInstanceOf[js.Any])
    
    inline def setVbrQualityUndefined: Self = StObject.set(x, "VbrQuality", js.undefined)
  }
}
