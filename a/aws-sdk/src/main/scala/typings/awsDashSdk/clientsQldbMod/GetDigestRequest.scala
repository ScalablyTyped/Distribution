package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDigestRequest extends js.Object {
  /**
    * The name of the ledger.
    */
  var Name: LedgerName
}

object GetDigestRequest {
  @scala.inline
  def apply(Name: LedgerName): GetDigestRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[GetDigestRequest]
  }
}

