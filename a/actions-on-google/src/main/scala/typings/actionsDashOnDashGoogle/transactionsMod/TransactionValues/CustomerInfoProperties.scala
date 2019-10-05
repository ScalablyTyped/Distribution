package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomerInfoProperties extends js.Object

/**
  * List of customer information properties that can be requested.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.CustomerInfoProperties")
@js.native
object CustomerInfoProperties extends js.Object {
  @js.native
  sealed trait CUSTOMER_INFO_PROPERTY_UNSPECIFIED extends CustomerInfoProperties
  
  @js.native
  sealed trait EMAIL extends CustomerInfoProperties
  
  /* 0 */ val CUSTOMER_INFO_PROPERTY_UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CustomerInfoProperties.CUSTOMER_INFO_PROPERTY_UNSPECIFIED with Double = js.native
  /* 1 */ val EMAIL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.CustomerInfoProperties.EMAIL with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CustomerInfoProperties with Double] = js.native
}

