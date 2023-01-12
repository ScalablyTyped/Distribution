package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiplexVideoSettings extends StObject {
  
  /**
    * The constant bitrate configuration for the video encode.
  When this field is defined, StatmuxSettings must be undefined.
    */
  var ConstantBitrate: js.UndefOr[integerMin100000Max100000000] = js.undefined
  
  /**
    * Statmux rate control settings.
  When this field is defined, ConstantBitrate must be undefined.
    */
  var StatmuxSettings: js.UndefOr[MultiplexStatmuxVideoSettings] = js.undefined
}
object MultiplexVideoSettings {
  
  inline def apply(): MultiplexVideoSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiplexVideoSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MultiplexVideoSettings] (val x: Self) extends AnyVal {
    
    inline def setConstantBitrate(value: integerMin100000Max100000000): Self = StObject.set(x, "ConstantBitrate", value.asInstanceOf[js.Any])
    
    inline def setConstantBitrateUndefined: Self = StObject.set(x, "ConstantBitrate", js.undefined)
    
    inline def setStatmuxSettings(value: MultiplexStatmuxVideoSettings): Self = StObject.set(x, "StatmuxSettings", value.asInstanceOf[js.Any])
    
    inline def setStatmuxSettingsUndefined: Self = StObject.set(x, "StatmuxSettings", js.undefined)
  }
}
