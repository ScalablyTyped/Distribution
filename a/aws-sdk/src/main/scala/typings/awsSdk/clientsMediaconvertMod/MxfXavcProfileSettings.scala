package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MxfXavcProfileSettings extends StObject {
  
  /**
    * To create an output that complies with the XAVC file format guidelines for interoperability, keep the default value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your input in this output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of frames that MediaConvert excludes when you set this to Drop frames for compliance depends on the output frame rate and duration.
    */
  var DurationMode: js.UndefOr[MxfXavcDurationMode] = js.undefined
  
  /**
    * Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles: XAVC HD Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of space in each frame that the service reserves for ancillary data, such as teletext captions. The default value for this setting is 1492 bytes per frame. This should be sufficient to prevent overflow unless you have multiple pages of teletext captions data. If you have a large amount of teletext data, specify a larger number.
    */
  var MaxAncDataSize: js.UndefOr[integerMin0Max2147483647] = js.undefined
}
object MxfXavcProfileSettings {
  
  inline def apply(): MxfXavcProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MxfXavcProfileSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MxfXavcProfileSettings] (val x: Self) extends AnyVal {
    
    inline def setDurationMode(value: MxfXavcDurationMode): Self = StObject.set(x, "DurationMode", value.asInstanceOf[js.Any])
    
    inline def setDurationModeUndefined: Self = StObject.set(x, "DurationMode", js.undefined)
    
    inline def setMaxAncDataSize(value: integerMin0Max2147483647): Self = StObject.set(x, "MaxAncDataSize", value.asInstanceOf[js.Any])
    
    inline def setMaxAncDataSizeUndefined: Self = StObject.set(x, "MaxAncDataSize", js.undefined)
  }
}
