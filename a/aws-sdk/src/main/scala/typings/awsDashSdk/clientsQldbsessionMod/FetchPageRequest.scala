package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPageRequest extends js.Object {
  /**
    * Specifies the next page token of the page to be fetched.
    */
  var NextPageToken: PageToken = js.native
  /**
    * Specifies the transaction id of the page to be fetched.
    */
  var TransactionId: typings.awsDashSdk.clientsQldbsessionMod.TransactionId = js.native
}

object FetchPageRequest {
  @scala.inline
  def apply(NextPageToken: PageToken, TransactionId: TransactionId): FetchPageRequest = {
    val __obj = js.Dynamic.literal(NextPageToken = NextPageToken.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FetchPageRequest]
  }
}

