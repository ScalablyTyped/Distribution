package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HlsCdnSettings extends StObject {
  
  var HlsAkamaiSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.HlsAkamaiSettings] = js.undefined
  
  var HlsBasicPutSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.HlsBasicPutSettings] = js.undefined
  
  var HlsMediaStoreSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.HlsMediaStoreSettings] = js.undefined
  
  var HlsS3Settings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.HlsS3Settings] = js.undefined
  
  var HlsWebdavSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.HlsWebdavSettings] = js.undefined
}
object HlsCdnSettings {
  
  inline def apply(): HlsCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HlsCdnSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HlsCdnSettings] (val x: Self) extends AnyVal {
    
    inline def setHlsAkamaiSettings(value: HlsAkamaiSettings): Self = StObject.set(x, "HlsAkamaiSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsAkamaiSettingsUndefined: Self = StObject.set(x, "HlsAkamaiSettings", js.undefined)
    
    inline def setHlsBasicPutSettings(value: HlsBasicPutSettings): Self = StObject.set(x, "HlsBasicPutSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsBasicPutSettingsUndefined: Self = StObject.set(x, "HlsBasicPutSettings", js.undefined)
    
    inline def setHlsMediaStoreSettings(value: HlsMediaStoreSettings): Self = StObject.set(x, "HlsMediaStoreSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsMediaStoreSettingsUndefined: Self = StObject.set(x, "HlsMediaStoreSettings", js.undefined)
    
    inline def setHlsS3Settings(value: HlsS3Settings): Self = StObject.set(x, "HlsS3Settings", value.asInstanceOf[js.Any])
    
    inline def setHlsS3SettingsUndefined: Self = StObject.set(x, "HlsS3Settings", js.undefined)
    
    inline def setHlsWebdavSettings(value: HlsWebdavSettings): Self = StObject.set(x, "HlsWebdavSettings", value.asInstanceOf[js.Any])
    
    inline def setHlsWebdavSettingsUndefined: Self = StObject.set(x, "HlsWebdavSettings", js.undefined)
  }
}
