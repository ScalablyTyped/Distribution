package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOfferingTransactionsResult extends js.Object {
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The audit log of subscriptions you have purchased and modified through AWS Device Farm.
    */
  var offeringTransactions: js.UndefOr[OfferingTransactions] = js.native
}

object ListOfferingTransactionsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, offeringTransactions: OfferingTransactions = null): ListOfferingTransactionsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (offeringTransactions != null) __obj.updateDynamic("offeringTransactions")(offeringTransactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfferingTransactionsResult]
  }
}

