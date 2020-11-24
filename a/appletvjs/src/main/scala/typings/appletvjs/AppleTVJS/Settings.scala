package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  /** Contains the language the device displays information in. */
  var language: String = js.native
  
  /**
    * Called when changes to a device’s restriction information changes.
    */
  def onRestrictionsChange(): Unit = js.native
  
  /** Contains the restriction information on the device. */
  var restrictions: Restrictions = js.native
  
  /** Contains the country code used by the store on this device. */
  var storefrontCountryCode: String = js.native
}
object Settings {
  
  @scala.inline
  def apply(
    language: String,
    onRestrictionsChange: () => Unit,
    restrictions: Restrictions,
    storefrontCountryCode: String
  ): Settings = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], onRestrictionsChange = js.Any.fromFunction0(onRestrictionsChange), restrictions = restrictions.asInstanceOf[js.Any], storefrontCountryCode = storefrontCountryCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnRestrictionsChange(value: () => Unit): Self = this.set("onRestrictionsChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestrictions(value: Restrictions): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorefrontCountryCode(value: String): Self = this.set("storefrontCountryCode", value.asInstanceOf[js.Any])
  }
}
