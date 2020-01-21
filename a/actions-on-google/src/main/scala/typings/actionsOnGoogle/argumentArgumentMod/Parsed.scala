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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Parsed")
@js.native
class Parsed protected () extends js.Object {
  /** @hidden */
  def this(raw: js.Array[GoogleActionsV2Argument]) = this()
  /** @public */
  var input: ArgumentsParsed = js.native
  /** @public */
  var list: js.Array[Argument] = js.native
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
  /** @public */
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

