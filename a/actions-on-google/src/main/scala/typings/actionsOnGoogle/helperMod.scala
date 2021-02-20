package typings.actionsOnGoogle

import typings.actionsOnGoogle.carouselMod.CarouselOptions
import typings.actionsOnGoogle.conversationConversationMod.Intent
import typings.actionsOnGoogle.datetimeMod.DateTimeOptions
import typings.actionsOnGoogle.deeplinkMod.DeepLinkOptions
import typings.actionsOnGoogle.helperHelperMod.HelperOptions
import typings.actionsOnGoogle.listMod.ListOptions
import typings.actionsOnGoogle.newsurfaceMod.NewSurfaceOptions
import typings.actionsOnGoogle.optionOptionMod.ApiOptionItem
import typings.actionsOnGoogle.optionOptionMod.OptionItem
import typings.actionsOnGoogle.optionOptionMod.OptionItems
import typings.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typings.actionsOnGoogle.placeMod.PlaceOptions
import typings.actionsOnGoogle.registerupdateMod.RegisterUpdateOptions
import typings.actionsOnGoogle.updateMod.UpdatePermissionOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Carousel")
  @js.native
  class Carousel protected ()
    extends typings.actionsOnGoogle.optionMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  class CompletePurchase ()
    extends typings.actionsOnGoogle.transactionMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Confirmation")
  @js.native
  class Confirmation protected ()
    extends typings.actionsOnGoogle.confirmationMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DateTime")
  @js.native
  class DateTime protected ()
    extends typings.actionsOnGoogle.datetimeMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DeepLink")
  @js.native
  class DeepLink protected ()
    extends typings.actionsOnGoogle.deeplinkMod.DeepLink {
    /**
      * @param options DeepLink options
      * @deprecated
      * @public
      */
    def this(options: DeepLinkOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress ()
    extends typings.actionsOnGoogle.transactionMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  class DigitalPurchaseCheck ()
    extends typings.actionsOnGoogle.transactionMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Helper")
  @js.native
  class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsOnGoogle.helperHelperMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "List")
  @js.native
  class List protected ()
    extends typings.actionsOnGoogle.optionMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "NewSurface")
  @js.native
  class NewSurface protected ()
    extends typings.actionsOnGoogle.newsurfaceMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Permission")
  @js.native
  class Permission protected ()
    extends typings.actionsOnGoogle.permissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Place")
  @js.native
  class Place protected ()
    extends typings.actionsOnGoogle.placeMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "RegisterUpdate")
  @js.native
  class RegisterUpdate protected ()
    extends typings.actionsOnGoogle.registerupdateMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "SignIn")
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  class SignIn ()
    extends typings.actionsOnGoogle.signinMod.SignIn {
    def this(context: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "SoloHelper")
  @js.native
  class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsOnGoogle.helperHelperMod.SoloHelper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionDecision ()
    extends typings.actionsOnGoogle.transactionMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionRequirements ()
    extends typings.actionsOnGoogle.transactionMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "UpdatePermission")
  @js.native
  class UpdatePermission protected ()
    extends typings.actionsOnGoogle.permissionMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "convert")
  @js.native
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}
