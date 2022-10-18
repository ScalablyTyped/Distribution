package typings.actionsOnGoogle

import typings.actionsOnGoogle.distCommonMod.JsonObject
import typings.actionsOnGoogle.distServiceActionssdkActionssdkMod.ActionsSdk_
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsOrdersV3OrderUpdate
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OrdersOrderUpdate
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typings.actionsOnGoogle.distServiceActionssdkConvMod.ActionsSdkConversationOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.ConversationOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.Intent
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.HelperOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItemOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseImageMod.ImageOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestionOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectString
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseItem
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponseOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlActionOptions
import typings.actionsOnGoogle.distServiceDialogflowContextMod.Contexts
import typings.actionsOnGoogle.distServiceDialogflowConvMod.DialogflowConversationOptions
import typings.actionsOnGoogle.distServiceDialogflowDialogflowMod.Dialogflow_
import typings.actionsOnGoogle.distServiceSmarthomeSmarthomeMod.SmartHome_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("actions-on-google", "ActionsSdkConversation")
  @js.native
  /** @public */
  open class ActionsSdkConversation[TConvData, TUserStorage] ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.ActionsSdkConversation[TConvData, TUserStorage] {
    def this(options: ActionsSdkConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google", "BrowseCarousel")
  @js.native
  open class BrowseCarousel protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.BrowseCarousel {
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: GoogleActionsV2UiElementsCarouselBrowseItem*) = this()
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]) = this()
    /**
      * @param options BrowseCarousel options
      * @public
      */
    def this(options: BrowseCarouselOptions) = this()
  }
  
  @JSImport("actions-on-google", "BrowseCarouselItem")
  @js.native
  open class BrowseCarouselItem protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @JSImport("actions-on-google", "Button")
  @js.native
  open class Button protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google", "Carousel")
  @js.native
  open class Carousel protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  open class CompletePurchase ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "Confirmation")
  @js.native
  open class Confirmation protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @JSImport("actions-on-google", "Conversation")
  @js.native
  /** @hidden */
  open class Conversation[TUserStorage] ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Conversation[TUserStorage] {
    def this(options: ConversationOptions[TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DateTime")
  @js.native
  open class DateTime protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @JSImport("actions-on-google", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  open class DeliveryAddress ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "DialogflowConversation")
  @js.native
  /** @public */
  open class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typings.actionsOnGoogle.distServiceDialogflowMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  open class DigitalPurchaseCheck ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "Helper")
  @js.native
  open class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "HtmlResponse")
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  open class HtmlResponse[TData /* <: JsonObject */] ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.HtmlResponse[TData] {
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
    def this(options: HtmlResponseOptions[TData]) = this()
  }
  
  @JSImport("actions-on-google", "Image")
  @js.native
  open class Image protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Image {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @JSImport("actions-on-google", "LinkOutSuggestion")
  @js.native
  open class LinkOutSuggestion protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @JSImport("actions-on-google", "List")
  @js.native
  open class List protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google", "MediaObject")
  @js.native
  open class MediaObject protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.MediaObject {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @JSImport("actions-on-google", "MediaResponse")
  @js.native
  open class MediaResponse protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.MediaResponse {
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: MediaObjectString*) = this()
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: js.Array[MediaObjectString]) = this()
    /**
      * @param options MediaResponse options
      * @public
      */
    def this(options: MediaResponseOptions) = this()
  }
  
  @JSImport("actions-on-google", "NewSurface")
  @js.native
  open class NewSurface protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "OpenUrlAction")
  @js.native
  open class OpenUrlAction protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @JSImport("actions-on-google", "OrderUpdate")
  @js.native
  open class OrderUpdate protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @JSImport("actions-on-google", "Permission")
  @js.native
  open class Permission protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google", "Place")
  @js.native
  open class Place protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "RegisterUpdate")
  @js.native
  open class RegisterUpdate protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @JSImport("actions-on-google", "RichResponse")
  @js.native
  open class RichResponse protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.RichResponse {
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: RichResponseItem*) = this()
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: js.Array[RichResponseItem]) = this()
    /**
      * @param options RichResponse options
      * @public
      */
    def this(options: RichResponseOptions) = this()
  }
  
  @JSImport("actions-on-google", "SignIn")
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  open class SignIn ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.SignIn {
    def this(context: String) = this()
  }
  
  @JSImport("actions-on-google", "SimpleResponse")
  @js.native
  open class SimpleResponse protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @JSImport("actions-on-google", "SoloHelper")
  @js.native
  open class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.SoloHelper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "Suggestions")
  @js.native
  open class Suggestions protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Suggestions {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @JSImport("actions-on-google", "Table")
  @js.native
  open class Table protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
  @JSImport("actions-on-google", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionDecision ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  open class TransactionRequirements ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "UnauthorizedError")
  @js.native
  open class UnauthorizedError ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.UnauthorizedError
  
  @JSImport("actions-on-google", "UpdatePermission")
  @js.native
  open class UpdatePermission protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  @JSImport("actions-on-google", "actionssdk")
  @js.native
  val actionssdk: ActionsSdk_ = js.native
  
  @JSImport("actions-on-google", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
  
  @JSImport("actions-on-google", "smarthome")
  @js.native
  val smarthome: SmartHome_ = js.native
}
