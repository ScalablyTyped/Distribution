package typings
package awsDashSdkLib.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccessKeyInfoResponse extends js.Object {
  /**
    * The number used to identify the AWS account.
    */
  var Account: js.UndefOr[accountType] = js.undefined
}

object GetAccessKeyInfoResponse {
  @scala.inline
  def apply(Account: accountType = null): GetAccessKeyInfoResponse = {
    val __obj = js.Dynamic.literal()
    if (Account != null) __obj.updateDynamic("Account")(Account)
    __obj.asInstanceOf[GetAccessKeyInfoResponse]
  }
}

