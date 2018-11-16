package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/sanitization/sanitization", JSImport.Namespace)
@js.native
object srcSanitizationSanitizationMod extends js.Object {
  val defaultStyleSanitizer: atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod.StyleSanitizeFn = js.native
  def sanitizeHtml(unsafeHtml: js.Any): java.lang.String = js.native
  def sanitizeResourceUrl(unsafeResourceUrl: js.Any): java.lang.String = js.native
  def sanitizeScript(unsafeScript: js.Any): java.lang.String = js.native
  def sanitizeStyle(unsafeStyle: js.Any): java.lang.String = js.native
  def sanitizeUrl(unsafeUrl: js.Any): java.lang.String = js.native
}

