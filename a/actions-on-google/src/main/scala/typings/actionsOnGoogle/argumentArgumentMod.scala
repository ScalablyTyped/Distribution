package typings.actionsOnGoogle

import org.scalablytyped.runtime.StringDictionary
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
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
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
import typings.actionsOnGoogle.v2Mod.GoogleRpcStatus
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object argumentArgumentMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Arguments")
  @js.native
  /** @hidden */
  class Arguments () extends StObject {
    def this(raw: js.Array[GoogleActionsV2Argument]) = this()
    
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
    
    /** @public */
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[GoogleActionsV2Argument]] = js.native
    
    /** @public */
    var parsed: Parsed = js.native
    
    /** @public */
    var raw: Raw = js.native
    
    /** @public */
    var status: Status = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Parsed")
  @js.native
  class Parsed protected () extends StObject {
    /** @hidden */
    def this(raw: js.Array[GoogleActionsV2Argument]) = this()
    
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
    /** @public */
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
    
    /** @public */
    var input: ArgumentsParsed = js.native
    
    /** @public */
    var list: js.Array[Argument] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Raw")
  @js.native
  class Raw protected () extends StObject {
    /** @hidden */
    def this(list: js.Array[GoogleActionsV2Argument]) = this()
    
    /** @public */
    def get(name: String): GoogleActionsV2Argument = js.native
    
    /** @public */
    var input: ArgumentsRaw = js.native
    
    var list: js.Array[GoogleActionsV2Argument] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Status")
  @js.native
  class Status protected () extends StObject {
    /** @hidden */
    def this(raw: js.Array[GoogleActionsV2Argument]) = this()
    
    /** @public */
    def get(name: String): js.UndefOr[GoogleRpcStatus] = js.native
    
    /** @public */
    var input: ArgumentsStatus = js.native
    
    /** @public */
    var list: js.Array[js.UndefOr[GoogleRpcStatus]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - scala.Unit
    - typings.actionsOnGoogle.v2Mod.GoogleRpcStatus
    - scala.Boolean
    - java.lang.String
    - typings.actionsOnGoogle.v2Mod.GoogleActionsV2Location
    - typings.actionsOnGoogle.commonMod.ApiClientObjectMap[js.Any]
    - typings.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime
  */
  type Argument = js.UndefOr[_Argument | ApiClientObjectMap[js.Any] | Double | Boolean | String]
  
  type ArgumentsIndexable = StringDictionary[Argument]
  
  trait ArgumentsNamed extends StObject {
    
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
    def apply(): ArgumentsNamed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentsNamed]
    }
    
    @scala.inline
    implicit class ArgumentsNamedMutableBuilder[Self <: ArgumentsNamed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCOMPLETE_PURCHASE_VALUE(value: CompletePurchaseArgument): Self = StObject.set(x, "COMPLETE_PURCHASE_VALUE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCOMPLETE_PURCHASE_VALUEUndefined: Self = StObject.set(x, "COMPLETE_PURCHASE_VALUE", js.undefined)
      
      @scala.inline
      def setCONFIRMATION(value: ConfirmationArgument): Self = StObject.set(x, "CONFIRMATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCONFIRMATIONUndefined: Self = StObject.set(x, "CONFIRMATION", js.undefined)
      
      @scala.inline
      def setDATETIME(value: DateTimeArgument): Self = StObject.set(x, "DATETIME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDATETIMEUndefined: Self = StObject.set(x, "DATETIME", js.undefined)
      
      @scala.inline
      def setDELIVERY_ADDRESS_VALUE(value: DeliveryAddressArgument): Self = StObject.set(x, "DELIVERY_ADDRESS_VALUE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDELIVERY_ADDRESS_VALUEUndefined: Self = StObject.set(x, "DELIVERY_ADDRESS_VALUE", js.undefined)
      
      @scala.inline
      def setDIGITAL_PURCHASE_CHECK_RESULT(value: DigitalPurchaseCheckArgument): Self = StObject.set(x, "DIGITAL_PURCHASE_CHECK_RESULT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDIGITAL_PURCHASE_CHECK_RESULTUndefined: Self = StObject.set(x, "DIGITAL_PURCHASE_CHECK_RESULT", js.undefined)
      
      @scala.inline
      def setIS_FINAL_REPROMPT(value: FinalRepromptArgument): Self = StObject.set(x, "IS_FINAL_REPROMPT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_FINAL_REPROMPTUndefined: Self = StObject.set(x, "IS_FINAL_REPROMPT", js.undefined)
      
      @scala.inline
      def setLINK(value: DeepLinkArgument): Self = StObject.set(x, "LINK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLINKUndefined: Self = StObject.set(x, "LINK", js.undefined)
      
      @scala.inline
      def setMEDIA_STATUS(value: MediaStatusArgument): Self = StObject.set(x, "MEDIA_STATUS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMEDIA_STATUSUndefined: Self = StObject.set(x, "MEDIA_STATUS", js.undefined)
      
      @scala.inline
      def setNEW_SURFACE(value: NewSurfaceArgument): Self = StObject.set(x, "NEW_SURFACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNEW_SURFACEUndefined: Self = StObject.set(x, "NEW_SURFACE", js.undefined)
      
      @scala.inline
      def setOPTION(value: OptionArgument): Self = StObject.set(x, "OPTION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOPTIONUndefined: Self = StObject.set(x, "OPTION", js.undefined)
      
      @scala.inline
      def setPERMISSION(value: PermissionArgument): Self = StObject.set(x, "PERMISSION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPERMISSIONUndefined: Self = StObject.set(x, "PERMISSION", js.undefined)
      
      @scala.inline
      def setPLACE(value: PlaceArgument): Self = StObject.set(x, "PLACE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPLACEUndefined: Self = StObject.set(x, "PLACE", js.undefined)
      
      @scala.inline
      def setREGISTER_UPDATE(value: RegisterUpdateArgument): Self = StObject.set(x, "REGISTER_UPDATE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREGISTER_UPDATEUndefined: Self = StObject.set(x, "REGISTER_UPDATE", js.undefined)
      
      @scala.inline
      def setREPROMPT_COUNT(value: RepromptArgument): Self = StObject.set(x, "REPROMPT_COUNT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREPROMPT_COUNTUndefined: Self = StObject.set(x, "REPROMPT_COUNT", js.undefined)
      
      @scala.inline
      def setSIGN_IN(value: SignInArgument): Self = StObject.set(x, "SIGN_IN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSIGN_INUndefined: Self = StObject.set(x, "SIGN_IN", js.undefined)
      
      @scala.inline
      def setTRANSACTION_DECISION_VALUE(value: TransactionDecisionArgument): Self = StObject.set(x, "TRANSACTION_DECISION_VALUE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSACTION_DECISION_VALUEUndefined: Self = StObject.set(x, "TRANSACTION_DECISION_VALUE", js.undefined)
      
      @scala.inline
      def setTRANSACTION_REQUIREMENTS_CHECK_RESULT(value: TransactionRequirementsArgument): Self = StObject.set(x, "TRANSACTION_REQUIREMENTS_CHECK_RESULT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTRANSACTION_REQUIREMENTS_CHECK_RESULTUndefined: Self = StObject.set(x, "TRANSACTION_REQUIREMENTS_CHECK_RESULT", js.undefined)
      
      @scala.inline
      def setUPDATES_USER_ID(value: UpdatePermissionUserIdArgument): Self = StObject.set(x, "UPDATES_USER_ID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUPDATES_USER_IDUndefined: Self = StObject.set(x, "UPDATES_USER_ID", js.undefined)
    }
  }
  
  trait ArgumentsParsed
    extends StObject
       with ArgumentsNamed
       with /** @public */
  /* name */ StringDictionary[js.UndefOr[Argument]]
  object ArgumentsParsed {
    
    @scala.inline
    def apply(): ArgumentsParsed = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArgumentsParsed]
    }
  }
  
  type ArgumentsRaw = /** @public */
  StringDictionary[GoogleActionsV2Argument]
  
  type ArgumentsStatus = /** @public */
  StringDictionary[js.UndefOr[GoogleRpcStatus]]
  
  trait _Argument extends StObject
  object _Argument {
    
    @scala.inline
    def GoogleActionsV2DateTime(): typings.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.actionsOnGoogle.v2Mod.GoogleActionsV2DateTime]
    }
    
    @scala.inline
    def GoogleActionsV2Location(): typings.actionsOnGoogle.v2Mod.GoogleActionsV2Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.actionsOnGoogle.v2Mod.GoogleActionsV2Location]
    }
    
    @scala.inline
    def GoogleRpcStatus(): typings.actionsOnGoogle.v2Mod.GoogleRpcStatus = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.actionsOnGoogle.v2Mod.GoogleRpcStatus]
    }
  }
}
