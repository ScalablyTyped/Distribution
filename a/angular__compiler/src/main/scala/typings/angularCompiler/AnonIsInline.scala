package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsInline extends js.Object {
  var isInline: Boolean
  var templateUrl: String | Null
}

object AnonIsInline {
  @scala.inline
  def apply(isInline: Boolean, templateUrl: String = null): AnonIsInline = {
    val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIsInline]
  }
}

