package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3PriceAttribute extends js.Object {
  /**
    * Monetary amount.
    */
  var amount: js.UndefOr[GoogleActionsOrdersV3Money] = js.undefined
  /**
    * The percentage spec, to 1/1000th of a percent.
    * Eg: 8.750% is represented as 8750, negative percentages represent
    * percentage discounts.
    * Deprecating this field. Can consider adding back when a solid usecase is
    * required.
    */
  var amountMillipercentage: js.UndefOr[Double] = js.undefined
  /**
    * Required: User displayed string of the price attribute. This is sent and
    * localized by merchant.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Required: State of the price: Estimate vs Actual.
    */
  var state: js.UndefOr[GoogleActionsOrdersV3PriceAttributeState] = js.undefined
  /**
    * Whether the price is tax included.
    */
  var taxIncluded: js.UndefOr[Boolean] = js.undefined
  /**
    * Required: Type of money attribute.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3PriceAttributeType] = js.undefined
}

object GoogleActionsOrdersV3PriceAttribute {
  @scala.inline
  def apply(
    amount: GoogleActionsOrdersV3Money = null,
    amountMillipercentage: Int | Double = null,
    name: String = null,
    state: GoogleActionsOrdersV3PriceAttributeState = null,
    taxIncluded: js.UndefOr[Boolean] = js.undefined,
    `type`: GoogleActionsOrdersV3PriceAttributeType = null
  ): GoogleActionsOrdersV3PriceAttribute = {
    val __obj = js.Dynamic.literal()
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (amountMillipercentage != null) __obj.updateDynamic("amountMillipercentage")(amountMillipercentage.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(taxIncluded)) __obj.updateDynamic("taxIncluded")(taxIncluded.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3PriceAttribute]
  }
}

