package typings.agoraRtcSdk.mod

import typings.agoraRtcSdk.anon.Height
import typings.agoraRtcSdk.anon.Max
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The video encoder configuration.
  *
  * This interface sets the video encoder configuration in {@link setVideoEncoderConfiguration}.
  *
  * Depending on the OS, browser, and camera, the actual resolution, frame rate, and bitrate might be different from the set values.
  */
trait VideoEncoderConfiguration extends StObject {
  
  /**
    * The video bitrate (Kbps). The value range is [1,10000000].
    *
    * We recommend setting the bitrate between 100 Kbps and 5000 Kbps. You can refer to the table below and set your bitrate.
    *
    * [[include:VideoProfileDefinition.md]]
    */
  var bitrate: js.UndefOr[Max] = js.undefined
  
  /**
    * The video frame rate (fps).
    *
    * The value range is [1, 10000]. We recommend setting the frame rate between 5 fps and 30 fps.
    *
    * **Note**
    * - This parameter sets the local capturing video frame rate. The actual encoding frame rate depends on the device, system, and browser.
    * - When the network conditions change, the browser adjusts the encoding frame rate automatically.
    */
  var frameRate: js.UndefOr[Max] = js.undefined
  
  /**
    * Resolution of the video.
    *
    * We recommend using common resolutions, for example:
    *
    * - 480 &times; 360
    * - 640 &times; 480
    * - 960 &times; 720
    *
    */
  var resolution: js.UndefOr[Height] = js.undefined
}
object VideoEncoderConfiguration {
  
  @scala.inline
  def apply(): VideoEncoderConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoEncoderConfiguration]
  }
  
  @scala.inline
  implicit class VideoEncoderConfigurationMutableBuilder[Self <: VideoEncoderConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBitrate(value: Max): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    @scala.inline
    def setFrameRate(value: Max): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
    
    @scala.inline
    def setResolution(value: Height): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
