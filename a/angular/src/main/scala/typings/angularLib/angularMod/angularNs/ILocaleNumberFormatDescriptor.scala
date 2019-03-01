package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocaleNumberFormatDescriptor extends js.Object {
  var CURRENCY_SYM: java.lang.String
  var DECIMAL_SEP: java.lang.String
  var GROUP_SEP: java.lang.String
  var PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
}

object ILocaleNumberFormatDescriptor {
  @scala.inline
  def apply(
    CURRENCY_SYM: java.lang.String,
    DECIMAL_SEP: java.lang.String,
    GROUP_SEP: java.lang.String,
    PATTERNS: js.Array[ILocaleNumberPatternDescriptor]
  ): ILocaleNumberFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CURRENCY_SYM")(CURRENCY_SYM)
    __obj.updateDynamic("DECIMAL_SEP")(DECIMAL_SEP)
    __obj.updateDynamic("GROUP_SEP")(GROUP_SEP)
    __obj.updateDynamic("PATTERNS")(PATTERNS)
    __obj.asInstanceOf[ILocaleNumberFormatDescriptor]
  }
}

