package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputGroupSettings extends StObject {
  
  /**
    * Settings related to your CMAF output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to CMAF_GROUP_SETTINGS.
    */
  var CmafGroupSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.CmafGroupSettings] = js.undefined
  
  /**
    * Settings related to your DASH output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to DASH_ISO_GROUP_SETTINGS.
    */
  var DashIsoGroupSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.DashIsoGroupSettings] = js.undefined
  
  /**
    * Settings related to your File output group. MediaConvert uses this group of settings to generate a single standalone file, rather than a streaming package. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to FILE_GROUP_SETTINGS.
    */
  var FileGroupSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.FileGroupSettings] = js.undefined
  
  /**
    * Settings related to your HLS output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to HLS_GROUP_SETTINGS.
    */
  var HlsGroupSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.HlsGroupSettings] = js.undefined
  
  /**
    * Settings related to your Microsoft Smooth Streaming output package. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/outputs-file-ABR.html. When you work directly in your JSON job specification, include this object and any required children when you set Type, under OutputGroupSettings, to MS_SMOOTH_GROUP_SETTINGS.
    */
  var MsSmoothGroupSettings: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.MsSmoothGroupSettings] = js.undefined
  
  /**
    * Type of output group (File group, Apple HLS, DASH ISO, Microsoft Smooth Streaming, CMAF)
    */
  var Type: js.UndefOr[OutputGroupType] = js.undefined
}
object OutputGroupSettings {
  
  inline def apply(): OutputGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputGroupSettings] (val x: Self) extends AnyVal {
    
    inline def setCmafGroupSettings(value: CmafGroupSettings): Self = StObject.set(x, "CmafGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setCmafGroupSettingsUndefined: Self = StObject.set(x, "CmafGroupSettings", js.undefined)
    
    inline def setDashIsoGroupSettings(value: DashIsoGroupSettings): Self = StObject.set(x, "DashIsoGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setDashIsoGroupSettingsUndefined: Self = StObject.set(x, "DashIsoGroupSettings", js.undefined)
    
    inline def setFileGroupSettings(value: FileGroupSettings): Self = StObject.set(x, "FileGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setFileGroupSettingsUndefined: Self = StObject.set(x, "FileGroupSettings", js.undefined)
    
    inline def setHlsGroupSettings(value: HlsGroupSettings): Self = StObject.set(x, "HlsGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsGroupSettingsUndefined: Self = StObject.set(x, "HlsGroupSettings", js.undefined)
    
    inline def setMsSmoothGroupSettings(value: MsSmoothGroupSettings): Self = StObject.set(x, "MsSmoothGroupSettings", value.asInstanceOf[js.Any])
    
    inline def setMsSmoothGroupSettingsUndefined: Self = StObject.set(x, "MsSmoothGroupSettings", js.undefined)
    
    inline def setType(value: OutputGroupType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
