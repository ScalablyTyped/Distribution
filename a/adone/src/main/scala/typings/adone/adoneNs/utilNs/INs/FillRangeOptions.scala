package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillRangeOptions extends js.Object {
  /**
    *  The increment to use for the range. Can be used with letters or numbers
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * By default, null is returned when an invalid range is passed.
    * Enable this option to throw a RangeError on invalid ranges
    *
    * false by default
    */
  var strictRanges: js.UndefOr[Boolean] = js.undefined
  /**
    * Cast all returned values to strings.
    *
    * By default, integers are returned as numbers.
    */
  var stringify: js.UndefOr[Boolean] = js.undefined
  /**
    * Create a regex-compatible source string, instead of expanding values to an array.
    *
    * false by default
    */
  var toRegex: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize each value in the returned array (or string)
    */
  var transform: js.UndefOr[FillRangeTransform] = js.undefined
}

object FillRangeOptions {
  @scala.inline
  def apply(
    step: Int | Double = null,
    strictRanges: js.UndefOr[Boolean] = js.undefined,
    stringify: js.UndefOr[Boolean] = js.undefined,
    toRegex: js.UndefOr[Boolean] = js.undefined,
    transform: FillRangeTransform = null
  ): FillRangeOptions = {
    val __obj = js.Dynamic.literal()
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(strictRanges)) __obj.updateDynamic("strictRanges")(strictRanges)
    if (!js.isUndefined(stringify)) __obj.updateDynamic("stringify")(stringify)
    if (!js.isUndefined(toRegex)) __obj.updateDynamic("toRegex")(toRegex)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[FillRangeOptions]
  }
}

