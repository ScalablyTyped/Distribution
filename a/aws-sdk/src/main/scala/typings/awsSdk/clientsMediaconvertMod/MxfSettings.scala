package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MxfSettings extends StObject {
  
  /**
    * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding settings.
    */
  var AfdSignaling: js.UndefOr[MxfAfdSignaling] = js.undefined
  
  /**
    * Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more information about the automatic selection behavior, see https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
    */
  var Profile: js.UndefOr[MxfProfile] = js.undefined
  
  /**
    * Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
    */
  var XavcProfileSettings: js.UndefOr[MxfXavcProfileSettings] = js.undefined
}
object MxfSettings {
  
  inline def apply(): MxfSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MxfSettings]
  }
  
  extension [Self <: MxfSettings](x: Self) {
    
    inline def setAfdSignaling(value: MxfAfdSignaling): Self = StObject.set(x, "AfdSignaling", value.asInstanceOf[js.Any])
    
    inline def setAfdSignalingUndefined: Self = StObject.set(x, "AfdSignaling", js.undefined)
    
    inline def setProfile(value: MxfProfile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    inline def setXavcProfileSettings(value: MxfXavcProfileSettings): Self = StObject.set(x, "XavcProfileSettings", value.asInstanceOf[js.Any])
    
    inline def setXavcProfileSettingsUndefined: Self = StObject.set(x, "XavcProfileSettings", js.undefined)
  }
}
