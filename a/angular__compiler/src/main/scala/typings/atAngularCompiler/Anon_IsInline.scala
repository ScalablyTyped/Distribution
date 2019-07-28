package typings.atAngularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IsInline extends js.Object {
  var isInline: Boolean
  var templateUrl: String | Null
}

object Anon_IsInline {
  @scala.inline
  def apply(isInline: Boolean, templateUrl: String = null): Anon_IsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline)
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl)
    __obj.asInstanceOf[Anon_IsInline]
  }
}

