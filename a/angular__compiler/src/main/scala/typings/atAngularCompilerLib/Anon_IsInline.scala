package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsInline extends js.Object {
  var isInline: scala.Boolean
  var templateUrl: java.lang.String | scala.Null
}

object Anon_IsInline {
  @scala.inline
  def apply(isInline: scala.Boolean, templateUrl: java.lang.String = null): Anon_IsInline = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isInline")(isInline)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[Anon_IsInline]
  }
}

