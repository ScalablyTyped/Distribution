package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientLoginBannerOptions extends StObject {
  
  /**
    * Customizable text that will be displayed in a banner on Amazon Web Services provided clients when a VPN session is established. UTF-8 encoded characters only. Maximum of 1400 characters.
    */
  var BannerText: js.UndefOr[String] = js.undefined
  
  /**
    * Enable or disable a customizable text banner that will be displayed on Amazon Web Services provided clients when a VPN session is established. Valid values: true | false  Default value: false 
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object ClientLoginBannerOptions {
  
  inline def apply(): ClientLoginBannerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientLoginBannerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientLoginBannerOptions] (val x: Self) extends AnyVal {
    
    inline def setBannerText(value: String): Self = StObject.set(x, "BannerText", value.asInstanceOf[js.Any])
    
    inline def setBannerTextUndefined: Self = StObject.set(x, "BannerText", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
