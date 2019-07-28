package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "Transactions")
@js.native
object TransactionsNs extends js.Object {
  @js.native
  /**
    * Constructor for Cart.
    *
    * @param cartId Optional unique identifier for the cart.
    */
  class Cart ()
    extends typings.actionsDashOnDashGoogle.transactionsMod.Cart {
    def this(cartId: String) = this()
  }
  
  @js.native
  class LineItem protected ()
    extends typings.actionsDashOnDashGoogle.transactionsMod.LineItem {
    /**
      * Constructor for LineItem.
      *
      * @param lineItemId Unique identifier for the item.
      * @param name Name of the item.
      */
    def this(lineItemId: String, name: String) = this()
  }
  
  @js.native
  class Order protected ()
    extends typings.actionsDashOnDashGoogle.transactionsMod.Order {
    /**
      * Constructor for Order.
      *
      * @param orderId Unique identifier for the order.
      */
    def this(orderId: String) = this()
  }
  
  @js.native
  class OrderUpdate protected ()
    extends typings.actionsDashOnDashGoogle.transactionsMod.OrderUpdate {
    /**
      * Constructor for OrderUpdate.
      *
      * @param orderId Unique identifier of the order.
      * @param isGoogleOrderId True if the order ID is provided by
      *     Google. False if the order ID is app provided.
      */
    def this(orderId: String, isGoogleOrderId: Boolean) = this()
  }
  
  @JSName("TransactionValues")
  @js.native
  object TransactionValuesNs extends js.Object {
    /**
      * List of possible actions to take on the order.
      */
    @js.native
    object ActionType extends js.Object {
      /* 7 */ val CALL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.CALL with Double = js.native
      /* 3 */ val CANCEL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.CANCEL with Double = js.native
      /* 10 */ val CUSTOMER_SERVICE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.CUSTOMER_SERVICE with Double = js.native
      /* 6 */ val EMAIL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.EMAIL with Double = js.native
      /* 5 */ val EXCHANGE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.EXCHANGE with Double = js.native
      /* 2 */ val MODIFY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.MODIFY with Double = js.native
      /* 8 */ val REORDER: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.REORDER with Double = js.native
      /* 4 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.RETURN with Double = js.native
      /* 9 */ val REVIEW: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.REVIEW with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.UNKNOWN with Double = js.native
      /* 1 */ val VIEW_DETAILS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType.VIEW_DETAILS with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType with Double
          ] = js.native
    }
    
    /**
      * List of transaction card networks available when paying with Google.
      */
    @js.native
    object CardNetwork extends js.Object {
      /* 1 */ val AMEX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.AMEX with Double = js.native
      /* 2 */ val DISCOVER: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.DISCOVER with Double = js.native
      /* 5 */ val JCB: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.JCB with Double = js.native
      /* 3 */ val MASTERCARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.MASTERCARD with Double = js.native
      /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.UNSPECIFIED with Double = js.native
      /* 4 */ val VISA: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.VISA with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork with Double
          ] = js.native
    }
    
    /**
      * List of possible order confirmation user decisions
      */
    @js.native
    object ConfirmationDecision extends js.Object {
      /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.ACCEPTED with Double = js.native
      /* 4 */ val CART_CHANGE_REQUESTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.CART_CHANGE_REQUESTED with Double = js.native
      /* 3 */ val DELIVERY_ADDRESS_UPDATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.DELIVERY_ADDRESS_UPDATED with Double = js.native
      /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.REJECTED with Double = js.native
      /* 0 */ val UNKNOWN_USER_DECISION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.UNKNOWN_USER_DECISION with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision with Double
          ] = js.native
    }
    
    /**
      * List of customer information properties that can be requested.
      */
    @js.native
    object CustomerInfoProperties extends js.Object {
      /* 0 */ val CUSTOMER_INFO_PROPERTY_UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CustomerInfoProperties.CUSTOMER_INFO_PROPERTY_UNSPECIFIED with Double = js.native
      /* 1 */ val EMAIL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CustomerInfoProperties.EMAIL with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CustomerInfoProperties with Double
          ] = js.native
    }
    
    /**
      * List of possible user decisions to give delivery address.
      */
    @js.native
    object DeliveryAddressDecision extends js.Object {
      /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.ACCEPTED with Double = js.native
      /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.REJECTED with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision with Double
          ] = js.native
    }
    
    /**
      * List of possible user decisions to give delivery address.
      */
    @js.native
    object DeliveryAddressUserDecision extends js.Object {
      /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.ACCEPTED with Double = js.native
      /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.REJECTED with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision with Double
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object ItemType extends js.Object {
      /* 5 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.DELIVERY with Double = js.native
      /* 3 */ val DISCOUNT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.DISCOUNT with Double = js.native
      /* 7 */ val FEE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.FEE with Double = js.native
      /* 4 */ val GRATUITY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.GRATUITY with Double = js.native
      /* 1 */ val REGULAR: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.REGULAR with Double = js.native
      /* 6 */ val SUBTOTAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.SUBTOTAL with Double = js.native
      /* 2 */ val TAX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.TAX with Double = js.native
      /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.UNSPECIFIED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType with Double
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object LineItemType extends js.Object {
      /* 5 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.DELIVERY with Double = js.native
      /* 3 */ val DISCOUNT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.DISCOUNT with Double = js.native
      /* 7 */ val FEE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.FEE with Double = js.native
      /* 4 */ val GRATUITY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.GRATUITY with Double = js.native
      /* 1 */ val REGULAR: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.REGULAR with Double = js.native
      /* 6 */ val SUBTOTAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.SUBTOTAL with Double = js.native
      /* 2 */ val TAX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.TAX with Double = js.native
      /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.UNSPECIFIED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType with Double
          ] = js.native
    }
    
    /**
      * List of possible order location types.
      */
    @js.native
    object LocationType extends js.Object {
      /* 2 */ val BUSINESS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.BUSINESS with Double = js.native
      /* 1 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.DELIVERY with Double = js.native
      /* 4 */ val DESTINATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.DESTINATION with Double = js.native
      /* 3 */ val ORIGIN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.ORIGIN with Double = js.native
      /* 5 */ val PICK_UP: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.PICK_UP with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType with Double
          ] = js.native
    }
    
    /**
      * List of possible actions to take on the order.
      */
    @js.native
    object OrderAction extends js.Object {
      /* 7 */ val CALL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.CALL with Double = js.native
      /* 3 */ val CANCEL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.CANCEL with Double = js.native
      /* 10 */ val CUSTOMER_SERVICE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.CUSTOMER_SERVICE with Double = js.native
      /* 6 */ val EMAIL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.EMAIL with Double = js.native
      /* 5 */ val EXCHANGE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.EXCHANGE with Double = js.native
      /* 2 */ val MODIFY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.MODIFY with Double = js.native
      /* 8 */ val REORDER: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.REORDER with Double = js.native
      /* 4 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.RETURN with Double = js.native
      /* 9 */ val REVIEW: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.REVIEW with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.UNKNOWN with Double = js.native
      /* 1 */ val VIEW_DETAILS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction.VIEW_DETAILS with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction with Double
          ] = js.native
    }
    
    /**
      * List of possible order location types.
      */
    @js.native
    object OrderLocationType extends js.Object {
      /* 2 */ val BUSINESS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.BUSINESS with Double = js.native
      /* 1 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.DELIVERY with Double = js.native
      /* 4 */ val DESTINATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.DESTINATION with Double = js.native
      /* 3 */ val ORIGIN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.ORIGIN with Double = js.native
      /* 5 */ val PICK_UP: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.PICK_UP with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType with Double
          ] = js.native
    }
    
    /**
      * List of possible order states.
      */
    @js.native
    object OrderState extends js.Object {
      /* 3 */ val CANCELLED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.CANCELLED with Double = js.native
      /* 2 */ val CONFIRMED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.CONFIRMED with Double = js.native
      /* 0 */ val CREATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.CREATED with Double = js.native
      /* 6 */ val FULFILLED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.FULFILLED with Double = js.native
      /* 4 */ val IN_TRANSIT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.IN_TRANSIT with Double = js.native
      /* 1 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.REJECTED with Double = js.native
      /* 5 */ val RETURNED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.RETURNED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState with Double
          ] = js.native
    }
    
    /**
      * List of possible order state objects.
      */
    @js.native
    object OrderStateInfo extends js.Object {
      /* 2 */ val CANCELLATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.CANCELLATION with Double = js.native
      /* 4 */ val FULFILLMENT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.FULFILLMENT with Double = js.native
      /* 3 */ val IN_TRANSIT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.IN_TRANSIT with Double = js.native
      /* 1 */ val RECEIPT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.RECEIPT with Double = js.native
      /* 0 */ val REJECTION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.REJECTION with Double = js.native
      /* 5 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.RETURN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo with Double
          ] = js.native
    }
    
    /**
      * List of possible tokenization types for the payment method
      */
    @js.native
    object PaymentMethodTokenizationType extends js.Object {
      /* 2 */ val DIRECT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.DIRECT with Double = js.native
      /* 1 */ val PAYMENT_GATEWAY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.PAYMENT_GATEWAY with Double = js.native
      /* 0 */ val UNSPECIFIED_TOKENIZATION_TYPE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.UNSPECIFIED_TOKENIZATION_TYPE with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType with Double
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object PaymentType extends js.Object {
      /* 2 */ val BANK: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.BANK with Double = js.native
      /* 5 */ val GIFT_CARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.GIFT_CARD with Double = js.native
      /* 3 */ val LOYALTY_PROGRAM: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.LOYALTY_PROGRAM with Double = js.native
      /* 4 */ val ON_FULFILLMENT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.ON_FULFILLMENT with Double = js.native
      /* 1 */ val PAYMENT_CARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.PAYMENT_CARD with Double = js.native
      /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.UNSPECIFIED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType with Double
          ] = js.native
    }
    
    /**
      * List of price types.
      */
    @js.native
    object PriceType extends js.Object {
      /* 2 */ val ACTUAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType.ACTUAL with Double = js.native
      /* 1 */ val ESTIMATE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType.ESTIMATE with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType with Double
          ] = js.native
    }
    
    /**
      * List of possible types of order rejection.
      */
    @js.native
    object ReasonType extends js.Object {
      /* 1 */ val PAYMENT_DECLINED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ReasonType.PAYMENT_DECLINED with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ReasonType.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ReasonType with Double
          ] = js.native
    }
    
    /**
      * List of possible types of order rejection.
      */
    @js.native
    object RejectionType extends js.Object {
      /* 1 */ val PAYMENT_DECLINED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.RejectionType.PAYMENT_DECLINED with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.RejectionType.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.RejectionType with Double
          ] = js.native
    }
    
    /**
      * List of possible order transaction requirements check result types.
      */
    @js.native
    object ResultType extends js.Object {
      /* 3 */ val ASSISTANT_SURFACE_NOT_SUPPORTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.ASSISTANT_SURFACE_NOT_SUPPORTED with Double = js.native
      /* 1 */ val OK: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.OK with Double = js.native
      /* 4 */ val REGION_NOT_SUPPORTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.REGION_NOT_SUPPORTED with Double = js.native
      /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.UNSPECIFIED with Double = js.native
      /* 2 */ val USER_ACTION_REQUIRED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.USER_ACTION_REQUIRED with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType with Double
          ] = js.native
    }
    
    /**
      * List of possible order time types.
      */
    @js.native
    object TimeType extends js.Object {
      /* 1 */ val DELIVERY_DATE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.DELIVERY_DATE with Double = js.native
      /* 2 */ val ETA: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.ETA with Double = js.native
      /* 3 */ val RESERVATION_SLOT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.RESERVATION_SLOT with Double = js.native
      /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.UNKNOWN with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType with Double
          ] = js.native
    }
    
    /**
      * List of possible order confirmation user decisions
      */
    @js.native
    object TransactionUserDecision extends js.Object {
      /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.ACCEPTED with Double = js.native
      /* 4 */ val CART_CHANGE_REQUESTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.CART_CHANGE_REQUESTED with Double = js.native
      /* 3 */ val DELIVERY_ADDRESS_UPDATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.DELIVERY_ADDRESS_UPDATED with Double = js.native
      /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.REJECTED with Double = js.native
      /* 0 */ val UNKNOWN_USER_DECISION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.UNKNOWN_USER_DECISION with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision with Double
          ] = js.native
    }
    
  }
  
}

