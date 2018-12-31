package typings
package atAngularPlatformDashBrowserLib.srcSecurityDomUnderscoreSanitizationUnderscoreServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser/src/security/dom_sanitization_service", "DomSanitizer")
@js.native
abstract class DomSanitizer ()
  extends atAngularCoreLib.coreMod.Sanitizer {
  /**
    * Bypass security and trust the given value to be safe HTML. Only use this when the bound HTML
    * is unsafe (e.g. contains `<script>` tags) and the code should be executed. The sanitizer will
    * leave safe HTML intact, so in most situations this method should not be used.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustHtml(value: java.lang.String): SafeHtml = js.native
  /**
    * Bypass security and trust the given value to be a safe resource URL, i.e. a location that may
    * be used to load executable code from, like `<script src>`, or `<iframe src>`.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustResourceUrl(value: java.lang.String): SafeResourceUrl = js.native
  /**
    * Bypass security and trust the given value to be safe JavaScript.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustScript(value: java.lang.String): SafeScript = js.native
  /**
    * Bypass security and trust the given value to be safe style value (CSS).
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustStyle(value: java.lang.String): SafeStyle = js.native
  /**
    * Bypass security and trust the given value to be a safe style URL, i.e. a value that can be used
    * in hyperlinks or `<img src>`.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustUrl(value: java.lang.String): SafeUrl = js.native
  /**
    * Sanitizes a value for use in the given SecurityContext.
    *
    * If value is trusted for the context, this method will unwrap the contained safe value and use
    * it directly. Otherwise, value will be sanitized to be safe in the given context, for example
    * by replacing URLs that have an unsafe protocol part (such as `javascript:`). The implementation
    * is responsible to make sure that the value can definitely be safely used in the given context.
    */
  def sanitize(context: atAngularCoreLib.srcSanitizationSecurityMod.SecurityContext, value: SafeValue): java.lang.String | scala.Null = js.native
}

