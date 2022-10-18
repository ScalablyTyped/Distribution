package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientLoginBannerResponseOptions extends StObject {
  
  /**
    * Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN session is established. UTF-8 encoded characters only. Maximum of 1400 characters.
    */
  var BannerText: js.UndefOr[String] = js.undefined
  
  /**
    * Current state of text banner feature. Valid values: true | false 
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object ClientLoginBannerResponseOptions {
  
  inline def apply(): ClientLoginBannerResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientLoginBannerResponseOptions]
  }
  
  extension [Self <: ClientLoginBannerResponseOptions](x: Self) {
    
    inline def setBannerText(value: String): Self = StObject.set(x, "BannerText", value.asInstanceOf[js.Any])
    
    inline def setBannerTextUndefined: Self = StObject.set(x, "BannerText", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
