package typings
package atAngularCoreLib.srcSanitizationBypassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/sanitization/bypass", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def allowSanitizationBypass(value: js.Any, `type`: BypassType): scala.Boolean = js.native
  def bypassSanitizationTrustHtml(trustedHtml: java.lang.String): TrustedHtmlString = js.native
  def bypassSanitizationTrustResourceUrl(trustedResourceUrl: java.lang.String): TrustedResourceUrlString = js.native
  def bypassSanitizationTrustScript(trustedScript: java.lang.String): TrustedScriptString = js.native
  def bypassSanitizationTrustStyle(trustedStyle: java.lang.String): TrustedStyleString = js.native
  def bypassSanitizationTrustUrl(trustedUrl: java.lang.String): TrustedUrlString = js.native
}

