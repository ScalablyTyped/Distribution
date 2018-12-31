package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FillRangeOptions extends js.Object {
  /**
    *  The increment to use for the range. Can be used with letters or numbers
    */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
    * By default, null is returned when an invalid range is passed.
    * Enable this option to throw a RangeError on invalid ranges
    *
    * false by default
    */
  var strictRanges: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Cast all returned values to strings.
    *
    * By default, integers are returned as numbers.
    */
  var stringify: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Create a regex-compatible source string, instead of expanding values to an array.
    *
    * false by default
    */
  var toRegex: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Customize each value in the returned array (or string)
    */
  var transform: js.UndefOr[FillRangeTransform] = js.undefined
}

