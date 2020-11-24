package typings.angularCookies.mod.angularAugmentingMod.cookies

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Cookies options
  * see https://docs.angularjs.org/api/ngCookies/provider/$cookiesProvider#defaults
  */
@js.native
trait ICookiesOptions extends js.Object {
  
  /**
    * The cookie will be available only for this domain and its sub-domains.
    * For obvious security reasons the user agent will not accept the cookie if the
    * current domain is not a sub domain or equals to the requested domain.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * String of the form "Wdy, DD Mon YYYY HH:MM:SS GMT" or a Date object
    * indicating the exact date/time this cookie will expire.
    */
  var expires: js.UndefOr[String | Date] = js.native
  
  /**
    * The cookie will be available only for this path and its sub-paths.
    * By default, this would be the URL that appears in your base tag.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Prevents the browser from sending the cookie along with cross-site requests.
    * Accepts the values "lax" and "strict".
    */
  var samesite: js.UndefOr[String] = js.native
  
  /**
    * The cookie will be available only in secured connection.
    */
  var secure: js.UndefOr[Boolean] = js.native
}
object ICookiesOptions {
  
  @scala.inline
  def apply(): ICookiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICookiesOptions]
  }
  
  @scala.inline
  implicit class ICookiesOptionsOps[Self <: ICookiesOptions] (val x: Self) extends AnyVal {
    
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExpires(value: String | Date): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSamesite(value: String): Self = this.set("samesite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamesite: Self = this.set("samesite", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
}
