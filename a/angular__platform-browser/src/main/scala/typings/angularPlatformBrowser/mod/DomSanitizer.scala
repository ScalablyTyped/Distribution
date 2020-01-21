package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.Sanitizer
import typings.angularCore.mod.SecurityContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "DomSanitizer")
@js.native
abstract class DomSanitizer () extends Sanitizer {
  /**
    * Bypass security and trust the given value to be safe HTML. Only use this when the bound HTML
    * is unsafe (e.g. contains `<script>` tags) and the code should be executed. The sanitizer will
    * leave safe HTML intact, so in most situations this method should not be used.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustHtml(value: String): SafeHtml = js.native
  /**
    * Bypass security and trust the given value to be a safe resource URL, i.e. a location that may
    * be used to load executable code from, like `<script src>`, or `<iframe src>`.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustResourceUrl(value: String): SafeResourceUrl = js.native
  /**
    * Bypass security and trust the given value to be safe JavaScript.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustScript(value: String): SafeScript = js.native
  /**
    * Bypass security and trust the given value to be safe style value (CSS).
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustStyle(value: String): SafeStyle = js.native
  /**
    * Bypass security and trust the given value to be a safe style URL, i.e. a value that can be used
    * in hyperlinks or `<img src>`.
    *
    * **WARNING:** calling this method with untrusted user data exposes your application to XSS
    * security risks!
    */
  def bypassSecurityTrustUrl(value: String): SafeUrl = js.native
  /**
    * Sanitizes a value for use in the given SecurityContext.
    *
    * If value is trusted for the context, this method will unwrap the contained safe value and use
    * it directly. Otherwise, value will be sanitized to be safe in the given context, for example
    * by replacing URLs that have an unsafe protocol part (such as `javascript:`). The implementation
    * is responsible to make sure that the value can definitely be safely used in the given context.
    */
  def sanitize(context: SecurityContext, value: SafeValue): String | Null = js.native
}

