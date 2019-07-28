package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Integer] = js.undefined
  /**
    * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
    */
  var Step: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Integer] = js.undefined
}

object Range {
  @scala.inline
  def apply(
    From: js.UndefOr[Integer] = js.undefined,
    Step: js.UndefOr[IntegerOptional] = js.undefined,
    To: js.UndefOr[Integer] = js.undefined
  ): Range = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(From)) __obj.updateDynamic("From")(From)
    if (!js.isUndefined(Step)) __obj.updateDynamic("Step")(Step)
    if (!js.isUndefined(To)) __obj.updateDynamic("To")(To)
    __obj.asInstanceOf[Range]
  }
}

