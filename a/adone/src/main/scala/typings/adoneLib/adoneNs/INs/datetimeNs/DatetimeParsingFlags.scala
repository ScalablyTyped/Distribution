package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeParsingFlags extends js.Object {
  var charsLeftOver: scala.Double
  var empty: scala.Boolean
  var invalidFormat: scala.Boolean
  var invalidMonth: java.lang.String | scala.Null
  var iso: scala.Boolean
  var meridiem: java.lang.String | scala.Null
  var nullInput: scala.Boolean
  var overflow: scala.Double
  var parsedDateParts: js.Array[_]
  var unusedInput: js.Array[java.lang.String]
  var unusedTokens: js.Array[java.lang.String]
  var userInvalidated: scala.Boolean
}

object DatetimeParsingFlags {
  @scala.inline
  def apply(
    charsLeftOver: scala.Double,
    empty: scala.Boolean,
    invalidFormat: scala.Boolean,
    iso: scala.Boolean,
    nullInput: scala.Boolean,
    overflow: scala.Double,
    parsedDateParts: js.Array[_],
    unusedInput: js.Array[java.lang.String],
    unusedTokens: js.Array[java.lang.String],
    userInvalidated: scala.Boolean,
    invalidMonth: java.lang.String = null,
    meridiem: java.lang.String = null
  ): DatetimeParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver, empty = empty, invalidFormat = invalidFormat, iso = iso, nullInput = nullInput, overflow = overflow, parsedDateParts = parsedDateParts, unusedInput = unusedInput, unusedTokens = unusedTokens, userInvalidated = userInvalidated)
    if (invalidMonth != null) __obj.updateDynamic("invalidMonth")(invalidMonth)
    if (meridiem != null) __obj.updateDynamic("meridiem")(meridiem)
    __obj.asInstanceOf[DatetimeParsingFlags]
  }
}

