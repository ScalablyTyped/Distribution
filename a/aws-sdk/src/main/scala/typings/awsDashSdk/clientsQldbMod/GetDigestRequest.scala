package typings.awsDashSdk.clientsQldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDigestRequest extends js.Object {
  /**
    * The name of the ledger.
    */
  var Name: LedgerName = js.native
}

object GetDigestRequest {
  @scala.inline
  def apply(Name: LedgerName): GetDigestRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDigestRequest]
  }
}

