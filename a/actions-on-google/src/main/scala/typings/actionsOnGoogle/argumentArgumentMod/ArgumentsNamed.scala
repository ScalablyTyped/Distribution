package typings.actionsOnGoogle.argumentArgumentMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgumentsNamed extends js.Object {
  /**
    * The complete purchase information.
    * Only use after calling {@link CompletePurchase|conv.ask(new CompletePurchase)}.
    * @public
    */
  var COMPLETE_PURCHASE_VALUE: js.UndefOr[CompletePurchaseArgument] = js.native
  /**
    * The confirmation decision.
    * Use after {@link Confirmation|conv.ask(new Confirmation)}
    * @public
    */
  var CONFIRMATION: js.UndefOr[ConfirmationArgument] = js.native
  /**
    * The user provided date and time.
    * Use after {@link DateTime|conv.ask(new DateTime)}
    * @public
    */
  var DATETIME: js.UndefOr[DateTimeArgument] = js.native
  /**
    * The order delivery address.
    * Only use after calling {@link DeliveryAddress|conv.ask(new DeliveryAddress)}.
    * @public
    */
  var DELIVERY_ADDRESS_VALUE: js.UndefOr[DeliveryAddressArgument] = js.native
  /**
    * Only use after calling {@link DigitalPurchaseCheck|conv.ask(new DigitalPurchaseCheck)}.
    * @public
    */
  var DIGITAL_PURCHASE_CHECK_RESULT: js.UndefOr[DigitalPurchaseCheckArgument] = js.native
  /**
    * True if it is the final reprompt related to silent input from the user.
    * This should be used along with the `actions.intent.NO_INPUT` intent to give the final
    * response to the user after multiple silences and should be an `conv.close`
    * which ends the conversation.
    * @public
    */
  var IS_FINAL_REPROMPT: js.UndefOr[FinalRepromptArgument] = js.native
  /**
    * The link non status argument.
    * Is undefined as a noop.
    * Use {@link Status#get|conv.arguments.status.get('LINK')} to explicitly get the status.
    * @public
    * @deprecated
    */
  var LINK: js.UndefOr[DeepLinkArgument] = js.native
  /**
    * The status of MEDIA_STATUS intent.
    * @public
    */
  var MEDIA_STATUS: js.UndefOr[MediaStatusArgument] = js.native
  /**
    * The result of {@link NewSurface|conv.ask(new NewSurface)}
    * True if user has triggered conversation on a new device following the
    * `actions.intent.NEW_SURFACE` intent.
    * @public
    */
  var NEW_SURFACE: js.UndefOr[NewSurfaceArgument] = js.native
  /**
    * The option key user chose from options response.
    * Only use after calling {@link List|conv.ask(new List)}
    * or {@link Carousel|conv.ask(new Carousel)}.
    * @public
    */
  var OPTION: js.UndefOr[OptionArgument] = js.native
  /**
    * True if the request follows a previous request asking for
    * permission from the user and the user granted the permission(s).
    * Otherwise, false.
    * Only use after calling {@link Permission|conv.ask(new Permission)}
    * or {@link UpdatePermission|conv.ask(new UpdatePermission)}.
    * @public
    */
  var PERMISSION: js.UndefOr[PermissionArgument] = js.native
  /**
    * The user provided place.
    * Use after {@link Place|conv.ask(new Place)}.
    * @public
    */
  var PLACE: js.UndefOr[PlaceArgument] = js.native
  /**
    * True if user accepted update registration request.
    * Used with {@link RegisterUpdate|conv.ask(new RegisterUpdate)}
    * @public
    */
  var REGISTER_UPDATE: js.UndefOr[RegisterUpdateArgument] = js.native
  /**
    * The number of subsequent reprompts related to silent input from the user.
    * This should be used along with the `actions.intent.NO_INPUT` intent to reprompt the
    * user for input in cases where the Google Assistant could not pick up any speech.
    * @public
    */
  var REPROMPT_COUNT: js.UndefOr[RepromptArgument] = js.native
  /**
    * The status of user sign in request.
    * Use after {@link SignIn|conv.ask(new SignIn)}
    * @public
    */
  var SIGN_IN: js.UndefOr[SignInArgument] = js.native
  /**
    * The transaction decision information.
    * Is object with userDecision only if user declines.
    * userDecision will be one of {@link GoogleActionsV2TransactionDecisionValueUserDecision}.
    * Only use after calling {@link TransactionDecision|conv.ask(new TransactionDecision)}.
    * @public
    */
  var TRANSACTION_DECISION_VALUE: js.UndefOr[TransactionDecisionArgument] = js.native
  /**
    * The transactability of user.
    * Only use after calling {@link TransactionRequirements|conv.ask(new TransactionRequirements)}.
    * Undefined if no result given.
    * @public
    */
  var TRANSACTION_REQUIREMENTS_CHECK_RESULT: js.UndefOr[TransactionRequirementsArgument] = js.native
  /**
    * The updates user id.
    * Only use after calling {@link UpdatePermission|conv.ask(new UpdatePermission)}.
    * @public
    */
  var UPDATES_USER_ID: js.UndefOr[UpdatePermissionUserIdArgument] = js.native
}

object ArgumentsNamed {
  @scala.inline
  def apply(): ArgumentsNamed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentsNamed]
  }
  @scala.inline
  implicit class ArgumentsNamedOps[Self <: ArgumentsNamed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCOMPLETE_PURCHASE_VALUE(value: CompletePurchaseArgument): Self = this.set("COMPLETE_PURCHASE_VALUE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCOMPLETE_PURCHASE_VALUE: Self = this.set("COMPLETE_PURCHASE_VALUE", js.undefined)
    @scala.inline
    def setCONFIRMATION(value: ConfirmationArgument): Self = this.set("CONFIRMATION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCONFIRMATION: Self = this.set("CONFIRMATION", js.undefined)
    @scala.inline
    def setDATETIME(value: DateTimeArgument): Self = this.set("DATETIME", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDATETIME: Self = this.set("DATETIME", js.undefined)
    @scala.inline
    def setDELIVERY_ADDRESS_VALUE(value: DeliveryAddressArgument): Self = this.set("DELIVERY_ADDRESS_VALUE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDELIVERY_ADDRESS_VALUE: Self = this.set("DELIVERY_ADDRESS_VALUE", js.undefined)
    @scala.inline
    def setDIGITAL_PURCHASE_CHECK_RESULT(value: DigitalPurchaseCheckArgument): Self = this.set("DIGITAL_PURCHASE_CHECK_RESULT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDIGITAL_PURCHASE_CHECK_RESULT: Self = this.set("DIGITAL_PURCHASE_CHECK_RESULT", js.undefined)
    @scala.inline
    def setIS_FINAL_REPROMPT(value: FinalRepromptArgument): Self = this.set("IS_FINAL_REPROMPT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIS_FINAL_REPROMPT: Self = this.set("IS_FINAL_REPROMPT", js.undefined)
    @scala.inline
    def setLINK(value: DeepLinkArgument): Self = this.set("LINK", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLINK: Self = this.set("LINK", js.undefined)
    @scala.inline
    def setMEDIA_STATUS(value: MediaStatusArgument): Self = this.set("MEDIA_STATUS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMEDIA_STATUS: Self = this.set("MEDIA_STATUS", js.undefined)
    @scala.inline
    def setNEW_SURFACE(value: NewSurfaceArgument): Self = this.set("NEW_SURFACE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNEW_SURFACE: Self = this.set("NEW_SURFACE", js.undefined)
    @scala.inline
    def setOPTION(value: OptionArgument): Self = this.set("OPTION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOPTION: Self = this.set("OPTION", js.undefined)
    @scala.inline
    def setPERMISSION(value: PermissionArgument): Self = this.set("PERMISSION", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePERMISSION: Self = this.set("PERMISSION", js.undefined)
    @scala.inline
    def setPLACE(value: PlaceArgument): Self = this.set("PLACE", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePLACE: Self = this.set("PLACE", js.undefined)
    @scala.inline
    def setREGISTER_UPDATE(value: RegisterUpdateArgument): Self = this.set("REGISTER_UPDATE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteREGISTER_UPDATE: Self = this.set("REGISTER_UPDATE", js.undefined)
    @scala.inline
    def setREPROMPT_COUNT(value: RepromptArgument): Self = this.set("REPROMPT_COUNT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteREPROMPT_COUNT: Self = this.set("REPROMPT_COUNT", js.undefined)
    @scala.inline
    def setSIGN_IN(value: SignInArgument): Self = this.set("SIGN_IN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSIGN_IN: Self = this.set("SIGN_IN", js.undefined)
    @scala.inline
    def setTRANSACTION_DECISION_VALUE(value: TransactionDecisionArgument): Self = this.set("TRANSACTION_DECISION_VALUE", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTRANSACTION_DECISION_VALUE: Self = this.set("TRANSACTION_DECISION_VALUE", js.undefined)
    @scala.inline
    def setTRANSACTION_REQUIREMENTS_CHECK_RESULT(value: TransactionRequirementsArgument): Self = this.set("TRANSACTION_REQUIREMENTS_CHECK_RESULT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTRANSACTION_REQUIREMENTS_CHECK_RESULT: Self = this.set("TRANSACTION_REQUIREMENTS_CHECK_RESULT", js.undefined)
    @scala.inline
    def setUPDATES_USER_ID(value: UpdatePermissionUserIdArgument): Self = this.set("UPDATES_USER_ID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUPDATES_USER_ID: Self = this.set("UPDATES_USER_ID", js.undefined)
  }
  
}

