package typings.angularCookies.mod.angularAugmentingMod.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CookiesProvider
  * see https://docs.angularjs.org/api/ngCookies/provider/$cookiesProvider
  */
@js.native
trait ICookiesProvider extends js.Object {
  
  /**
    * Object containing default options to pass when setting cookies.
    */
  var defaults: ICookiesOptions = js.native
}
object ICookiesProvider {
  
  @scala.inline
  def apply(defaults: ICookiesOptions): ICookiesProvider = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICookiesProvider]
  }
  
  @scala.inline
  implicit class ICookiesProviderOps[Self <: ICookiesProvider] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: ICookiesOptions): Self = this.set("defaults", value.asInstanceOf[js.Any])
  }
}
