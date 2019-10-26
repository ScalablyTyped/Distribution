package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod.Intent
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDeeplinkMod.DeepLinkOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.HelperOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.ApiOptionItem
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperMod extends js.Object {
  @js.native
  class Carousel protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  class CompletePurchase ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @js.native
  class Confirmation protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperConfirmationMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @js.native
  class DateTime protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @js.native
  class DeepLink protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDeeplinkMod.DeepLink {
    /**
      * @param options DeepLink options
      * @deprecated
      * @public
      */
    def this(options: DeepLinkOptions) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  class DigitalPurchaseCheck ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @js.native
  class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @js.native
  class List protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @js.native
  class NewSurface protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @js.native
  class Permission protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @js.native
  class Place protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPlaceMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @js.native
  class RegisterUpdate protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  class SignIn ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperSigninMod.SignIn {
    def this(context: String) = this()
  }
  
  @js.native
  class SoloHelper[TIntent /* <: Intent */, TValueSpec] ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperHelperMod.Helper[TIntent, TValueSpec]
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionDecision ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionRequirements ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @js.native
  class UpdatePermission protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}

