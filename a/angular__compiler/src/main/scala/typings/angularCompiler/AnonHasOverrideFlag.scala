package typings.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasOverrideFlag extends js.Object {
  var hasOverrideFlag: Boolean
  var property: String
  var unit: String
}

object AnonHasOverrideFlag {
  @scala.inline
  def apply(hasOverrideFlag: Boolean, property: String, unit: String): AnonHasOverrideFlag = {
    val __obj = js.Dynamic.literal(hasOverrideFlag = hasOverrideFlag.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasOverrideFlag]
  }
}

