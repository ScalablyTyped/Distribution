package typings.actionsOnGoogle.argumentArgumentMod

import org.scalablytyped.runtime.StringDictionary
import typings.actionsOnGoogle.completepurchaseMod.CompletePurchaseArgument
import typings.actionsOnGoogle.datetimeMod.DateTimeArgument
import typings.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import typings.actionsOnGoogle.deliveryaddressMod.DeliveryAddressArgument
import typings.actionsOnGoogle.digitalpurchasecheckMod.DigitalPurchaseCheckArgument
import typings.actionsOnGoogle.mediaMod.MediaStatusArgument
import typings.actionsOnGoogle.newsurfaceMod.NewSurfaceArgument
import typings.actionsOnGoogle.noinputMod.RepromptArgument
import typings.actionsOnGoogle.optionOptionMod.OptionArgument
import typings.actionsOnGoogle.placeMod.PlaceArgument
import typings.actionsOnGoogle.registerupdateMod.RegisterUpdateArgument
import typings.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import typings.actionsOnGoogle.signinMod.SignInArgument
import typings.actionsOnGoogle.updateMod.UpdatePermissionUserIdArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgumentsParsed
  extends ArgumentsNamed
     with /** @public */
/* name */ StringDictionary[js.UndefOr[Argument]]

object ArgumentsParsed {
  @scala.inline
  def apply(
    COMPLETE_PURCHASE_VALUE: CompletePurchaseArgument = null,
    CONFIRMATION: js.UndefOr[Boolean] = js.undefined,
    DATETIME: DateTimeArgument = null,
    DELIVERY_ADDRESS_VALUE: DeliveryAddressArgument = null,
    DIGITAL_PURCHASE_CHECK_RESULT: DigitalPurchaseCheckArgument = null,
    IS_FINAL_REPROMPT: js.UndefOr[Boolean] = js.undefined,
    LINK: js.UndefOr[scala.Nothing] = js.undefined,
    MEDIA_STATUS: MediaStatusArgument = null,
    NEW_SURFACE: NewSurfaceArgument = null,
    OPTION: OptionArgument = null,
    PERMISSION: js.UndefOr[Boolean] = js.undefined,
    PLACE: PlaceArgument = null,
    REGISTER_UPDATE: RegisterUpdateArgument = null,
    REPROMPT_COUNT: RepromptArgument = null,
    SIGN_IN: SignInArgument = null,
    StringDictionary: /** @public */
  /* name */ StringDictionary[js.UndefOr[Argument]] = null,
    TRANSACTION_DECISION_VALUE: TransactionDecisionArgument = null,
    TRANSACTION_REQUIREMENTS_CHECK_RESULT: TransactionRequirementsArgument = null,
    UPDATES_USER_ID: UpdatePermissionUserIdArgument = null
  ): ArgumentsParsed = {
    val __obj = js.Dynamic.literal()
    if (COMPLETE_PURCHASE_VALUE != null) __obj.updateDynamic("COMPLETE_PURCHASE_VALUE")(COMPLETE_PURCHASE_VALUE.asInstanceOf[js.Any])
    if (!js.isUndefined(CONFIRMATION)) __obj.updateDynamic("CONFIRMATION")(CONFIRMATION.asInstanceOf[js.Any])
    if (DATETIME != null) __obj.updateDynamic("DATETIME")(DATETIME.asInstanceOf[js.Any])
    if (DELIVERY_ADDRESS_VALUE != null) __obj.updateDynamic("DELIVERY_ADDRESS_VALUE")(DELIVERY_ADDRESS_VALUE.asInstanceOf[js.Any])
    if (DIGITAL_PURCHASE_CHECK_RESULT != null) __obj.updateDynamic("DIGITAL_PURCHASE_CHECK_RESULT")(DIGITAL_PURCHASE_CHECK_RESULT.asInstanceOf[js.Any])
    if (!js.isUndefined(IS_FINAL_REPROMPT)) __obj.updateDynamic("IS_FINAL_REPROMPT")(IS_FINAL_REPROMPT.asInstanceOf[js.Any])
    if (!js.isUndefined(LINK)) __obj.updateDynamic("LINK")(LINK.asInstanceOf[js.Any])
    if (MEDIA_STATUS != null) __obj.updateDynamic("MEDIA_STATUS")(MEDIA_STATUS.asInstanceOf[js.Any])
    if (NEW_SURFACE != null) __obj.updateDynamic("NEW_SURFACE")(NEW_SURFACE.asInstanceOf[js.Any])
    if (OPTION != null) __obj.updateDynamic("OPTION")(OPTION.asInstanceOf[js.Any])
    if (!js.isUndefined(PERMISSION)) __obj.updateDynamic("PERMISSION")(PERMISSION.asInstanceOf[js.Any])
    if (PLACE != null) __obj.updateDynamic("PLACE")(PLACE.asInstanceOf[js.Any])
    if (REGISTER_UPDATE != null) __obj.updateDynamic("REGISTER_UPDATE")(REGISTER_UPDATE.asInstanceOf[js.Any])
    if (REPROMPT_COUNT != null) __obj.updateDynamic("REPROMPT_COUNT")(REPROMPT_COUNT.asInstanceOf[js.Any])
    if (SIGN_IN != null) __obj.updateDynamic("SIGN_IN")(SIGN_IN.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (TRANSACTION_DECISION_VALUE != null) __obj.updateDynamic("TRANSACTION_DECISION_VALUE")(TRANSACTION_DECISION_VALUE.asInstanceOf[js.Any])
    if (TRANSACTION_REQUIREMENTS_CHECK_RESULT != null) __obj.updateDynamic("TRANSACTION_REQUIREMENTS_CHECK_RESULT")(TRANSACTION_REQUIREMENTS_CHECK_RESULT.asInstanceOf[js.Any])
    if (UPDATES_USER_ID != null) __obj.updateDynamic("UPDATES_USER_ID")(UPDATES_USER_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentsParsed]
  }
}

