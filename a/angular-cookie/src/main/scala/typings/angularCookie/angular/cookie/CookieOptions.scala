package typings.angularCookie.angular.cookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CookieOptions extends js.Object {
  
  /**
    * The method that will be used to decode extracted cookie values (should be passed when using Get).
    */
  var decode: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  /**
    * The domain tells the browser to which domain the cookie should be sent. If you don't specify it, it becomes the domain of the page that sets the cookie.
    */
  var domain: js.UndefOr[String] = js.native
  
  /**
    * The method that will be used to encode the cookie value (should be passed when using Set).
    */
  var encode: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  
  /**
    * Allows you to set the expiration time in hours, minutes, seconds, or `milliseconds. If this is not specified, any expiration time specified will default to days.
    */
  var expirationUnit: js.UndefOr[String] = js.native
  
  /**
    * Each cookie has an expiry date after which it is trashed. If you don't specify the expiry date the cookie is trashed when you close the browser.
    */
  var expires: js.UndefOr[Double] = js.native
  
  /**
    * The path gives you the chance to specify a directory where the cookie is active.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * The Secure attribute is meant to keep cookie communication limited to encrypted transmission, directing browsers to use cookies only via secure/encrypted connections.
    */
  var secure: js.UndefOr[Boolean] = js.native
}
object CookieOptions {
  
  @scala.inline
  def apply(): CookieOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CookieOptions]
  }
  
  @scala.inline
  implicit class CookieOptionsOps[Self <: CookieOptions] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: /* value */ js.Any => _): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDecode: Self = this.set("decode", js.undefined)
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setEncode(value: /* value */ js.Any => _): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEncode: Self = this.set("encode", js.undefined)
    
    @scala.inline
    def setExpirationUnit(value: String): Self = this.set("expirationUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationUnit: Self = this.set("expirationUnit", js.undefined)
    
    @scala.inline
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
}
