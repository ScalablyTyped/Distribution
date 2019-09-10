package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLedgerRequest extends js.Object {
  /**
    * The name of the ledger that you want to describe.
    */
  var Name: LedgerName
}

object DescribeLedgerRequest {
  @scala.inline
  def apply(Name: LedgerName): DescribeLedgerRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DescribeLedgerRequest]
  }
}

