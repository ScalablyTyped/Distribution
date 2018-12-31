package typings
package atAngularCoreLib.srcSanitizationStyleUnderscoreSanitizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleSanitizeFn extends js.Object {
  /** This mode is designed to instruct whether the property will be used for sanitization
    * at a later point */
  def apply(prop: java.lang.String): scala.Boolean = js.native
  /** This mode is designed to sanitize the provided value */
  def apply(prop: java.lang.String, value: java.lang.String): java.lang.String = js.native
}

