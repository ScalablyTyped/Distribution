package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAttributesResult extends js.Object {
  /**
    * Information about the account attributes.
    */
  var AccountAttributes: js.UndefOr[AccountAttributeList] = js.undefined
}

object DescribeAccountAttributesResult {
  @scala.inline
  def apply(AccountAttributes: AccountAttributeList = null): DescribeAccountAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (AccountAttributes != null) __obj.updateDynamic("AccountAttributes")(AccountAttributes)
    __obj.asInstanceOf[DescribeAccountAttributesResult]
  }
}

