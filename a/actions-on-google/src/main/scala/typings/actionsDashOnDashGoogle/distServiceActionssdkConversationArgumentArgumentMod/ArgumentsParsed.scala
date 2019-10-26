package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod

import org.scalablytyped.runtime.StringDictionary
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentMediaMod.MediaStatusArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentNoinputMod.RepromptArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionUserIdArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperSigninMod.SignInArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionCompletepurchaseMod.CompletePurchaseArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionDecisionMod.TransactionDecisionArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionDeliveryaddressMod.DeliveryAddressArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionDigitalpurchasecheckMod.DigitalPurchaseCheckArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionRequirementsMod.TransactionRequirementsArgument
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
    if (COMPLETE_PURCHASE_VALUE != null) __obj.updateDynamic("COMPLETE_PURCHASE_VALUE")(COMPLETE_PURCHASE_VALUE)
    if (!js.isUndefined(CONFIRMATION)) __obj.updateDynamic("CONFIRMATION")(CONFIRMATION)
    if (DATETIME != null) __obj.updateDynamic("DATETIME")(DATETIME)
    if (DELIVERY_ADDRESS_VALUE != null) __obj.updateDynamic("DELIVERY_ADDRESS_VALUE")(DELIVERY_ADDRESS_VALUE)
    if (DIGITAL_PURCHASE_CHECK_RESULT != null) __obj.updateDynamic("DIGITAL_PURCHASE_CHECK_RESULT")(DIGITAL_PURCHASE_CHECK_RESULT)
    if (!js.isUndefined(IS_FINAL_REPROMPT)) __obj.updateDynamic("IS_FINAL_REPROMPT")(IS_FINAL_REPROMPT)
    if (!js.isUndefined(LINK)) __obj.updateDynamic("LINK")(LINK)
    if (MEDIA_STATUS != null) __obj.updateDynamic("MEDIA_STATUS")(MEDIA_STATUS)
    if (NEW_SURFACE != null) __obj.updateDynamic("NEW_SURFACE")(NEW_SURFACE)
    if (OPTION != null) __obj.updateDynamic("OPTION")(OPTION)
    if (!js.isUndefined(PERMISSION)) __obj.updateDynamic("PERMISSION")(PERMISSION)
    if (PLACE != null) __obj.updateDynamic("PLACE")(PLACE.asInstanceOf[js.Any])
    if (REGISTER_UPDATE != null) __obj.updateDynamic("REGISTER_UPDATE")(REGISTER_UPDATE)
    if (REPROMPT_COUNT != null) __obj.updateDynamic("REPROMPT_COUNT")(REPROMPT_COUNT)
    if (SIGN_IN != null) __obj.updateDynamic("SIGN_IN")(SIGN_IN)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (TRANSACTION_DECISION_VALUE != null) __obj.updateDynamic("TRANSACTION_DECISION_VALUE")(TRANSACTION_DECISION_VALUE)
    if (TRANSACTION_REQUIREMENTS_CHECK_RESULT != null) __obj.updateDynamic("TRANSACTION_REQUIREMENTS_CHECK_RESULT")(TRANSACTION_REQUIREMENTS_CHECK_RESULT)
    if (UPDATES_USER_ID != null) __obj.updateDynamic("UPDATES_USER_ID")(UPDATES_USER_ID)
    __obj.asInstanceOf[ArgumentsParsed]
  }
}

