package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocaleNumberFormatDescriptor extends js.Object {
  var CURRENCY_SYM: String
  var DECIMAL_SEP: String
  var GROUP_SEP: String
  var PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
}

object ILocaleNumberFormatDescriptor {
  @scala.inline
  def apply(
    CURRENCY_SYM: String,
    DECIMAL_SEP: String,
    GROUP_SEP: String,
    PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
  ): ILocaleNumberFormatDescriptor = {
    val __obj = js.Dynamic.literal(CURRENCY_SYM = CURRENCY_SYM.asInstanceOf[js.Any], DECIMAL_SEP = DECIMAL_SEP.asInstanceOf[js.Any], GROUP_SEP = GROUP_SEP.asInstanceOf[js.Any], PATTERNS = PATTERNS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILocaleNumberFormatDescriptor]
  }
}

