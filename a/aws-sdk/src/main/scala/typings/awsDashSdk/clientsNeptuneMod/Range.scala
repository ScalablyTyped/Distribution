package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Range extends js.Object {
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Integer] = js.native
  /**
    * The step value for the range. For example, if you have a range of 5,000 to 10,000, with a step value of 1,000, the valid values start at 5,000 and step up by 1,000. Even though 7,500 is within the range, it isn't a valid value for the range. The valid values are 5,000, 6,000, 7,000, 8,000...
    */
  var Step: js.UndefOr[IntegerOptional] = js.native
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Integer] = js.native
}

object Range {
  @scala.inline
  def apply(From: Int | scala.Double = null, Step: Int | scala.Double = null, To: Int | scala.Double = null): Range = {
    val __obj = js.Dynamic.literal()
    if (From != null) __obj.updateDynamic("From")(From.asInstanceOf[js.Any])
    if (Step != null) __obj.updateDynamic("Step")(Step.asInstanceOf[js.Any])
    if (To != null) __obj.updateDynamic("To")(To.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
}

