package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionssdkActionssdkMod.ActionsSdk_
import typings.actionsOnGoogle.basicMod.BasicCardOptions
import typings.actionsOnGoogle.browseMod.BrowseCarouselItemOptions
import typings.actionsOnGoogle.browseMod.BrowseCarouselOptions
import typings.actionsOnGoogle.buttonMod.ButtonOptions
import typings.actionsOnGoogle.carouselMod.CarouselOptions
import typings.actionsOnGoogle.commonMod.JsonObject
import typings.actionsOnGoogle.contextMod.Contexts
import typings.actionsOnGoogle.convMod.ActionsSdkConversationOptions
import typings.actionsOnGoogle.conversationConversationMod.ConversationOptions
import typings.actionsOnGoogle.conversationConversationMod.Intent
import typings.actionsOnGoogle.datetimeMod.DateTimeOptions
import typings.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import typings.actionsOnGoogle.dialogflowDialogflowMod.Dialogflow_
import typings.actionsOnGoogle.helperHelperMod.HelperOptions
import typings.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typings.actionsOnGoogle.imageMod.ImageOptions
import typings.actionsOnGoogle.linkoutMod.LinkOutSuggestionOptions
import typings.actionsOnGoogle.listMod.ListOptions
import typings.actionsOnGoogle.newsurfaceMod.NewSurfaceOptions
import typings.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typings.actionsOnGoogle.placeMod.PlaceOptions
import typings.actionsOnGoogle.registerupdateMod.RegisterUpdateOptions
import typings.actionsOnGoogle.responseMediaMod.MediaObjectOptions
import typings.actionsOnGoogle.responseMediaMod.MediaObjectString
import typings.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import typings.actionsOnGoogle.richMod.RichResponseItem
import typings.actionsOnGoogle.richMod.RichResponseOptions
import typings.actionsOnGoogle.simpleMod.SimpleResponseOptions
import typings.actionsOnGoogle.smarthomeSmarthomeMod.SmartHome_
import typings.actionsOnGoogle.tableMod.TableOptions
import typings.actionsOnGoogle.updateMod.UpdatePermissionOptions
import typings.actionsOnGoogle.urlMod.OpenUrlActionOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("actions-on-google", "ActionsSdkConversation")
  @js.native
  /** @public */
  open class ActionsSdkConversation[TConvData, TUserStorage] ()
    extends typings.actionsOnGoogle.actionssdkMod.ActionsSdkConversation[TConvData, TUserStorage] {
    def this(options: ActionsSdkConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends typings.actionsOnGoogle.actionssdkMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google", "BrowseCarousel")
  @js.native
  open class BrowseCarousel protected ()
    extends typings.actionsOnGoogle.actionssdkMod.BrowseCarousel {
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
    extends typings.actionsOnGoogle.actionssdkMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @JSImport("actions-on-google", "Button")
  @js.native
  open class Button protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google", "Carousel")
  @js.native
  open class Carousel protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Carousel {
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
    extends typings.actionsOnGoogle.actionssdkMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "Confirmation")
  @js.native
  open class Confirmation protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Confirmation {
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
    extends typings.actionsOnGoogle.actionssdkMod.Conversation[TUserStorage] {
    def this(options: ConversationOptions[TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DateTime")
  @js.native
  open class DateTime protected ()
    extends typings.actionsOnGoogle.actionssdkMod.DateTime {
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
    extends typings.actionsOnGoogle.actionssdkMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "DialogflowConversation")
  @js.native
  /** @public */
  open class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typings.actionsOnGoogle.dialogflowMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  open class DigitalPurchaseCheck ()
    extends typings.actionsOnGoogle.actionssdkMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "Helper")
  @js.native
  open class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "HtmlResponse")
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  open class HtmlResponse[TData /* <: JsonObject */] ()
    extends typings.actionsOnGoogle.actionssdkMod.HtmlResponse[TData] {
    def this(options: HtmlResponseOptions[TData]) = this()
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  }
  
  @JSImport("actions-on-google", "Image")
  @js.native
  open class Image protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Image {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @JSImport("actions-on-google", "LinkOutSuggestion")
  @js.native
  open class LinkOutSuggestion protected ()
    extends typings.actionsOnGoogle.actionssdkMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @JSImport("actions-on-google", "List")
  @js.native
  open class List protected ()
    extends typings.actionsOnGoogle.actionssdkMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google", "MediaObject")
  @js.native
  open class MediaObject protected ()
    extends typings.actionsOnGoogle.actionssdkMod.MediaObject {
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
    extends typings.actionsOnGoogle.actionssdkMod.MediaResponse {
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
    extends typings.actionsOnGoogle.actionssdkMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "OpenUrlAction")
  @js.native
  open class OpenUrlAction protected ()
    extends typings.actionsOnGoogle.actionssdkMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @JSImport("actions-on-google", "OrderUpdate")
  @js.native
  open class OrderUpdate protected ()
    extends typings.actionsOnGoogle.actionssdkMod.OrderUpdate {
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
    extends typings.actionsOnGoogle.actionssdkMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google", "Place")
  @js.native
  open class Place protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "RegisterUpdate")
  @js.native
  open class RegisterUpdate protected ()
    extends typings.actionsOnGoogle.actionssdkMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @JSImport("actions-on-google", "RichResponse")
  @js.native
  open class RichResponse protected ()
    extends typings.actionsOnGoogle.actionssdkMod.RichResponse {
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
    extends typings.actionsOnGoogle.actionssdkMod.SignIn {
    def this(context: String) = this()
  }
  
  @JSImport("actions-on-google", "SimpleResponse")
  @js.native
  open class SimpleResponse protected ()
    extends typings.actionsOnGoogle.actionssdkMod.SimpleResponse {
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
    extends typings.actionsOnGoogle.actionssdkMod.SoloHelper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "Suggestions")
  @js.native
  open class Suggestions protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Suggestions {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @JSImport("actions-on-google", "Table")
  @js.native
  open class Table protected ()
    extends typings.actionsOnGoogle.actionssdkMod.Table {
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
    extends typings.actionsOnGoogle.actionssdkMod.TransactionDecision {
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
    extends typings.actionsOnGoogle.actionssdkMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "UnauthorizedError")
  @js.native
  open class UnauthorizedError ()
    extends typings.actionsOnGoogle.actionssdkMod.UnauthorizedError
  
  @JSImport("actions-on-google", "UpdatePermission")
  @js.native
  open class UpdatePermission protected ()
    extends typings.actionsOnGoogle.actionssdkMod.UpdatePermission {
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
