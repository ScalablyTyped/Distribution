package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDeviceUhdSettings extends StObject {
  
  /**
    * If you specified Auto as the configured input, specifies which of the sources is currently active (SDI or HDMI).
    */
  var ActiveInput: js.UndefOr[InputDeviceActiveInput] = js.undefined
  
  /**
    * The source at the input device that is currently active. You can specify this source.
    */
  var ConfiguredInput: js.UndefOr[InputDeviceConfiguredInput] = js.undefined
  
  /**
    * The state of the input device.
    */
  var DeviceState: js.UndefOr[InputDeviceState] = js.undefined
  
  /**
    * The frame rate of the video source.
    */
  var Framerate: js.UndefOr[double] = js.undefined
  
  /**
    * The height of the video source, in pixels.
    */
  var Height: js.UndefOr[integer] = js.undefined
  
  /**
    * The Link device's buffer size (latency) in milliseconds (ms). You can specify this value.
    */
  var LatencyMs: js.UndefOr[integer] = js.undefined
  
  /**
    * The current maximum bitrate for ingesting this source, in bits per second. You can specify this maximum.
    */
  var MaxBitrate: js.UndefOr[integer] = js.undefined
  
  /**
    * The scan type of the video source.
    */
  var ScanType: js.UndefOr[InputDeviceScanType] = js.undefined
  
  /**
    * The width of the video source, in pixels.
    */
  var Width: js.UndefOr[integer] = js.undefined
}
object InputDeviceUhdSettings {
  
  inline def apply(): InputDeviceUhdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceUhdSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDeviceUhdSettings] (val x: Self) extends AnyVal {
    
    inline def setActiveInput(value: InputDeviceActiveInput): Self = StObject.set(x, "ActiveInput", value.asInstanceOf[js.Any])
    
    inline def setActiveInputUndefined: Self = StObject.set(x, "ActiveInput", js.undefined)
    
    inline def setConfiguredInput(value: InputDeviceConfiguredInput): Self = StObject.set(x, "ConfiguredInput", value.asInstanceOf[js.Any])
    
    inline def setConfiguredInputUndefined: Self = StObject.set(x, "ConfiguredInput", js.undefined)
    
    inline def setDeviceState(value: InputDeviceState): Self = StObject.set(x, "DeviceState", value.asInstanceOf[js.Any])
    
    inline def setDeviceStateUndefined: Self = StObject.set(x, "DeviceState", js.undefined)
    
    inline def setFramerate(value: double): Self = StObject.set(x, "Framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "Framerate", js.undefined)
    
    inline def setHeight(value: integer): Self = StObject.set(x, "Height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "Height", js.undefined)
    
    inline def setLatencyMs(value: integer): Self = StObject.set(x, "LatencyMs", value.asInstanceOf[js.Any])
    
    inline def setLatencyMsUndefined: Self = StObject.set(x, "LatencyMs", js.undefined)
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setScanType(value: InputDeviceScanType): Self = StObject.set(x, "ScanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "ScanType", js.undefined)
    
    inline def setWidth(value: integer): Self = StObject.set(x, "Width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "Width", js.undefined)
  }
}
