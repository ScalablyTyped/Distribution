package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod

import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.COMPLETE_PURCHASE_VALUE
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.CONFIRMATION
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DATETIME
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DELIVERY_ADDRESS_VALUE
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DIGITAL_PURCHASE_CHECK_RESULT
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.IS_FINAL_REPROMPT
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.LINK
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.MEDIA_STATUS
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.NEW_SURFACE
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.OPTION
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PERMISSION
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PLACE
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.REGISTER_UPDATE
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.REPROMPT_COUNT
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.SIGN_IN
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.TRANSACTION_DECISION_VALUE
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.TRANSACTION_REQUIREMENTS_CHECK_RESULT
import typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.UPDATES_USER_ID
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Argument
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
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Arguments")
@js.native
/** @hidden */
class Arguments () extends js.Object {
  def this(raw: js.Array[GoogleActionsV2Argument]) = this()
  /** @public */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[GoogleActionsV2Argument]] = js.native
  /** @public */
  var parsed: Parsed = js.native
  /** @public */
  var raw: Raw = js.native
  /** @public */
  var status: Status = js.native
  /** @public */
  def get(name: String): Argument = js.native
  @JSName("get")
  def get_COMPLETEPURCHASEVALUE(name: COMPLETE_PURCHASE_VALUE): CompletePurchaseArgument = js.native
  @JSName("get")
  def get_CONFIRMATION(name: CONFIRMATION): ConfirmationArgument = js.native
  @JSName("get")
  def get_DATETIME(name: DATETIME): DateTimeArgument = js.native
  @JSName("get")
  def get_DELIVERYADDRESSVALUE(name: DELIVERY_ADDRESS_VALUE): DeliveryAddressArgument = js.native
  @JSName("get")
  def get_DIGITALPURCHASECHECKRESULT(name: DIGITAL_PURCHASE_CHECK_RESULT): DigitalPurchaseCheckArgument = js.native
  @JSName("get")
  def get_ISFINALREPROMPT(name: IS_FINAL_REPROMPT): FinalRepromptArgument = js.native
  @JSName("get")
  def get_LINK(name: LINK): DeepLinkArgument = js.native
  @JSName("get")
  def get_MEDIASTATUS(name: MEDIA_STATUS): MediaStatusArgument = js.native
  @JSName("get")
  def get_NEWSURFACE(name: NEW_SURFACE): NewSurfaceArgument = js.native
  @JSName("get")
  def get_OPTION(name: OPTION): OptionArgument = js.native
  /**
    * Get the argument value by name from the current intent.
    * The first property value not named `name` or `status` will be returned.
    * Will retrieve `textValue` last.
    * If there is no other properties, return undefined.
    *
    * @example
    * ```javascript
    *
    * // Actions SDK
    * app.intent('actions.intent.PERMISSION', conv => {
    *   const granted = conv.arguments.get('PERMISSION') // boolean true if granted, false if not
    * })
    *
    * // Dialogflow
    * // Create a Dialogflow intent with the `actions_intent_PERMISSION` event
    * app.intent('Get Permission', conv => {
    *   const granted = conv.arguments.get('PERMISSION') // boolean true if granted, false if not
    * })
    * ```
    *
    * @param argument Name of the argument.
    * @return First property not named 'name' or 'status' with 'textValue' given last priority
    *     or undefined if no other properties.
    *
    * @public
    */
  @JSName("get")
  def get_PERMISSION(name: PERMISSION): PermissionArgument = js.native
  @JSName("get")
  def get_PLACE(name: PLACE): PlaceArgument = js.native
  @JSName("get")
  def get_REGISTERUPDATE(name: REGISTER_UPDATE): RegisterUpdateArgument = js.native
  @JSName("get")
  def get_REPROMPTCOUNT(name: REPROMPT_COUNT): RepromptArgument = js.native
  @JSName("get")
  def get_SIGNIN(name: SIGN_IN): SignInArgument = js.native
  @JSName("get")
  def get_TRANSACTIONDECISIONVALUE(name: TRANSACTION_DECISION_VALUE): TransactionDecisionArgument = js.native
  @JSName("get")
  def get_TRANSACTIONREQUIREMENTSCHECKRESULT(name: TRANSACTION_REQUIREMENTS_CHECK_RESULT): TransactionRequirementsArgument = js.native
  @JSName("get")
  def get_UPDATESUSERID(name: UPDATES_USER_ID): UpdatePermissionUserIdArgument = js.native
}

