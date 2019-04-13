package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBonusPaymentsResponse extends js.Object {
  /**
    * A successful request to the ListBonusPayments operation returns a list of BonusPayment objects. 
    */
  var BonusPayments: js.UndefOr[BonusPaymentList] = js.undefined
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The number of bonus payments on this page in the filtered results list, equivalent to the number of bonus payments being returned by this call. 
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
}

object ListBonusPaymentsResponse {
  @scala.inline
  def apply(
    BonusPayments: BonusPaymentList = null,
    NextToken: PaginationToken = null,
    NumResults: js.UndefOr[Integer] = js.undefined
  ): ListBonusPaymentsResponse = {
    val __obj = js.Dynamic.literal()
    if (BonusPayments != null) __obj.updateDynamic("BonusPayments")(BonusPayments)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(NumResults)) __obj.updateDynamic("NumResults")(NumResults)
    __obj.asInstanceOf[ListBonusPaymentsResponse]
  }
}

