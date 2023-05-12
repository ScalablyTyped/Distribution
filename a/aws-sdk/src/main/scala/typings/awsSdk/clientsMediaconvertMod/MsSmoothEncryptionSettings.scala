package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MsSmoothEncryptionSettings extends StObject {
  
  /**
    * If your output group type is HLS, DASH, or Microsoft Smooth, use these settings when doing DRM encryption with a SPEKE-compliant key provider. If your output group type is CMAF, use the SpekeKeyProviderCmaf settings instead.
    */
  var SpekeKeyProvider: js.UndefOr[typings.awsSdk.clientsMediaconvertMod.SpekeKeyProvider] = js.undefined
}
object MsSmoothEncryptionSettings {
  
  inline def apply(): MsSmoothEncryptionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MsSmoothEncryptionSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MsSmoothEncryptionSettings] (val x: Self) extends AnyVal {
    
    inline def setSpekeKeyProvider(value: SpekeKeyProvider): Self = StObject.set(x, "SpekeKeyProvider", value.asInstanceOf[js.Any])
    
    inline def setSpekeKeyProviderUndefined: Self = StObject.set(x, "SpekeKeyProvider", js.undefined)
  }
}
