package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSMSAttributesInput extends js.Object {
  /**
    * A list of the individual attribute names, such as MonthlySpendLimit, for which you want values. For all attribute names, see SetSMSAttributes. If you don't use this parameter, Amazon SNS returns all SMS attributes.
    */
  var attributes: js.UndefOr[ListString] = js.undefined
}

object GetSMSAttributesInput {
  @scala.inline
  def apply(attributes: ListString = null): GetSMSAttributesInput = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[GetSMSAttributesInput]
  }
}

