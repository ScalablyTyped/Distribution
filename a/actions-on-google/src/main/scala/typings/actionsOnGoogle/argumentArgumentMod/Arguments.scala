package typings.actionsOnGoogle.argumentArgumentMod

import typings.actionsOnGoogle.actionsOnGoogleStrings.COMPLETE_PURCHASE_VALUE
import typings.actionsOnGoogle.actionsOnGoogleStrings.CONFIRMATION
import typings.actionsOnGoogle.actionsOnGoogleStrings.DATETIME
import typings.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_VALUE
import typings.actionsOnGoogle.actionsOnGoogleStrings.DIGITAL_PURCHASE_CHECK_RESULT
import typings.actionsOnGoogle.actionsOnGoogleStrings.IS_FINAL_REPROMPT
import typings.actionsOnGoogle.actionsOnGoogleStrings.LINK
import typings.actionsOnGoogle.actionsOnGoogleStrings.MEDIA_STATUS
import typings.actionsOnGoogle.actionsOnGoogleStrings.NEW_SURFACE
import typings.actionsOnGoogle.actionsOnGoogleStrings.OPTION
import typings.actionsOnGoogle.actionsOnGoogleStrings.PERMISSION
import typings.actionsOnGoogle.actionsOnGoogleStrings.PLACE
import typings.actionsOnGoogle.actionsOnGoogleStrings.REGISTER_UPDATE
import typings.actionsOnGoogle.actionsOnGoogleStrings.REPROMPT_COUNT
import typings.actionsOnGoogle.actionsOnGoogleStrings.SIGN_IN
import typings.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_DECISION_VALUE
import typings.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_REQUIREMENTS_CHECK_RESULT
import typings.actionsOnGoogle.actionsOnGoogleStrings.UPDATES_USER_ID
import typings.actionsOnGoogle.completepurchaseMod.CompletePurchaseArgument
import typings.actionsOnGoogle.confirmationMod.ConfirmationArgument
import typings.actionsOnGoogle.datetimeMod.DateTimeArgument
import typings.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import typings.actionsOnGoogle.deeplinkMod.DeepLinkArgument
import typings.actionsOnGoogle.deliveryaddressMod.DeliveryAddressArgument
import typings.actionsOnGoogle.digitalpurchasecheckMod.DigitalPurchaseCheckArgument
import typings.actionsOnGoogle.mediaMod.MediaStatusArgument
import typings.actionsOnGoogle.newsurfaceMod.NewSurfaceArgument
import typings.actionsOnGoogle.noinputMod.FinalRepromptArgument
import typings.actionsOnGoogle.noinputMod.RepromptArgument
import typings.actionsOnGoogle.optionOptionMod.OptionArgument
import typings.actionsOnGoogle.permissionPermissionMod.PermissionArgument
import typings.actionsOnGoogle.placeMod.PlaceArgument
import typings.actionsOnGoogle.registerupdateMod.RegisterUpdateArgument
import typings.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import typings.actionsOnGoogle.signinMod.SignInArgument
import typings.actionsOnGoogle.updateMod.UpdatePermissionUserIdArgument
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2Argument
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
  @JSName(js.Symbol.iterator)
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
  def get_COMPLETEPURCHASEVALUE(name: COMPLETE_PURCHASE_VALUE): js.UndefOr[CompletePurchaseArgument] = js.native
  @JSName("get")
  def get_CONFIRMATION(name: CONFIRMATION): js.UndefOr[ConfirmationArgument] = js.native
  @JSName("get")
  def get_DATETIME(name: DATETIME): js.UndefOr[DateTimeArgument] = js.native
  @JSName("get")
  def get_DELIVERYADDRESSVALUE(name: DELIVERY_ADDRESS_VALUE): js.UndefOr[DeliveryAddressArgument] = js.native
  @JSName("get")
  def get_DIGITALPURCHASECHECKRESULT(name: DIGITAL_PURCHASE_CHECK_RESULT): js.UndefOr[DigitalPurchaseCheckArgument] = js.native
  @JSName("get")
  def get_ISFINALREPROMPT(name: IS_FINAL_REPROMPT): js.UndefOr[FinalRepromptArgument] = js.native
  @JSName("get")
  def get_LINK(name: LINK): js.UndefOr[DeepLinkArgument] = js.native
  @JSName("get")
  def get_MEDIASTATUS(name: MEDIA_STATUS): js.UndefOr[MediaStatusArgument] = js.native
  @JSName("get")
  def get_NEWSURFACE(name: NEW_SURFACE): js.UndefOr[NewSurfaceArgument] = js.native
  @JSName("get")
  def get_OPTION(name: OPTION): js.UndefOr[OptionArgument] = js.native
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
  def get_PERMISSION(name: PERMISSION): js.UndefOr[PermissionArgument] = js.native
  @JSName("get")
  def get_PLACE(name: PLACE): js.UndefOr[PlaceArgument] = js.native
  @JSName("get")
  def get_REGISTERUPDATE(name: REGISTER_UPDATE): js.UndefOr[RegisterUpdateArgument] = js.native
  @JSName("get")
  def get_REPROMPTCOUNT(name: REPROMPT_COUNT): js.UndefOr[RepromptArgument] = js.native
  @JSName("get")
  def get_SIGNIN(name: SIGN_IN): js.UndefOr[SignInArgument] = js.native
  @JSName("get")
  def get_TRANSACTIONDECISIONVALUE(name: TRANSACTION_DECISION_VALUE): js.UndefOr[TransactionDecisionArgument] = js.native
  @JSName("get")
  def get_TRANSACTIONREQUIREMENTSCHECKRESULT(name: TRANSACTION_REQUIREMENTS_CHECK_RESULT): js.UndefOr[TransactionRequirementsArgument] = js.native
  @JSName("get")
  def get_UPDATESUSERID(name: UPDATES_USER_ID): js.UndefOr[UpdatePermissionUserIdArgument] = js.native
}

