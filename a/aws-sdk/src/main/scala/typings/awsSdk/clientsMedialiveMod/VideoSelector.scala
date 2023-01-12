package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoSelector extends StObject {
  
  /**
    * Specifies the color space of an input. This setting works in tandem with colorSpaceUsage and a video description's colorSpaceSettingsChoice to determine if any conversion will be performed.
    */
  var ColorSpace: js.UndefOr[VideoSelectorColorSpace] = js.undefined
  
  /**
    * Color space settings
    */
  var ColorSpaceSettings: js.UndefOr[VideoSelectorColorSpaceSettings] = js.undefined
  
  /**
    * Applies only if colorSpace is a value other than follow. This field controls how the value in the colorSpace field will be used. fallback means that when the input does include color space data, that data will be used, but when the input has no color space data, the value in colorSpace will be used. Choose fallback if your input is sometimes missing color space data, but when it does have color space data, that data is correct. force means to always use the value in colorSpace. Choose force if your input usually has no color space data or might have unreliable color space data.
    */
  var ColorSpaceUsage: js.UndefOr[VideoSelectorColorSpaceUsage] = js.undefined
  
  /**
    * The video selector settings.
    */
  var SelectorSettings: js.UndefOr[VideoSelectorSettings] = js.undefined
}
object VideoSelector {
  
  inline def apply(): VideoSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoSelector] (val x: Self) extends AnyVal {
    
    inline def setColorSpace(value: VideoSelectorColorSpace): Self = StObject.set(x, "ColorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceSettings(value: VideoSelectorColorSpaceSettings): Self = StObject.set(x, "ColorSpaceSettings", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceSettingsUndefined: Self = StObject.set(x, "ColorSpaceSettings", js.undefined)
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "ColorSpace", js.undefined)
    
    inline def setColorSpaceUsage(value: VideoSelectorColorSpaceUsage): Self = StObject.set(x, "ColorSpaceUsage", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUsageUndefined: Self = StObject.set(x, "ColorSpaceUsage", js.undefined)
    
    inline def setSelectorSettings(value: VideoSelectorSettings): Self = StObject.set(x, "SelectorSettings", value.asInstanceOf[js.Any])
    
    inline def setSelectorSettingsUndefined: Self = StObject.set(x, "SelectorSettings", js.undefined)
  }
}
