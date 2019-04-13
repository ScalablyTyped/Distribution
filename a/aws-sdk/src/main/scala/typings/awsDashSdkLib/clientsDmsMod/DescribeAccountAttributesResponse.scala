package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAccountAttributesResponse extends js.Object {
  /**
    * Account quota information.
    */
  var AccountQuotas: js.UndefOr[AccountQuotaList] = js.undefined
}

object DescribeAccountAttributesResponse {
  @scala.inline
  def apply(AccountQuotas: AccountQuotaList = null): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (AccountQuotas != null) __obj.updateDynamic("AccountQuotas")(AccountQuotas)
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
}

