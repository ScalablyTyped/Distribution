package typings.actionsDashOnDashGoogle.transactionsMod

import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ActionType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CustomerInfoProperties
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderAction
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ReasonType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.RejectionType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision
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
    sealed trait CALL extends ActionType
    
    /**
      * Cancel order.
      */
    @js.native
    sealed trait CANCEL extends ActionType
    
    /**
      * Customer Service.
      */
    @js.native
    sealed trait CUSTOMER_SERVICE extends ActionType
    
    /**
      * Email.
      */
    @js.native
    sealed trait EMAIL extends ActionType
    
    /**
      * Exchange order.
      */
    @js.native
    sealed trait EXCHANGE extends ActionType
    
    /**
      * Modify order.
      */
    @js.native
    sealed trait MODIFY extends ActionType
    
    /**
      * Reorder.
      */
    @js.native
    sealed trait REORDER extends ActionType
    
    /**
      * Return order.
      */
    @js.native
    sealed trait RETURN extends ActionType
    
    /**
      * Review.
      */
    @js.native
    sealed trait REVIEW extends ActionType
    
    /**
      * Unknown action.
      */
    @js.native
    sealed trait UNKNOWN extends ActionType
    
    /**
      * View details.
      */
    @js.native
    sealed trait VIEW_DETAILS extends ActionType
    
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
    def apply(value: Double): js.UndefOr[ActionType with Double] = js.native
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
    sealed trait AMEX extends CardNetwork
    
    /**
      * Discover.
      */
    @js.native
    sealed trait DISCOVER extends CardNetwork
    
    /**
      * JCB.
      */
    @js.native
    sealed trait JCB extends CardNetwork
    
    /**
      * Master Card.
      */
    @js.native
    sealed trait MASTERCARD extends CardNetwork
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED extends CardNetwork
    
    /**
      * Visa.
      */
    @js.native
    sealed trait VISA extends CardNetwork
    
    /* 1 */ val AMEX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.AMEX with Double = js.native
    /* 2 */ val DISCOVER: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.DISCOVER with Double = js.native
    /* 5 */ val JCB: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.JCB with Double = js.native
    /* 3 */ val MASTERCARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.MASTERCARD with Double = js.native
    /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.UNSPECIFIED with Double = js.native
    /* 4 */ val VISA: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CardNetwork.VISA with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CardNetwork with Double] = js.native
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
    sealed trait ACCEPTED extends ConfirmationDecision
    
    /**
      * Order was not declined, but the cart was updated during confirmation.
      */
    @js.native
    sealed trait CART_CHANGE_REQUESTED extends ConfirmationDecision
    
    /**
      * Order was not declined, but the delivery address was updated during
      * confirmation.
      */
    @js.native
    sealed trait DELIVERY_ADDRESS_UPDATED extends ConfirmationDecision
    
    /**
      * Order was declined by user.
      */
    @js.native
    sealed trait REJECTED extends ConfirmationDecision
    
    /**
      * Unspecified user decision.
      */
    @js.native
    sealed trait UNKNOWN_USER_DECISION extends ConfirmationDecision
    
    /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.ACCEPTED with Double = js.native
    /* 4 */ val CART_CHANGE_REQUESTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.CART_CHANGE_REQUESTED with Double = js.native
    /* 3 */ val DELIVERY_ADDRESS_UPDATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.DELIVERY_ADDRESS_UPDATED with Double = js.native
    /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.REJECTED with Double = js.native
    /* 0 */ val UNKNOWN_USER_DECISION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ConfirmationDecision.UNKNOWN_USER_DECISION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ConfirmationDecision with Double] = js.native
  }
  
  /**
    * List of customer information properties that can be requested.
    */
  @js.native
  object CustomerInfoProperties extends js.Object {
    @js.native
    sealed trait CUSTOMER_INFO_PROPERTY_UNSPECIFIED extends CustomerInfoProperties
    
    @js.native
    sealed trait EMAIL extends CustomerInfoProperties
    
    /* 0 */ val CUSTOMER_INFO_PROPERTY_UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CustomerInfoProperties.CUSTOMER_INFO_PROPERTY_UNSPECIFIED with Double = js.native
    /* 1 */ val EMAIL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.CustomerInfoProperties.EMAIL with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CustomerInfoProperties with Double] = js.native
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
    sealed trait ACCEPTED extends DeliveryAddressDecision
    
    /**
      * User denied to give delivery address.
      */
    @js.native
    sealed trait REJECTED extends DeliveryAddressDecision
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN extends DeliveryAddressDecision
    
    /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.ACCEPTED with Double = js.native
    /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.REJECTED with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressDecision.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeliveryAddressDecision with Double] = js.native
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
    sealed trait ACCEPTED extends DeliveryAddressUserDecision
    
    /**
      * User denied to give delivery address.
      */
    @js.native
    sealed trait REJECTED extends DeliveryAddressUserDecision
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN extends DeliveryAddressUserDecision
    
    /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.ACCEPTED with Double = js.native
    /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.REJECTED with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.DeliveryAddressUserDecision.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeliveryAddressUserDecision with Double] = js.native
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
    sealed trait DELIVERY extends ItemType
    
    /**
      * Discount
      */
    @js.native
    sealed trait DISCOUNT extends ItemType
    
    /**
      * Fee. For everything else, there's fee.
      */
    @js.native
    sealed trait FEE extends ItemType
    
    /**
      * Gratuity
      */
    @js.native
    sealed trait GRATUITY extends ItemType
    
    /**
      * Regular.
      */
    @js.native
    sealed trait REGULAR extends ItemType
    
    /**
      * Subtotal
      */
    @js.native
    sealed trait SUBTOTAL extends ItemType
    
    /**
      * Tax.
      */
    @js.native
    sealed trait TAX extends ItemType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED extends ItemType
    
    /* 5 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.DELIVERY with Double = js.native
    /* 3 */ val DISCOUNT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.DISCOUNT with Double = js.native
    /* 7 */ val FEE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.FEE with Double = js.native
    /* 4 */ val GRATUITY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.GRATUITY with Double = js.native
    /* 1 */ val REGULAR: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.REGULAR with Double = js.native
    /* 6 */ val SUBTOTAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.SUBTOTAL with Double = js.native
    /* 2 */ val TAX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.TAX with Double = js.native
    /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ItemType.UNSPECIFIED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ItemType with Double] = js.native
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
    sealed trait DELIVERY extends LineItemType
    
    /**
      * Discount
      */
    @js.native
    sealed trait DISCOUNT extends LineItemType
    
    /**
      * Fee. For everything else, there's fee.
      */
    @js.native
    sealed trait FEE extends LineItemType
    
    /**
      * Gratuity
      */
    @js.native
    sealed trait GRATUITY extends LineItemType
    
    /**
      * Regular.
      */
    @js.native
    sealed trait REGULAR extends LineItemType
    
    /**
      * Subtotal
      */
    @js.native
    sealed trait SUBTOTAL extends LineItemType
    
    /**
      * Tax.
      */
    @js.native
    sealed trait TAX extends LineItemType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED extends LineItemType
    
    /* 5 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.DELIVERY with Double = js.native
    /* 3 */ val DISCOUNT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.DISCOUNT with Double = js.native
    /* 7 */ val FEE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.FEE with Double = js.native
    /* 4 */ val GRATUITY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.GRATUITY with Double = js.native
    /* 1 */ val REGULAR: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.REGULAR with Double = js.native
    /* 6 */ val SUBTOTAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.SUBTOTAL with Double = js.native
    /* 2 */ val TAX: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.TAX with Double = js.native
    /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LineItemType.UNSPECIFIED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LineItemType with Double] = js.native
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
    sealed trait BUSINESS extends LocationType
    
    /**
      * Delivery location for an order.
      */
    @js.native
    sealed trait DELIVERY extends LocationType
    
    /**
      * Destination of the order.
      */
    @js.native
    sealed trait DESTINATION extends LocationType
    
    /**
      * Origin of the order.
      */
    @js.native
    sealed trait ORIGIN extends LocationType
    
    /**
      * Pick up location of the order.
      */
    @js.native
    sealed trait PICK_UP extends LocationType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN extends LocationType
    
    /* 2 */ val BUSINESS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.BUSINESS with Double = js.native
    /* 1 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.DELIVERY with Double = js.native
    /* 4 */ val DESTINATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.DESTINATION with Double = js.native
    /* 3 */ val ORIGIN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.ORIGIN with Double = js.native
    /* 5 */ val PICK_UP: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.PICK_UP with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.LocationType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LocationType with Double] = js.native
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
    sealed trait CALL extends OrderAction
    
    /**
      * Cancel order.
      */
    @js.native
    sealed trait CANCEL extends OrderAction
    
    /**
      * Customer Service.
      */
    @js.native
    sealed trait CUSTOMER_SERVICE extends OrderAction
    
    /**
      * Email.
      */
    @js.native
    sealed trait EMAIL extends OrderAction
    
    /**
      * Exchange order.
      */
    @js.native
    sealed trait EXCHANGE extends OrderAction
    
    /**
      * Modify order.
      */
    @js.native
    sealed trait MODIFY extends OrderAction
    
    /**
      * Reorder.
      */
    @js.native
    sealed trait REORDER extends OrderAction
    
    /**
      * Return order.
      */
    @js.native
    sealed trait RETURN extends OrderAction
    
    /**
      * Review.
      */
    @js.native
    sealed trait REVIEW extends OrderAction
    
    /**
      * Unknown action.
      */
    @js.native
    sealed trait UNKNOWN extends OrderAction
    
    /**
      * View details.
      */
    @js.native
    sealed trait VIEW_DETAILS extends OrderAction
    
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
    def apply(value: Double): js.UndefOr[OrderAction with Double] = js.native
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
    sealed trait BUSINESS extends OrderLocationType
    
    /**
      * Delivery location for an order.
      */
    @js.native
    sealed trait DELIVERY extends OrderLocationType
    
    /**
      * Destination of the order.
      */
    @js.native
    sealed trait DESTINATION extends OrderLocationType
    
    /**
      * Origin of the order.
      */
    @js.native
    sealed trait ORIGIN extends OrderLocationType
    
    /**
      * Pick up location of the order.
      */
    @js.native
    sealed trait PICK_UP extends OrderLocationType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN extends OrderLocationType
    
    /* 2 */ val BUSINESS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.BUSINESS with Double = js.native
    /* 1 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.DELIVERY with Double = js.native
    /* 4 */ val DESTINATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.DESTINATION with Double = js.native
    /* 3 */ val ORIGIN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.ORIGIN with Double = js.native
    /* 5 */ val PICK_UP: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.PICK_UP with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderLocationType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OrderLocationType with Double] = js.native
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
    sealed trait CANCELLED extends OrderState
    
    /**
      * Order was confirmed by integrator and is active.
      */
    @js.native
    sealed trait CONFIRMED extends OrderState
    
    /**
      * Order was created at the integrator's system.
      */
    @js.native
    sealed trait CREATED extends OrderState
    
    /**
      * User received what was ordered.
      */
    @js.native
    sealed trait FULFILLED extends OrderState
    
    /**
      * Order is being delivered.
      */
    @js.native
    sealed trait IN_TRANSIT extends OrderState
    
    /**
      * Order was rejected.
      */
    @js.native
    sealed trait REJECTED extends OrderState
    
    /**
      * User performed a return.
      */
    @js.native
    sealed trait RETURNED extends OrderState
    
    /* 3 */ val CANCELLED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.CANCELLED with Double = js.native
    /* 2 */ val CONFIRMED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.CONFIRMED with Double = js.native
    /* 0 */ val CREATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.CREATED with Double = js.native
    /* 6 */ val FULFILLED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.FULFILLED with Double = js.native
    /* 4 */ val IN_TRANSIT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.IN_TRANSIT with Double = js.native
    /* 1 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.REJECTED with Double = js.native
    /* 5 */ val RETURNED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderState.RETURNED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OrderState with Double] = js.native
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
    sealed trait CANCELLATION extends OrderStateInfo
    
    /**
      * Information about order fulfillment. Used with {@link FulfillmentInfo}.
      */
    @js.native
    sealed trait FULFILLMENT extends OrderStateInfo
    
    /**
      * Information about in-transit order. Used with {@link TransitInfo}.
      */
    @js.native
    sealed trait IN_TRANSIT extends OrderStateInfo
    
    /**
      * Information about order receipt. Used with {@link ReceiptInfo}.
      */
    @js.native
    sealed trait RECEIPT extends OrderStateInfo
    
    /**
      * Information about order rejection. Used with {@link RejectionInfo}.
      */
    @js.native
    sealed trait REJECTION extends OrderStateInfo
    
    /**
      * Information about order return. Used with {@link ReturnInfo}.
      */
    @js.native
    sealed trait RETURN extends OrderStateInfo
    
    /* 2 */ val CANCELLATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.CANCELLATION with Double = js.native
    /* 4 */ val FULFILLMENT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.FULFILLMENT with Double = js.native
    /* 3 */ val IN_TRANSIT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.IN_TRANSIT with Double = js.native
    /* 1 */ val RECEIPT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.RECEIPT with Double = js.native
    /* 0 */ val REJECTION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.REJECTION with Double = js.native
    /* 5 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.OrderStateInfo.RETURN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OrderStateInfo with Double] = js.native
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
    sealed trait DIRECT extends PaymentMethodTokenizationType
    
    /**
      * Use external payment gateway tokenization API to tokenize selected payment method.
      */
    @js.native
    sealed trait PAYMENT_GATEWAY extends PaymentMethodTokenizationType
    
    /**
      * Unspecified tokenization type.
      */
    @js.native
    sealed trait UNSPECIFIED_TOKENIZATION_TYPE extends PaymentMethodTokenizationType
    
    /* 2 */ val DIRECT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.DIRECT with Double = js.native
    /* 1 */ val PAYMENT_GATEWAY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.PAYMENT_GATEWAY with Double = js.native
    /* 0 */ val UNSPECIFIED_TOKENIZATION_TYPE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentMethodTokenizationType.UNSPECIFIED_TOKENIZATION_TYPE with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PaymentMethodTokenizationType with Double] = js.native
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
    sealed trait BANK extends PaymentType
    
    /**
      * Gift card.
      */
    @js.native
    sealed trait GIFT_CARD extends PaymentType
    
    /**
      * Loyalty program.
      */
    @js.native
    sealed trait LOYALTY_PROGRAM extends PaymentType
    
    /**
      * On order fulfillment, such as cash on delivery.
      */
    @js.native
    sealed trait ON_FULFILLMENT extends PaymentType
    
    /**
      * Payment card.
      */
    @js.native
    sealed trait PAYMENT_CARD extends PaymentType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED extends PaymentType
    
    /* 2 */ val BANK: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.BANK with Double = js.native
    /* 5 */ val GIFT_CARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.GIFT_CARD with Double = js.native
    /* 3 */ val LOYALTY_PROGRAM: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.LOYALTY_PROGRAM with Double = js.native
    /* 4 */ val ON_FULFILLMENT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.ON_FULFILLMENT with Double = js.native
    /* 1 */ val PAYMENT_CARD: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.PAYMENT_CARD with Double = js.native
    /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType.UNSPECIFIED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PaymentType with Double] = js.native
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
    sealed trait ACTUAL extends PriceType
    
    /**
      * Estimate.
      */
    @js.native
    sealed trait ESTIMATE extends PriceType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN extends PriceType
    
    /* 2 */ val ACTUAL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType.ACTUAL with Double = js.native
    /* 1 */ val ESTIMATE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType.ESTIMATE with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PriceType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[PriceType with Double] = js.native
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
    sealed trait PAYMENT_DECLINED extends ReasonType
    
    /**
      * Unknown
      */
    @js.native
    sealed trait UNKNOWN extends ReasonType
    
    /* 1 */ val PAYMENT_DECLINED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ReasonType.PAYMENT_DECLINED with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ReasonType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ReasonType with Double] = js.native
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
    sealed trait PAYMENT_DECLINED extends RejectionType
    
    /**
      * Unknown
      */
    @js.native
    sealed trait UNKNOWN extends RejectionType
    
    /* 1 */ val PAYMENT_DECLINED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.RejectionType.PAYMENT_DECLINED with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.RejectionType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[RejectionType with Double] = js.native
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
    sealed trait ASSISTANT_SURFACE_NOT_SUPPORTED extends ResultType
    
    /**
      * OK to continue transaction.
      */
    @js.native
    sealed trait OK extends ResultType
    
    /**
      * Transactions are not supported for current region/country.
      */
    @js.native
    sealed trait REGION_NOT_SUPPORTED extends ResultType
    
    /**
      * Unspecified.
      */
    @js.native
    sealed trait UNSPECIFIED extends ResultType
    
    /**
      * User is expected to take action, e.g. enable payments, to continue
      * transaction.
      */
    @js.native
    sealed trait USER_ACTION_REQUIRED extends ResultType
    
    /* 3 */ val ASSISTANT_SURFACE_NOT_SUPPORTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.ASSISTANT_SURFACE_NOT_SUPPORTED with Double = js.native
    /* 1 */ val OK: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.OK with Double = js.native
    /* 4 */ val REGION_NOT_SUPPORTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.REGION_NOT_SUPPORTED with Double = js.native
    /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.UNSPECIFIED with Double = js.native
    /* 2 */ val USER_ACTION_REQUIRED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ResultType.USER_ACTION_REQUIRED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ResultType with Double] = js.native
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
    sealed trait DELIVERY_DATE extends TimeType
    
    /**
      * Estimated Time of Arrival for order.
      */
    @js.native
    sealed trait ETA extends TimeType
    
    /**
      * Reservation time.
      */
    @js.native
    sealed trait RESERVATION_SLOT extends TimeType
    
    /**
      * Unknown.
      */
    @js.native
    sealed trait UNKNOWN extends TimeType
    
    /* 1 */ val DELIVERY_DATE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.DELIVERY_DATE with Double = js.native
    /* 2 */ val ETA: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.ETA with Double = js.native
    /* 3 */ val RESERVATION_SLOT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.RESERVATION_SLOT with Double = js.native
    /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TimeType.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TimeType with Double] = js.native
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
    sealed trait ACCEPTED extends TransactionUserDecision
    
    /**
      * Order was not declined, but the cart was updated during confirmation.
      */
    @js.native
    sealed trait CART_CHANGE_REQUESTED extends TransactionUserDecision
    
    /**
      * Order was not declined, but the delivery address was updated during
      * confirmation.
      */
    @js.native
    sealed trait DELIVERY_ADDRESS_UPDATED extends TransactionUserDecision
    
    /**
      * Order was declined by user.
      */
    @js.native
    sealed trait REJECTED extends TransactionUserDecision
    
    /**
      * Unspecified user decision.
      */
    @js.native
    sealed trait UNKNOWN_USER_DECISION extends TransactionUserDecision
    
    /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.ACCEPTED with Double = js.native
    /* 4 */ val CART_CHANGE_REQUESTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.CART_CHANGE_REQUESTED with Double = js.native
    /* 3 */ val DELIVERY_ADDRESS_UPDATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.DELIVERY_ADDRESS_UPDATED with Double = js.native
    /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.REJECTED with Double = js.native
    /* 0 */ val UNKNOWN_USER_DECISION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision.UNKNOWN_USER_DECISION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TransactionUserDecision with Double] = js.native
  }
  
}

