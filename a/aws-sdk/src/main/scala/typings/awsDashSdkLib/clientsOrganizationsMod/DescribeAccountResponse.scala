package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountResponse extends js.Object {
  /**
    * A structure that contains information about the requested account.
    */
  var Account: js.UndefOr[Account] = js.undefined
}

object DescribeAccountResponse {
  @scala.inline
  def apply(Account: Account = null): DescribeAccountResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    __obj.asInstanceOf[DescribeAccountResponse]
  }
}

