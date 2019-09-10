package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLedgerRequest extends js.Object {
  /**
    * The name of the ledger that you want to delete.
    */
  var Name: LedgerName
}

object DeleteLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName): DeleteLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteLedgerRequest]
  }
}

