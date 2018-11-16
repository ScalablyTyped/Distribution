package typings
package atAngularCoreLib.srcSanitizationSecurityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/sanitization/security", "Sanitizer")
@js.native
abstract class Sanitizer () extends js.Object {
  def sanitize(context: SecurityContext): java.lang.String | scala.Null = js.native
  def sanitize(context: SecurityContext, value: java.lang.String): java.lang.String | scala.Null = js.native
  def sanitize(context: SecurityContext, value: js.Object): java.lang.String | scala.Null = js.native
}

