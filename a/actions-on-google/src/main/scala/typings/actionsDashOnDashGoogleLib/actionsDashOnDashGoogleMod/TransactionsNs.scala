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
      val CALL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.CALL with java.lang.String = js.native
      val CANCEL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.CANCEL with java.lang.String = js.native
      val CUSTOMER_SERVICE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.CUSTOMER_SERVICE with java.lang.String = js.native
      val EMAIL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.EMAIL with java.lang.String = js.native
      val EXCHANGE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.EXCHANGE with java.lang.String = js.native
      val MODIFY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.MODIFY with java.lang.String = js.native
      val REORDER: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.REORDER with java.lang.String = js.native
      val RETURN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.RETURN with java.lang.String = js.native
      val REVIEW: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.REVIEW with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.UNKNOWN with java.lang.String = js.native
      val VIEW_DETAILS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType.VIEW_DETAILS with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of transaction card networks available when paying with Google.
      */
    @js.native
    object CardNetwork extends js.Object {
      val AMEX: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.AMEX with java.lang.String = js.native
      val DISCOVER: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.DISCOVER with java.lang.String = js.native
      val JCB: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.JCB with java.lang.String = js.native
      val MASTERCARD: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.MASTERCARD with java.lang.String = js.native
      val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.UNSPECIFIED with java.lang.String = js.native
      val VISA: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork.VISA with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order confirmation user decisions
      */
    @js.native
    object ConfirmationDecision extends js.Object {
      val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.ACCEPTED with java.lang.String = js.native
      val CART_CHANGE_REQUESTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.CART_CHANGE_REQUESTED with java.lang.String = js.native
      val DELIVERY_ADDRESS_UPDATED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.DELIVERY_ADDRESS_UPDATED with java.lang.String = js.native
      val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.REJECTED with java.lang.String = js.native
      val UNKNOWN_USER_DECISION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision.UNKNOWN_USER_DECISION with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision with java.lang.String
          ] = js.native
    }
    
    /**
      * List of customer information properties that can be requested.
      */
    @js.native
    object CustomerInfoProperties extends js.Object {
      val CUSTOMER_INFO_PROPERTY_UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties.CUSTOMER_INFO_PROPERTY_UNSPECIFIED with java.lang.String = js.native
      val EMAIL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties.EMAIL with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible user decisions to give delivery address.
      */
    @js.native
    object DeliveryAddressDecision extends js.Object {
      val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.ACCEPTED with java.lang.String = js.native
      val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.REJECTED with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible user decisions to give delivery address.
      */
    @js.native
    object DeliveryAddressUserDecision extends js.Object {
      val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.ACCEPTED with java.lang.String = js.native
      val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.REJECTED with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object ItemType extends js.Object {
      val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.DELIVERY with java.lang.String = js.native
      val DISCOUNT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.DISCOUNT with java.lang.String = js.native
      val FEE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.FEE with java.lang.String = js.native
      val GRATUITY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.GRATUITY with java.lang.String = js.native
      val REGULAR: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.REGULAR with java.lang.String = js.native
      val SUBTOTAL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.SUBTOTAL with java.lang.String = js.native
      val TAX: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.TAX with java.lang.String = js.native
      val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType.UNSPECIFIED with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object LineItemType extends js.Object {
      val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.DELIVERY with java.lang.String = js.native
      val DISCOUNT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.DISCOUNT with java.lang.String = js.native
      val FEE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.FEE with java.lang.String = js.native
      val GRATUITY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.GRATUITY with java.lang.String = js.native
      val REGULAR: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.REGULAR with java.lang.String = js.native
      val SUBTOTAL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.SUBTOTAL with java.lang.String = js.native
      val TAX: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.TAX with java.lang.String = js.native
      val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType.UNSPECIFIED with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order location types.
      */
    @js.native
    object LocationType extends js.Object {
      val BUSINESS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.BUSINESS with java.lang.String = js.native
      val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.DELIVERY with java.lang.String = js.native
      val DESTINATION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.DESTINATION with java.lang.String = js.native
      val ORIGIN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.ORIGIN with java.lang.String = js.native
      val PICK_UP: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.PICK_UP with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible actions to take on the order.
      */
    @js.native
    object OrderAction extends js.Object {
      val CALL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.CALL with java.lang.String = js.native
      val CANCEL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.CANCEL with java.lang.String = js.native
      val CUSTOMER_SERVICE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.CUSTOMER_SERVICE with java.lang.String = js.native
      val EMAIL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.EMAIL with java.lang.String = js.native
      val EXCHANGE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.EXCHANGE with java.lang.String = js.native
      val MODIFY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.MODIFY with java.lang.String = js.native
      val REORDER: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.REORDER with java.lang.String = js.native
      val RETURN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.RETURN with java.lang.String = js.native
      val REVIEW: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.REVIEW with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.UNKNOWN with java.lang.String = js.native
      val VIEW_DETAILS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction.VIEW_DETAILS with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order location types.
      */
    @js.native
    object OrderLocationType extends js.Object {
      val BUSINESS: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.BUSINESS with java.lang.String = js.native
      val DELIVERY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.DELIVERY with java.lang.String = js.native
      val DESTINATION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.DESTINATION with java.lang.String = js.native
      val ORIGIN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.ORIGIN with java.lang.String = js.native
      val PICK_UP: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.PICK_UP with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order states.
      */
    @js.native
    object OrderState extends js.Object {
      val CANCELLED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.CANCELLED with java.lang.String = js.native
      val CONFIRMED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.CONFIRMED with java.lang.String = js.native
      val CREATED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.CREATED with java.lang.String = js.native
      val FULFILLED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.FULFILLED with java.lang.String = js.native
      val IN_TRANSIT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.IN_TRANSIT with java.lang.String = js.native
      val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.REJECTED with java.lang.String = js.native
      val RETURNED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState.RETURNED with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order state objects.
      */
    @js.native
    object OrderStateInfo extends js.Object {
      val CANCELLATION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.CANCELLATION with java.lang.String = js.native
      val FULFILLMENT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.FULFILLMENT with java.lang.String = js.native
      val IN_TRANSIT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.IN_TRANSIT with java.lang.String = js.native
      val RECEIPT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.RECEIPT with java.lang.String = js.native
      val REJECTION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.REJECTION with java.lang.String = js.native
      val RETURN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo.RETURN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible tokenization types for the payment method
      */
    @js.native
    object PaymentMethodTokenizationType extends js.Object {
      val DIRECT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.DIRECT with java.lang.String = js.native
      val PAYMENT_GATEWAY: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.PAYMENT_GATEWAY with java.lang.String = js.native
      val UNSPECIFIED_TOKENIZATION_TYPE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.UNSPECIFIED_TOKENIZATION_TYPE with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible item types.
      */
    @js.native
    object PaymentType extends js.Object {
      val BANK: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.BANK with java.lang.String = js.native
      val GIFT_CARD: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.GIFT_CARD with java.lang.String = js.native
      val LOYALTY_PROGRAM: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.LOYALTY_PROGRAM with java.lang.String = js.native
      val ON_FULFILLMENT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.ON_FULFILLMENT with java.lang.String = js.native
      val PAYMENT_CARD: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.PAYMENT_CARD with java.lang.String = js.native
      val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType.UNSPECIFIED with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of price types.
      */
    @js.native
    object PriceType extends js.Object {
      val ACTUAL: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType.ACTUAL with java.lang.String = js.native
      val ESTIMATE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType.ESTIMATE with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible types of order rejection.
      */
    @js.native
    object ReasonType extends js.Object {
      val PAYMENT_DECLINED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType.PAYMENT_DECLINED with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible types of order rejection.
      */
    @js.native
    object RejectionType extends js.Object {
      val PAYMENT_DECLINED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType.PAYMENT_DECLINED with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order transaction requirements check result types.
      */
    @js.native
    object ResultType extends js.Object {
      val ASSISTANT_SURFACE_NOT_SUPPORTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.ASSISTANT_SURFACE_NOT_SUPPORTED with java.lang.String = js.native
      val OK: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.OK with java.lang.String = js.native
      val REGION_NOT_SUPPORTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.REGION_NOT_SUPPORTED with java.lang.String = js.native
      val UNSPECIFIED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.UNSPECIFIED with java.lang.String = js.native
      val USER_ACTION_REQUIRED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType.USER_ACTION_REQUIRED with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order time types.
      */
    @js.native
    object TimeType extends js.Object {
      val DELIVERY_DATE: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.DELIVERY_DATE with java.lang.String = js.native
      val ETA: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.ETA with java.lang.String = js.native
      val RESERVATION_SLOT: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.RESERVATION_SLOT with java.lang.String = js.native
      val UNKNOWN: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType.UNKNOWN with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType with java.lang.String
          ] = js.native
    }
    
    /**
      * List of possible order confirmation user decisions
      */
    @js.native
    object TransactionUserDecision extends js.Object {
      val ACCEPTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.ACCEPTED with java.lang.String = js.native
      val CART_CHANGE_REQUESTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.CART_CHANGE_REQUESTED with java.lang.String = js.native
      val DELIVERY_ADDRESS_UPDATED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.DELIVERY_ADDRESS_UPDATED with java.lang.String = js.native
      val REJECTED: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.REJECTED with java.lang.String = js.native
      val UNKNOWN_USER_DECISION: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision.UNKNOWN_USER_DECISION with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision with java.lang.String
          ] = js.native
    }
    
  }
  
}

