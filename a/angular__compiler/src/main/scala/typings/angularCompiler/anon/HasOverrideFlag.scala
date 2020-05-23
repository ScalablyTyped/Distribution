package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasOverrideFlag extends js.Object {
  var hasOverrideFlag: Boolean
  var property: String
  var unit: String
}

object HasOverrideFlag {
  @scala.inline
  def apply(hasOverrideFlag: Boolean, property: String, unit: String): HasOverrideFlag = {
    val __obj = js.Dynamic.literal(hasOverrideFlag = hasOverrideFlag.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasOverrideFlag]
  }
}

