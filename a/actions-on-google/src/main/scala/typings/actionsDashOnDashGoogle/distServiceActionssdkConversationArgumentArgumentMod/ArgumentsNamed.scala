package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentMediaMod.MediaStatusArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentNoinputMod.FinalRepromptArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentNoinputMod.RepromptArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperConfirmationMod.ConfirmationArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDeeplinkMod.DeepLinkArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionArgument
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionArgument
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

trait ArgumentsNamed extends js.Object {
  /**
    * The complete purchase information.
    * Only use after calling {@link CompletePurchase|conv.ask(new CompletePurchase)}.
    * @public
    */
  var COMPLETE_PURCHASE_VALUE: js.UndefOr[CompletePurchaseArgument] = js.undefined
  /**
    * The confirmation decision.
    * Use after {@link Confirmation|conv.ask(new Confirmation)}
    * @public
    */
  var CONFIRMATION: js.UndefOr[ConfirmationArgument] = js.undefined
  /**
    * The user provided date and time.
    * Use after {@link DateTime|conv.ask(new DateTime)}
    * @public
    */
  var DATETIME: js.UndefOr[DateTimeArgument] = js.undefined
  /**
    * The order delivery address.
    * Only use after calling {@link DeliveryAddress|conv.ask(new DeliveryAddress)}.
    * @public
    */
  var DELIVERY_ADDRESS_VALUE: js.UndefOr[DeliveryAddressArgument] = js.undefined
  /**
    * Only use after calling {@link DigitalPurchaseCheck|conv.ask(new DigitalPurchaseCheck)}.
    * @public
    */
  var DIGITAL_PURCHASE_CHECK_RESULT: js.UndefOr[DigitalPurchaseCheckArgument] = js.undefined
  /**
    * True if it is the final reprompt related to silent input from the user.
    * This should be used along with the `actions.intent.NO_INPUT` intent to give the final
    * response to the user after multiple silences and should be an `conv.close`
    * which ends the conversation.
    * @public
    */
  var IS_FINAL_REPROMPT: js.UndefOr[FinalRepromptArgument] = js.undefined
  /**
    * The link non status argument.
    * Is undefined as a noop.
    * Use {@link Status#get|conv.arguments.status.get('LINK')} to explicitly get the status.
    * @public
    * @deprecated
    */
  var LINK: js.UndefOr[DeepLinkArgument] = js.undefined
  /**
    * The status of MEDIA_STATUS intent.
    * @public
    */
  var MEDIA_STATUS: js.UndefOr[MediaStatusArgument] = js.undefined
  /**
    * The result of {@link NewSurface|conv.ask(new NewSurface)}
    * True if user has triggered conversation on a new device following the
    * `actions.intent.NEW_SURFACE` intent.
    * @public
    */
  var NEW_SURFACE: js.UndefOr[NewSurfaceArgument] = js.undefined
  /**
    * The option key user chose from options response.
    * Only use after calling {@link List|conv.ask(new List)}
    * or {@link Carousel|conv.ask(new Carousel)}.
    * @public
    */
  var OPTION: js.UndefOr[OptionArgument] = js.undefined
  /**
    * True if the request follows a previous request asking for
    * permission from the user and the user granted the permission(s).
    * Otherwise, false.
    * Only use after calling {@link Permission|conv.ask(new Permission)}
    * or {@link UpdatePermission|conv.ask(new UpdatePermission)}.
    * @public
    */
  var PERMISSION: js.UndefOr[PermissionArgument] = js.undefined
  /**
    * The user provided place.
    * Use after {@link Place|conv.ask(new Place)}.
    * @public
    */
  var PLACE: js.UndefOr[PlaceArgument] = js.undefined
  /**
    * True if user accepted update registration request.
    * Used with {@link RegisterUpdate|conv.ask(new RegisterUpdate)}
    * @public
    */
  var REGISTER_UPDATE: js.UndefOr[RegisterUpdateArgument] = js.undefined
  /**
    * The number of subsequent reprompts related to silent input from the user.
    * This should be used along with the `actions.intent.NO_INPUT` intent to reprompt the
    * user for input in cases where the Google Assistant could not pick up any speech.
    * @public
    */
  var REPROMPT_COUNT: js.UndefOr[RepromptArgument] = js.undefined
  /**
    * The status of user sign in request.
    * Use after {@link SignIn|conv.ask(new SignIn)}
    * @public
    */
  var SIGN_IN: js.UndefOr[SignInArgument] = js.undefined
  /**
    * The transaction decision information.
    * Is object with userDecision only if user declines.
    * userDecision will be one of {@link GoogleActionsV2TransactionDecisionValueUserDecision}.
    * Only use after calling {@link TransactionDecision|conv.ask(new TransactionDecision)}.
    * @public
    */
  var TRANSACTION_DECISION_VALUE: js.UndefOr[TransactionDecisionArgument] = js.undefined
  /**
    * The transactability of user.
    * Only use after calling {@link TransactionRequirements|conv.ask(new TransactionRequirements)}.
    * Undefined if no result given.
    * @public
    */
  var TRANSACTION_REQUIREMENTS_CHECK_RESULT: js.UndefOr[TransactionRequirementsArgument] = js.undefined
  /**
    * The updates user id.
    * Only use after calling {@link UpdatePermission|conv.ask(new UpdatePermission)}.
    * @public
    */
  var UPDATES_USER_ID: js.UndefOr[UpdatePermissionUserIdArgument] = js.undefined
}

object ArgumentsNamed {
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
    TRANSACTION_DECISION_VALUE: TransactionDecisionArgument = null,
    TRANSACTION_REQUIREMENTS_CHECK_RESULT: TransactionRequirementsArgument = null,
    UPDATES_USER_ID: UpdatePermissionUserIdArgument = null
  ): ArgumentsNamed = {
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
    if (TRANSACTION_DECISION_VALUE != null) __obj.updateDynamic("TRANSACTION_DECISION_VALUE")(TRANSACTION_DECISION_VALUE.asInstanceOf[js.Any])
    if (TRANSACTION_REQUIREMENTS_CHECK_RESULT != null) __obj.updateDynamic("TRANSACTION_REQUIREMENTS_CHECK_RESULT")(TRANSACTION_REQUIREMENTS_CHECK_RESULT.asInstanceOf[js.Any])
    if (UPDATES_USER_ID != null) __obj.updateDynamic("UPDATES_USER_ID")(UPDATES_USER_ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgumentsNamed]
  }
}

