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
    val __obj = js.Dynamic.literal(CURRENCY_SYM = CURRENCY_SYM, DECIMAL_SEP = DECIMAL_SEP, GROUP_SEP = GROUP_SEP, PATTERNS = PATTERNS)
  
    __obj.asInstanceOf[ILocaleNumberFormatDescriptor]
  }
}

