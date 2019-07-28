package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OfferingTransaction extends js.Object {
  /**
    * The cost of an offering transaction.
    */
  var cost: js.UndefOr[MonetaryAmount] = js.undefined
  /**
    * The date on which an offering transaction was created.
    */
  var createdOn: js.UndefOr[DateTime] = js.undefined
  /**
    * The ID that corresponds to a device offering promotion.
    */
  var offeringPromotionId: js.UndefOr[OfferingPromotionIdentifier] = js.undefined
  /**
    * The status of an offering transaction.
    */
  var offeringStatus: js.UndefOr[OfferingStatus] = js.undefined
  /**
    * The transaction ID of the offering transaction.
    */
  var transactionId: js.UndefOr[TransactionIdentifier] = js.undefined
}

object OfferingTransaction {
  @scala.inline
  def apply(
    cost: MonetaryAmount = null,
    createdOn: DateTime = null,
    offeringPromotionId: OfferingPromotionIdentifier = null,
    offeringStatus: OfferingStatus = null,
    transactionId: TransactionIdentifier = null
  ): OfferingTransaction = {
    val __obj = js.Dynamic.literal()
    if (cost != null) __obj.updateDynamic("cost")(cost)
    if (createdOn != null) __obj.updateDynamic("createdOn")(createdOn)
    if (offeringPromotionId != null) __obj.updateDynamic("offeringPromotionId")(offeringPromotionId)
    if (offeringStatus != null) __obj.updateDynamic("offeringStatus")(offeringStatus)
    if (transactionId != null) __obj.updateDynamic("transactionId")(transactionId)
    __obj.asInstanceOf[OfferingTransaction]
  }
}

