package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResultType extends js.Object

/**
  * List of possible order transaction requirements check result types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.ResultType")
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
  
  /* 3 */ val ASSISTANT_SURFACE_NOT_SUPPORTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ResultType.ASSISTANT_SURFACE_NOT_SUPPORTED with Double = js.native
  /* 1 */ val OK: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ResultType.OK with Double = js.native
  /* 4 */ val REGION_NOT_SUPPORTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ResultType.REGION_NOT_SUPPORTED with Double = js.native
  /* 0 */ val UNSPECIFIED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ResultType.UNSPECIFIED with Double = js.native
  /* 2 */ val USER_ACTION_REQUIRED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ResultType.USER_ACTION_REQUIRED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ResultType with Double] = js.native
}

