package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CookiePreference extends StObject {
  
  /**
    * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this field. If you want to include cookies in the cache key, use a cache policy. For more information, see Creating cache policies in the Amazon CloudFront Developer Guide. If you want to send cookies to the origin but not include them in the cache key, use origin request policy. For more information, see Creating origin request policies in the Amazon CloudFront Developer Guide. Specifies which cookies to forward to the origin for this cache behavior: all, none, or the list of cookies specified in the WhitelistedNames complex type. Amazon S3 doesn't process cookies. When the cache behavior is forwarding requests to an Amazon S3 origin, specify none for the Forward element.
    */
  var Forward: ItemSelection
  
  /**
    * This field is deprecated. We recommend that you use a cache policy or an origin request policy instead of this field. If you want to include cookies in the cache key, use a cache policy. For more information, see Creating cache policies in the Amazon CloudFront Developer Guide. If you want to send cookies to the origin but not include them in the cache key, use an origin request policy. For more information, see Creating origin request policies in the Amazon CloudFront Developer Guide. Required if you specify whitelist for the value of Forward. A complex type that specifies how many different cookies you want CloudFront to forward to the origin for this cache behavior and, if you want to forward selected cookies, the names of those cookies. If you specify all or none for the value of Forward, omit WhitelistedNames. If you change the value of Forward from whitelist to all or none and you don't delete the WhitelistedNames element and its child elements, CloudFront deletes them automatically. For the current limit on the number of cookie names that you can whitelist for each cache behavior, see  CloudFront Limits in the Amazon Web Services General Reference.
    */
  var WhitelistedNames: js.UndefOr[CookieNames] = js.undefined
}
object CookiePreference {
  
  inline def apply(Forward: ItemSelection): CookiePreference = {
    val __obj = js.Dynamic.literal(Forward = Forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiePreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CookiePreference] (val x: Self) extends AnyVal {
    
    inline def setForward(value: ItemSelection): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedNames(value: CookieNames): Self = StObject.set(x, "WhitelistedNames", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedNamesUndefined: Self = StObject.set(x, "WhitelistedNames", js.undefined)
  }
}
