package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/transactions", "TransactionValues")
@js.native
object TransactionValuesNs extends js.Object {
  @js.native
  sealed trait ActionType extends js.Object
  
  @js.native
  sealed trait CardNetwork extends js.Object
  
  @js.native
  sealed trait ConfirmationDecision extends js.Object
  
  @js.native
  sealed trait CustomerInfoProperties extends js.Object
  
  @js.native
  sealed trait DeliveryAddressDecision extends js.Object
  
  @js.native
  sealed trait DeliveryAddressUserDecision extends js.Object
  
  @js.native
  sealed trait ItemType extends js.Object
  
  @js.native
  sealed trait LineItemType extends js.Object
  
  @js.native
  sealed trait LocationType extends js.Object
  
  @js.native
  sealed trait OrderAction extends js.Object
  
  @js.native
  sealed trait OrderLocationType extends js.Object
  
  @js.native
  sealed trait OrderState extends js.Object
  
  @js.native
  sealed trait OrderStateInfo extends js.Object
  
  @js.native
  sealed trait PaymentMethodTokenizationType extends js.Object
  
  @js.native
  sealed trait PaymentType extends js.Object
  
  @js.native
  sealed trait PriceType extends js.Object
  
  @js.native
  sealed trait ReasonType extends js.Object
  
  @js.native
  sealed trait RejectionType extends js.Object
  
  @js.native
  sealed trait ResultType extends js.Object
  
  @js.native
  sealed trait TimeType extends js.Object
  
  @js.native
  sealed trait TransactionUserDecision extends js.Object
  
  /**
    * List of possible actions to take on the order.
    */
  @js.native
  object ActionType extends js.Object {
    /**
      * Call.
      */
    @js.native
    sealed trait CALL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Cancel order.
      */
    @js.native
    sealed trait CANCEL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Customer Service.
      */
    @js.native
    sealed trait CUSTOMER_SERVICE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Email.
      */
    @js.native
    sealed trait EMAIL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Exchange order.
      */
    @js.native
    sealed trait EXCHANGE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Modify order.
      */
    @js.native
    sealed trait MODIFY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Reorder.
      */
    @js.native
    sealed trait REORDER
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Return order.
      */
    @js.native
    sealed trait RETURN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Review.
      */
    @js.native
    sealed trait REVIEW
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * Unknown action.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /**
      * View details.
      */
    @js.native
    sealed trait VIEW_DETAILS
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ActionType
    
    /* 7 */ val CALL: CALL with scala.Double = js.native
    /* 3 */ val CANCEL: CANCEL with scala.Double = js.native
    /* 10 */ val CUSTOMER_SERVICE: CUSTOMER_SERVICE with scala.Double = js.native
    /* 6 */ val EMAIL: EMAIL with scala.Double = js.native
    /* 5 */ val EXCHANGE: EXCHANGE with scala.Double = js.native
    /* 2 */ val MODIFY: MODIFY with scala.Double = js.native
    /* 8 */ val REORDER: REORDER with scala.Double = js.native
    /* 4 */ val RETURN: RETURN with scala.Double = js.native
    /* 9 */ val REVIEW: REVIEW with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
    /* 1 */ val VIEW_DETAILS: VIEW_DETAILS with scala.Double = js.native
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
    /**
      * American Express.
      */
    @js.native
    sealed trait AMEX
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork
    
    /**
      * Discover.
      */
    @js.native
    sealed trait DISCOVER
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork
    
    /**
      * JCB.
      */
    @js.native
    sealed trait JCB
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork
    
    /**
      * Master Card.
      */
    @js.native
    sealed trait MASTERCARD
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork
    
    /**
      * Visa.
      */
    @js.native
    sealed trait VISA
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork
    
    /* 1 */ val AMEX: AMEX with scala.Double = js.native
    /* 2 */ val DISCOVER: DISCOVER with scala.Double = js.native
    /* 5 */ val JCB: JCB with scala.Double = js.native
    /* 3 */ val MASTERCARD: MASTERCARD with scala.Double = js.native
    /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
    /* 4 */ val VISA: VISA with scala.Double = js.native
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
    /**
      * Order was approved by user.
      */
    @js.native
    sealed trait ACCEPTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision
    
    /**
      * Order was not declined, but the cart was updated during confirmation.
      */
    @js.native
    sealed trait CART_CHANGE_REQUESTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision
    
    /**
      * Order was not declined, but the delivery address was updated during
      * confirmation.
      */
    @js.native
    sealed trait DELIVERY_ADDRESS_UPDATED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision
    
    /**
      * Order was declined by user.
      */
    @js.native
    sealed trait REJECTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision
    
    /**
      * Unspecified user decision.
      */
    @js.native
    sealed trait UNKNOWN_USER_DECISION
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ConfirmationDecision
    
    /* 1 */ val ACCEPTED: ACCEPTED with scala.Double = js.native
    /* 4 */ val CART_CHANGE_REQUESTED: CART_CHANGE_REQUESTED with scala.Double = js.native
    /* 3 */ val DELIVERY_ADDRESS_UPDATED: DELIVERY_ADDRESS_UPDATED with scala.Double = js.native
    /* 2 */ val REJECTED: REJECTED with scala.Double = js.native
    /* 0 */ val UNKNOWN_USER_DECISION: UNKNOWN_USER_DECISION with scala.Double = js.native
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
    @js.native
    sealed trait CUSTOMER_INFO_PROPERTY_UNSPECIFIED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties
    
    @js.native
    sealed trait EMAIL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CustomerInfoProperties
    
    /* 0 */ val CUSTOMER_INFO_PROPERTY_UNSPECIFIED: CUSTOMER_INFO_PROPERTY_UNSPECIFIED with scala.Double = js.native
    /* 1 */ val EMAIL: EMAIL with scala.Double = js.native
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
    /**
      * User granted delivery address.
      */
    @js.native
    sealed trait ACCEPTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision
    
    /**
      * User denied to give delivery address.
      */
    @js.native
    sealed trait REJECTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressDecision
    
    /* 1 */ val ACCEPTED: ACCEPTED with scala.Double = js.native
    /* 2 */ val REJECTED: REJECTED with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * User granted delivery address.
      */
    @js.native
    sealed trait ACCEPTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision
    
    /**
      * User denied to give delivery address.
      */
    @js.native
    sealed trait REJECTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision
    
    /* 1 */ val ACCEPTED: ACCEPTED with scala.Double = js.native
    /* 2 */ val REJECTED: REJECTED with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * Delivery
      */
    @js.native
    sealed trait DELIVERY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /**
      * Discount
      */
    @js.native
    sealed trait DISCOUNT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /**
      * Fee. For everything else, there's fee.
      */
    @js.native
    sealed trait FEE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /**
      * Gratuity
      */
    @js.native
    sealed trait GRATUITY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /**
      * Regular.
      */
    @js.native
    sealed trait REGULAR
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /**
      * Subtotal
      */
    @js.native
    sealed trait SUBTOTAL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /**
      * Tax.
      */
    @js.native
    sealed trait TAX
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ItemType
    
    /* 5 */ val DELIVERY: DELIVERY with scala.Double = js.native
    /* 3 */ val DISCOUNT: DISCOUNT with scala.Double = js.native
    /* 7 */ val FEE: FEE with scala.Double = js.native
    /* 4 */ val GRATUITY: GRATUITY with scala.Double = js.native
    /* 1 */ val REGULAR: REGULAR with scala.Double = js.native
    /* 6 */ val SUBTOTAL: SUBTOTAL with scala.Double = js.native
    /* 2 */ val TAX: TAX with scala.Double = js.native
    /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
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
    /**
      * Delivery
      */
    @js.native
    sealed trait DELIVERY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /**
      * Discount
      */
    @js.native
    sealed trait DISCOUNT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /**
      * Fee. For everything else, there's fee.
      */
    @js.native
    sealed trait FEE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /**
      * Gratuity
      */
    @js.native
    sealed trait GRATUITY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /**
      * Regular.
      */
    @js.native
    sealed trait REGULAR
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /**
      * Subtotal
      */
    @js.native
    sealed trait SUBTOTAL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /**
      * Tax.
      */
    @js.native
    sealed trait TAX
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LineItemType
    
    /* 5 */ val DELIVERY: DELIVERY with scala.Double = js.native
    /* 3 */ val DISCOUNT: DISCOUNT with scala.Double = js.native
    /* 7 */ val FEE: FEE with scala.Double = js.native
    /* 4 */ val GRATUITY: GRATUITY with scala.Double = js.native
    /* 1 */ val REGULAR: REGULAR with scala.Double = js.native
    /* 6 */ val SUBTOTAL: SUBTOTAL with scala.Double = js.native
    /* 2 */ val TAX: TAX with scala.Double = js.native
    /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
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
    /**
      * Business location of order provider.
      */
    @js.native
    sealed trait BUSINESS
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType
    
    /**
      * Delivery location for an order.
      */
    @js.native
    sealed trait DELIVERY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType
    
    /**
      * Destination of the order.
      */
    @js.native
    sealed trait DESTINATION
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType
    
    /**
      * Origin of the order.
      */
    @js.native
    sealed trait ORIGIN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType
    
    /**
      * Pick up location of the order.
      */
    @js.native
    sealed trait PICK_UP
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.LocationType
    
    /* 2 */ val BUSINESS: BUSINESS with scala.Double = js.native
    /* 1 */ val DELIVERY: DELIVERY with scala.Double = js.native
    /* 4 */ val DESTINATION: DESTINATION with scala.Double = js.native
    /* 3 */ val ORIGIN: ORIGIN with scala.Double = js.native
    /* 5 */ val PICK_UP: PICK_UP with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * Call.
      */
    @js.native
    sealed trait CALL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Cancel order.
      */
    @js.native
    sealed trait CANCEL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Customer Service.
      */
    @js.native
    sealed trait CUSTOMER_SERVICE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Email.
      */
    @js.native
    sealed trait EMAIL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Exchange order.
      */
    @js.native
    sealed trait EXCHANGE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Modify order.
      */
    @js.native
    sealed trait MODIFY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Reorder.
      */
    @js.native
    sealed trait REORDER
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Return order.
      */
    @js.native
    sealed trait RETURN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Review.
      */
    @js.native
    sealed trait REVIEW
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * Unknown action.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /**
      * View details.
      */
    @js.native
    sealed trait VIEW_DETAILS
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderAction
    
    /* 7 */ val CALL: CALL with scala.Double = js.native
    /* 3 */ val CANCEL: CANCEL with scala.Double = js.native
    /* 10 */ val CUSTOMER_SERVICE: CUSTOMER_SERVICE with scala.Double = js.native
    /* 6 */ val EMAIL: EMAIL with scala.Double = js.native
    /* 5 */ val EXCHANGE: EXCHANGE with scala.Double = js.native
    /* 2 */ val MODIFY: MODIFY with scala.Double = js.native
    /* 8 */ val REORDER: REORDER with scala.Double = js.native
    /* 4 */ val RETURN: RETURN with scala.Double = js.native
    /* 9 */ val REVIEW: REVIEW with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
    /* 1 */ val VIEW_DETAILS: VIEW_DETAILS with scala.Double = js.native
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
    /**
      * Business location of order provider.
      */
    @js.native
    sealed trait BUSINESS
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType
    
    /**
      * Delivery location for an order.
      */
    @js.native
    sealed trait DELIVERY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType
    
    /**
      * Destination of the order.
      */
    @js.native
    sealed trait DESTINATION
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType
    
    /**
      * Origin of the order.
      */
    @js.native
    sealed trait ORIGIN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType
    
    /**
      * Pick up location of the order.
      */
    @js.native
    sealed trait PICK_UP
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderLocationType
    
    /* 2 */ val BUSINESS: BUSINESS with scala.Double = js.native
    /* 1 */ val DELIVERY: DELIVERY with scala.Double = js.native
    /* 4 */ val DESTINATION: DESTINATION with scala.Double = js.native
    /* 3 */ val ORIGIN: ORIGIN with scala.Double = js.native
    /* 5 */ val PICK_UP: PICK_UP with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * User cancelled the order.
      */
    @js.native
    sealed trait CANCELLED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState
    
    /**
      * Order was confirmed by integrator and is active.
      */
    @js.native
    sealed trait CONFIRMED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState
    
    /**
      * Order was created at the integrator's system.
      */
    @js.native
    sealed trait CREATED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState
    
    /**
      * User received what was ordered.
      */
    @js.native
    sealed trait FULFILLED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState
    
    /**
      * Order is being delivered.
      */
    @js.native
    sealed trait IN_TRANSIT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState
    
    /**
      * Order was rejected.
      */
    @js.native
    sealed trait REJECTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState
    
    /**
      * User performed a return.
      */
    @js.native
    sealed trait RETURNED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderState
    
    /* 3 */ val CANCELLED: CANCELLED with scala.Double = js.native
    /* 2 */ val CONFIRMED: CONFIRMED with scala.Double = js.native
    /* 0 */ val CREATED: CREATED with scala.Double = js.native
    /* 6 */ val FULFILLED: FULFILLED with scala.Double = js.native
    /* 4 */ val IN_TRANSIT: IN_TRANSIT with scala.Double = js.native
    /* 1 */ val REJECTED: REJECTED with scala.Double = js.native
    /* 5 */ val RETURNED: RETURNED with scala.Double = js.native
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
    /**
      * Information about order cancellation. Used with {@link CancellationInfo}.
      */
    @js.native
    sealed trait CANCELLATION
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo
    
    /**
      * Information about order fulfillment. Used with {@link FulfillmentInfo}.
      */
    @js.native
    sealed trait FULFILLMENT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo
    
    /**
      * Information about in-transit order. Used with {@link TransitInfo}.
      */
    @js.native
    sealed trait IN_TRANSIT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo
    
    /**
      * Information about order receipt. Used with {@link ReceiptInfo}.
      */
    @js.native
    sealed trait RECEIPT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo
    
    /**
      * Information about order rejection. Used with {@link RejectionInfo}.
      */
    @js.native
    sealed trait REJECTION
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo
    
    /**
      * Information about order return. Used with {@link ReturnInfo}.
      */
    @js.native
    sealed trait RETURN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.OrderStateInfo
    
    /* 2 */ val CANCELLATION: CANCELLATION with scala.Double = js.native
    /* 4 */ val FULFILLMENT: FULFILLMENT with scala.Double = js.native
    /* 3 */ val IN_TRANSIT: IN_TRANSIT with scala.Double = js.native
    /* 1 */ val RECEIPT: RECEIPT with scala.Double = js.native
    /* 0 */ val REJECTION: REJECTION with scala.Double = js.native
    /* 5 */ val RETURN: RETURN with scala.Double = js.native
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
    /**
      * Allows payment service to pass public key for payment info encryption and receive encrypted
      * response.
      */
    @js.native
    sealed trait DIRECT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType
    
    /**
      * Use external payment gateway tokenization API to tokenize selected payment method.
      */
    @js.native
    sealed trait PAYMENT_GATEWAY
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType
    
    /**
      * Unspecified tokenization type.
      */
    @js.native
    sealed trait UNSPECIFIED_TOKENIZATION_TYPE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType
    
    /* 2 */ val DIRECT: DIRECT with scala.Double = js.native
    /* 1 */ val PAYMENT_GATEWAY: PAYMENT_GATEWAY with scala.Double = js.native
    /* 0 */ val UNSPECIFIED_TOKENIZATION_TYPE: UNSPECIFIED_TOKENIZATION_TYPE with scala.Double = js.native
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
    /**
      * Bank.
      */
    @js.native
    sealed trait BANK
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType
    
    /**
      * Gift card.
      */
    @js.native
    sealed trait GIFT_CARD
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType
    
    /**
      * Loyalty program.
      */
    @js.native
    sealed trait LOYALTY_PROGRAM
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType
    
    /**
      * On order fulfillment, such as cash on delivery.
      */
    @js.native
    sealed trait ON_FULFILLMENT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType
    
    /**
      * Payment card.
      */
    @js.native
    sealed trait PAYMENT_CARD
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType
    
    /* 2 */ val BANK: BANK with scala.Double = js.native
    /* 5 */ val GIFT_CARD: GIFT_CARD with scala.Double = js.native
    /* 3 */ val LOYALTY_PROGRAM: LOYALTY_PROGRAM with scala.Double = js.native
    /* 4 */ val ON_FULFILLMENT: ON_FULFILLMENT with scala.Double = js.native
    /* 1 */ val PAYMENT_CARD: PAYMENT_CARD with scala.Double = js.native
    /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
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
    /**
      * Actual.
      */
    @js.native
    sealed trait ACTUAL
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType
    
    /**
      * Estimate.
      */
    @js.native
    sealed trait ESTIMATE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PriceType
    
    /* 2 */ val ACTUAL: ACTUAL with scala.Double = js.native
    /* 1 */ val ESTIMATE: ESTIMATE with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * Payment was declined.
      */
    @js.native
    sealed trait PAYMENT_DECLINED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType
    
    /**
      * Unknown
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType
    
    /* 1 */ val PAYMENT_DECLINED: PAYMENT_DECLINED with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * Payment was declined.
      */
    @js.native
    sealed trait PAYMENT_DECLINED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType
    
    /**
      * Unknown
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.RejectionType
    
    /* 1 */ val PAYMENT_DECLINED: PAYMENT_DECLINED with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * Transactions are not supported on current device/surface.
      */
    @js.native
    sealed trait ASSISTANT_SURFACE_NOT_SUPPORTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType
    
    /**
      * OK to continue transaction.
      */
    @js.native
    sealed trait OK
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType
    
    /**
      * Transactions are not supported for current region/country.
      */
    @js.native
    sealed trait REGION_NOT_SUPPORTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType
    
    /**
      * User is expected to take action, e.g. enable payments, to continue
      * transaction.
      */
    @js.native
    sealed trait USER_ACTION_REQUIRED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ResultType
    
    /* 3 */ val ASSISTANT_SURFACE_NOT_SUPPORTED: ASSISTANT_SURFACE_NOT_SUPPORTED with scala.Double = js.native
    /* 1 */ val OK: OK with scala.Double = js.native
    /* 4 */ val REGION_NOT_SUPPORTED: REGION_NOT_SUPPORTED with scala.Double = js.native
    /* 0 */ val UNSPECIFIED: UNSPECIFIED with scala.Double = js.native
    /* 2 */ val USER_ACTION_REQUIRED: USER_ACTION_REQUIRED with scala.Double = js.native
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
    /**
      * Date of delivery for the order.
      */
    @js.native
    sealed trait DELIVERY_DATE
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType
    
    /**
      * Estimated Time of Arrival for order.
      */
    @js.native
    sealed trait ETA
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType
    
    /**
      * Reservation time.
      */
    @js.native
    sealed trait RESERVATION_SLOT
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TimeType
    
    /* 1 */ val DELIVERY_DATE: DELIVERY_DATE with scala.Double = js.native
    /* 2 */ val ETA: ETA with scala.Double = js.native
    /* 3 */ val RESERVATION_SLOT: RESERVATION_SLOT with scala.Double = js.native
    /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
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
    /**
      * Order was approved by user.
      */
    @js.native
    sealed trait ACCEPTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
    
    /**
      * Order was not declined, but the cart was updated during confirmation.
      */
    @js.native
    sealed trait CART_CHANGE_REQUESTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
    
    /**
      * Order was not declined, but the delivery address was updated during
      * confirmation.
      */
    @js.native
    sealed trait DELIVERY_ADDRESS_UPDATED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
    
    /**
      * Order was declined by user.
      */
    @js.native
    sealed trait REJECTED
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
    
    /**
      * Unspecified user decision.
      */
    @js.native
    sealed trait UNKNOWN_USER_DECISION
      extends actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
    
    /* 1 */ val ACCEPTED: ACCEPTED with scala.Double = js.native
    /* 4 */ val CART_CHANGE_REQUESTED: CART_CHANGE_REQUESTED with scala.Double = js.native
    /* 3 */ val DELIVERY_ADDRESS_UPDATED: DELIVERY_ADDRESS_UPDATED with scala.Double = js.native
    /* 2 */ val REJECTED: REJECTED with scala.Double = js.native
    /* 0 */ val UNKNOWN_USER_DECISION: UNKNOWN_USER_DECISION with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision with scala.Double
      ] = js.native
  }
  
}

