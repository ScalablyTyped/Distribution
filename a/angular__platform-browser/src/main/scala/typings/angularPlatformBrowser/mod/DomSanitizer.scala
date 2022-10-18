package typings.angularPlatformBrowser.mod

import typings.angularCore.mod.Sanitizer
import typings.angularCore.mod.SecurityContext
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@angular/platform-browser", "DomSanitizer")
@js.native
open class DomSanitizer () extends Sanitizer {
  
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
  
  def sanitize(context: SecurityContext, value: SafeValue): String | Null = js.native
}
/* static members */
object DomSanitizer {
  
  @JSImport("@angular/platform-browser", "DomSanitizer")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/platform-browser", "DomSanitizer.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[DomSanitizer, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[DomSanitizer, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/platform-browser", "DomSanitizer.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[DomSanitizer] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[DomSanitizer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
