package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typings.actionsOnGoogle.distServiceActionssdkConversationConversationMod.Intent
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.HelperOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.ApiOptionItem
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Carousel")
  @js.native
  open class Carousel protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionMod.Carousel {
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
  open class CompletePurchase ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Confirmation")
  @js.native
  open class Confirmation protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperConfirmationMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DateTime")
  @js.native
  open class DateTime protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  open class DeliveryAddress ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  open class DigitalPurchaseCheck ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Helper")
  @js.native
  open class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "List")
  @js.native
  open class List protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "NewSurface")
  @js.native
  open class NewSurface protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Permission")
  @js.native
  open class Permission protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "Place")
  @js.native
  open class Place protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperPlaceMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "RegisterUpdate")
  @js.native
  open class RegisterUpdate protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdate {
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
  open class SignIn ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperSigninMod.SignIn {
    def this(context: String) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "SoloHelper")
  @js.native
  open class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.SoloHelper[TIntent, TValueSpec] {
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
  open class TransactionDecision ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.TransactionDecision {
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
  open class TransactionRequirements ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperTransactionMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", "UpdatePermission")
  @js.native
  open class UpdatePermission protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperPermissionMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  inline def convert(items: OptionItems[OptionItem | String]): js.Array[ApiOptionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[ApiOptionItem]]
}
