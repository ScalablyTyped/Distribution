package typings
package adoneLib.adoneNs.INs.datetimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatetimeParsingFlagsOpt extends js.Object {
  var charsLeftOver: js.UndefOr[scala.Double] = js.undefined
  var empty: js.UndefOr[scala.Boolean] = js.undefined
  var invalidFormat: js.UndefOr[scala.Boolean] = js.undefined
  var invalidMonth: js.UndefOr[java.lang.String] = js.undefined
  var iso: js.UndefOr[scala.Boolean] = js.undefined
  var meridiem: js.UndefOr[java.lang.String] = js.undefined
  var nullInput: js.UndefOr[scala.Boolean] = js.undefined
  var overflow: js.UndefOr[scala.Double] = js.undefined
  var parsedDateParts: js.UndefOr[js.Array[_]] = js.undefined
  var unusedInput: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var unusedTokens: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var userInvalidated: js.UndefOr[scala.Boolean] = js.undefined
}

object DatetimeParsingFlagsOpt {
  @scala.inline
  def apply(
    charsLeftOver: scala.Int | scala.Double = null,
    empty: js.UndefOr[scala.Boolean] = js.undefined,
    invalidFormat: js.UndefOr[scala.Boolean] = js.undefined,
    invalidMonth: java.lang.String = null,
    iso: js.UndefOr[scala.Boolean] = js.undefined,
    meridiem: java.lang.String = null,
    nullInput: js.UndefOr[scala.Boolean] = js.undefined,
    overflow: scala.Int | scala.Double = null,
    parsedDateParts: js.Array[_] = null,
    unusedInput: js.Array[java.lang.String] = null,
    unusedTokens: js.Array[java.lang.String] = null,
    userInvalidated: js.UndefOr[scala.Boolean] = js.undefined
  ): DatetimeParsingFlagsOpt = {
    val __obj = js.Dynamic.literal()
    if (charsLeftOver != null) __obj.updateDynamic("charsLeftOver")(charsLeftOver.asInstanceOf[js.Any])
    if (!js.isUndefined(empty)) __obj.updateDynamic("empty")(empty)
    if (!js.isUndefined(invalidFormat)) __obj.updateDynamic("invalidFormat")(invalidFormat)
    if (invalidMonth != null) __obj.updateDynamic("invalidMonth")(invalidMonth)
    if (!js.isUndefined(iso)) __obj.updateDynamic("iso")(iso)
    if (meridiem != null) __obj.updateDynamic("meridiem")(meridiem)
    if (!js.isUndefined(nullInput)) __obj.updateDynamic("nullInput")(nullInput)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (parsedDateParts != null) __obj.updateDynamic("parsedDateParts")(parsedDateParts)
    if (unusedInput != null) __obj.updateDynamic("unusedInput")(unusedInput)
    if (unusedTokens != null) __obj.updateDynamic("unusedTokens")(unusedTokens)
    if (!js.isUndefined(userInvalidated)) __obj.updateDynamic("userInvalidated")(userInvalidated)
    __obj.asInstanceOf[DatetimeParsingFlagsOpt]
  }
}

