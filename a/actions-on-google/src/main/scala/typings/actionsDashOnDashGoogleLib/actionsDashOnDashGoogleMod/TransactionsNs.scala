package typings
package actionsDashOnDashGoogleLib.actionsDashOnDashGoogleMod

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
    extends actionsDashOnDashGoogleLib.transactionsMod.Cart {
    def this(cartId: java.lang.String) = this()
  }
  
  @js.native
  class LineItem protected ()
    extends actionsDashOnDashGoogleLib.transactionsMod.LineItem {
    /**
      * Constructor for LineItem.
      *
      * @param lineItemId Unique identifier for the item.
      * @param name Name of the item.
      */
    def this(lineItemId: java.lang.String, name: java.lang.String) = this()
  }
  
  @js.native
  class Order protected ()
    extends actionsDashOnDashGoogleLib.transactionsMod.Order {
    /**
      * Constructor for Order.
      *
      * @param orderId Unique identifier for the order.
      */
    def this(orderId: java.lang.String) = this()
  }
  
  @js.native
  class OrderUpdate protected ()
    extends actionsDashOnDashGoogleLib.transactionsMod.OrderUpdate {
    /**
      * Constructor for OrderUpdate.
      *
      * @param orderId Unique identifier of the order.
      * @param isGoogleOrderId True if the order ID is provided by
      *     Google. False if the order ID is app provided.
      */
    def this(orderId: java.lang.String, isGoogleOrderId: scala.Boolean) = this()
  }
  
  @JSName("TransactionValues")
  @js.native
  object TransactionValuesNs extends js.Object {
    /**
      * List of possible actions to take on the order.
      */
    @js.native
    object ActionType extends js.Object {
      /* 7 */ val CALL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.CALL with scala.Double = js.native
      /* 3 */ val CANCEL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.CANCEL with scala.Double = js.native
      /* 10 */ val CUSTOMER_SERVICE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.CUSTOMER_SERVICE with scala.Double = js.native
      /* 6 */ val EMAIL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.EMAIL with scala.Double = js.native
      /* 5 */ val EXCHANGE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.EXCHANGE with scala.Double = js.native
      /* 2 */ val MODIFY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.MODIFY with scala.Double = js.native
      /* 8 */ val REORDER: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.REORDER with scala.Double = js.native
      /* 4 */ val RETURN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.RETURN with scala.Double = js.native
      /* 9 */ val REVIEW: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.REVIEW with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.UNKNOWN with scala.Double = js.native
      /* 1 */ val VIEW_DETAILS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.VIEW_DETAILS with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType with scala.Double
          ] = js.native
    }
    
    /**
      * List of transaction card networks available when paying with Google.
      */
    @js.native
    object CardNetwork extends js.Object {
      /* 1 */ val AMEX: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.AMEX with scala.Double = js.native
      /* 2 */ val DISCOVER: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.DISCOVER with scala.Double = js.native
      /* 5 */ val JCB: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.JCB with scala.Double = js.native
      /* 3 */ val MASTERCARD: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.MASTERCARD with scala.Double = js.native
      /* 0 */ val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.UNSPECIFIED with scala.Double = js.native
      /* 4 */ val VISA: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.VISA with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order confirmation user decisions
      */
    @js.native
    object ConfirmationDecision extends js.Object {
      /* 1 */ val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.ACCEPTED with scala.Double = js.native
      /* 4 */ val CART_CHANGE_REQUESTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.CART_CHANGE_REQUESTED with scala.Double = js.native
      /* 3 */ val DELIVERY_ADDRESS_UPDATED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.DELIVERY_ADDRESS_UPDATED with scala.Double = js.native
      /* 2 */ val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.REJECTED with scala.Double = js.native
      /* 0 */ val UNKNOWN_USER_DECISION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.UNKNOWN_USER_DECISION with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision with scala.Double
          ] = js.native
    }
    
    /**
      * List of customer information properties that can be requested.
      */
    @js.native
    object CustomerInfoProperties extends js.Object {
      /* 0 */ val CUSTOMER_INFO_PROPERTY_UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties.CUSTOMER_INFO_PROPERTY_UNSPECIFIED with scala.Double = js.native
      /* 1 */ val EMAIL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties.EMAIL with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible user decisions to give delivery address.
      */
    @js.native
    object DeliveryAddressDecision extends js.Object {
      /* 1 */ val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.ACCEPTED with scala.Double = js.native
      /* 2 */ val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.REJECTED with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible user decisions to give delivery address.
      */
    @js.native
    object DeliveryAddressUserDecision extends js.Object {
      /* 1 */ val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.ACCEPTED with scala.Double = js.native
      /* 2 */ val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.REJECTED with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object ItemType extends js.Object {
      /* 5 */ val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.DELIVERY with scala.Double = js.native
      /* 3 */ val DISCOUNT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.DISCOUNT with scala.Double = js.native
      /* 7 */ val FEE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.FEE with scala.Double = js.native
      /* 4 */ val GRATUITY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.GRATUITY with scala.Double = js.native
      /* 1 */ val REGULAR: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.REGULAR with scala.Double = js.native
      /* 6 */ val SUBTOTAL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.SUBTOTAL with scala.Double = js.native
      /* 2 */ val TAX: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.TAX with scala.Double = js.native
      /* 0 */ val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.UNSPECIFIED with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object LineItemType extends js.Object {
      /* 5 */ val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.DELIVERY with scala.Double = js.native
      /* 3 */ val DISCOUNT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.DISCOUNT with scala.Double = js.native
      /* 7 */ val FEE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.FEE with scala.Double = js.native
      /* 4 */ val GRATUITY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.GRATUITY with scala.Double = js.native
      /* 1 */ val REGULAR: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.REGULAR with scala.Double = js.native
      /* 6 */ val SUBTOTAL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.SUBTOTAL with scala.Double = js.native
      /* 2 */ val TAX: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.TAX with scala.Double = js.native
      /* 0 */ val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.UNSPECIFIED with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order location types.
      */
    @js.native
    object LocationType extends js.Object {
      /* 2 */ val BUSINESS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.BUSINESS with scala.Double = js.native
      /* 1 */ val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.DELIVERY with scala.Double = js.native
      /* 4 */ val DESTINATION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.DESTINATION with scala.Double = js.native
      /* 3 */ val ORIGIN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.ORIGIN with scala.Double = js.native
      /* 5 */ val PICK_UP: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.PICK_UP with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible actions to take on the order.
      */
    @js.native
    object OrderAction extends js.Object {
      /* 7 */ val CALL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.CALL with scala.Double = js.native
      /* 3 */ val CANCEL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.CANCEL with scala.Double = js.native
      /* 10 */ val CUSTOMER_SERVICE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.CUSTOMER_SERVICE with scala.Double = js.native
      /* 6 */ val EMAIL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.EMAIL with scala.Double = js.native
      /* 5 */ val EXCHANGE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.EXCHANGE with scala.Double = js.native
      /* 2 */ val MODIFY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.MODIFY with scala.Double = js.native
      /* 8 */ val REORDER: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.REORDER with scala.Double = js.native
      /* 4 */ val RETURN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.RETURN with scala.Double = js.native
      /* 9 */ val REVIEW: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.REVIEW with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.UNKNOWN with scala.Double = js.native
      /* 1 */ val VIEW_DETAILS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.VIEW_DETAILS with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order location types.
      */
    @js.native
    object OrderLocationType extends js.Object {
      /* 2 */ val BUSINESS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.BUSINESS with scala.Double = js.native
      /* 1 */ val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.DELIVERY with scala.Double = js.native
      /* 4 */ val DESTINATION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.DESTINATION with scala.Double = js.native
      /* 3 */ val ORIGIN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.ORIGIN with scala.Double = js.native
      /* 5 */ val PICK_UP: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.PICK_UP with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order states.
      */
    @js.native
    object OrderState extends js.Object {
      /* 3 */ val CANCELLED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.CANCELLED with scala.Double = js.native
      /* 2 */ val CONFIRMED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.CONFIRMED with scala.Double = js.native
      /* 0 */ val CREATED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.CREATED with scala.Double = js.native
      /* 6 */ val FULFILLED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.FULFILLED with scala.Double = js.native
      /* 4 */ val IN_TRANSIT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.IN_TRANSIT with scala.Double = js.native
      /* 1 */ val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.REJECTED with scala.Double = js.native
      /* 5 */ val RETURNED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.RETURNED with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order state objects.
      */
    @js.native
    object OrderStateInfo extends js.Object {
      /* 2 */ val CANCELLATION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.CANCELLATION with scala.Double = js.native
      /* 4 */ val FULFILLMENT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.FULFILLMENT with scala.Double = js.native
      /* 3 */ val IN_TRANSIT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.IN_TRANSIT with scala.Double = js.native
      /* 1 */ val RECEIPT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.RECEIPT with scala.Double = js.native
      /* 0 */ val REJECTION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.REJECTION with scala.Double = js.native
      /* 5 */ val RETURN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.RETURN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible tokenization types for the payment method
      */
    @js.native
    object PaymentMethodTokenizationType extends js.Object {
      /* 2 */ val DIRECT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.DIRECT with scala.Double = js.native
      /* 1 */ val PAYMENT_GATEWAY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.PAYMENT_GATEWAY with scala.Double = js.native
      /* 0 */ val UNSPECIFIED_TOKENIZATION_TYPE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.UNSPECIFIED_TOKENIZATION_TYPE with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object PaymentType extends js.Object {
      /* 2 */ val BANK: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.BANK with scala.Double = js.native
      /* 5 */ val GIFT_CARD: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.GIFT_CARD with scala.Double = js.native
      /* 3 */ val LOYALTY_PROGRAM: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.LOYALTY_PROGRAM with scala.Double = js.native
      /* 4 */ val ON_FULFILLMENT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.ON_FULFILLMENT with scala.Double = js.native
      /* 1 */ val PAYMENT_CARD: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.PAYMENT_CARD with scala.Double = js.native
      /* 0 */ val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.UNSPECIFIED with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType with scala.Double
          ] = js.native
    }
    
    /**
      * List of price types.
      */
    @js.native
    object PriceType extends js.Object {
      /* 2 */ val ACTUAL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType.ACTUAL with scala.Double = js.native
      /* 1 */ val ESTIMATE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType.ESTIMATE with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible types of order rejection.
      */
    @js.native
    object ReasonType extends js.Object {
      /* 1 */ val PAYMENT_DECLINED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType.PAYMENT_DECLINED with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible types of order rejection.
      */
    @js.native
    object RejectionType extends js.Object {
      /* 1 */ val PAYMENT_DECLINED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType.PAYMENT_DECLINED with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order transaction requirements check result types.
      */
    @js.native
    object ResultType extends js.Object {
      /* 3 */ val ASSISTANT_SURFACE_NOT_SUPPORTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.ASSISTANT_SURFACE_NOT_SUPPORTED with scala.Double = js.native
      /* 1 */ val OK: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.OK with scala.Double = js.native
      /* 4 */ val REGION_NOT_SUPPORTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.REGION_NOT_SUPPORTED with scala.Double = js.native
      /* 0 */ val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.UNSPECIFIED with scala.Double = js.native
      /* 2 */ val USER_ACTION_REQUIRED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.USER_ACTION_REQUIRED with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order time types.
      */
    @js.native
    object TimeType extends js.Object {
      /* 1 */ val DELIVERY_DATE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.DELIVERY_DATE with scala.Double = js.native
      /* 2 */ val ETA: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.ETA with scala.Double = js.native
      /* 3 */ val RESERVATION_SLOT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.RESERVATION_SLOT with scala.Double = js.native
      /* 0 */ val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.UNKNOWN with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType with scala.Double
          ] = js.native
    }
    
    /**
      * List of possible order confirmation user decisions
      */
    @js.native
    object TransactionUserDecision extends js.Object {
      /* 1 */ val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.ACCEPTED with scala.Double = js.native
      /* 4 */ val CART_CHANGE_REQUESTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.CART_CHANGE_REQUESTED with scala.Double = js.native
      /* 3 */ val DELIVERY_ADDRESS_UPDATED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.DELIVERY_ADDRESS_UPDATED with scala.Double = js.native
      /* 2 */ val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.REJECTED with scala.Double = js.native
      /* 0 */ val UNKNOWN_USER_DECISION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.UNKNOWN_USER_DECISION with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision with scala.Double
          ] = js.native
    }
    
  }
  
}

