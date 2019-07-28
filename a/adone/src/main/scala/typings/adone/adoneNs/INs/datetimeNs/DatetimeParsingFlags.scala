package typings.adone.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeParsingFlags extends js.Object {
  var charsLeftOver: Double
  var empty: Boolean
  var invalidFormat: Boolean
  var invalidMonth: String | Null
  var iso: Boolean
  var meridiem: String | Null
  var nullInput: Boolean
  var overflow: Double
  var parsedDateParts: js.Array[_]
  var unusedInput: js.Array[String]
  var unusedTokens: js.Array[String]
  var userInvalidated: Boolean
}

object DatetimeParsingFlags {
  @scala.inline
  def apply(
    charsLeftOver: Double,
    empty: Boolean,
    invalidFormat: Boolean,
    iso: Boolean,
    nullInput: Boolean,
    overflow: Double,
    parsedDateParts: js.Array[_],
    unusedInput: js.Array[String],
    unusedTokens: js.Array[String],
    userInvalidated: Boolean,
    invalidMonth: String = null,
    meridiem: String = null
  ): DatetimeParsingFlags = {
    val __obj = js.Dynamic.literal(charsLeftOver = charsLeftOver, empty = empty, invalidFormat = invalidFormat, iso = iso, nullInput = nullInput, overflow = overflow, parsedDateParts = parsedDateParts, unusedInput = unusedInput, unusedTokens = unusedTokens, userInvalidated = userInvalidated)
    if (invalidMonth != null) __obj.updateDynamic("invalidMonth")(invalidMonth)
    if (meridiem != null) __obj.updateDynamic("meridiem")(meridiem)
    __obj.asInstanceOf[DatetimeParsingFlags]
  }
}

