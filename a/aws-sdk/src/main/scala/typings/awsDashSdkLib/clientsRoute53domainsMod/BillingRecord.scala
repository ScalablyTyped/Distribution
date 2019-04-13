package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BillingRecord extends js.Object {
  /**
    * The date that the operation was billed, in Unix format.
    */
  var BillDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the domain that the billing record applies to. If the domain name contains characters other than a-z, 0-9, and - (hyphen), such as an internationalized domain name, then this value is in Punycode. For more information, see DNS Domain Name Format in the Amazon Route 53 Developer Guidezzz.
    */
  var DomainName: js.UndefOr[DomainName] = js.undefined
  /**
    * The ID of the invoice that is associated with the billing record.
    */
  var InvoiceId: js.UndefOr[InvoiceId] = js.undefined
  /**
    * The operation that you were charged for.
    */
  var Operation: js.UndefOr[OperationType] = js.undefined
  /**
    * The price that you were charged for the operation, in US dollars. Example value: 12.0
    */
  var Price: js.UndefOr[Price] = js.undefined
}

object BillingRecord {
  @scala.inline
  def apply(
    BillDate: Timestamp = null,
    DomainName: DomainName = null,
    InvoiceId: InvoiceId = null,
    Operation: OperationType = null,
    Price: js.UndefOr[Price] = js.undefined
  ): BillingRecord = {
    val __obj = js.Dynamic.literal()
    if (BillDate != null) __obj.updateDynamic("BillDate")(BillDate)
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName)
    if (InvoiceId != null) __obj.updateDynamic("InvoiceId")(InvoiceId)
    if (Operation != null) __obj.updateDynamic("Operation")(Operation.asInstanceOf[js.Any])
    if (!js.isUndefined(Price)) __obj.updateDynamic("Price")(Price)
    __obj.asInstanceOf[BillingRecord]
  }
}

