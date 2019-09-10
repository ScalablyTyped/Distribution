package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchPageRequest extends js.Object {
  /**
    * Specifies the next page token of the page to be fetched.
    */
  var NextPageToken: PageToken
  /**
    * Specifies the transaction id of the page to be fetched.
    */
  var TransactionId: typings.awsDashSdk.clientsQldbsessionMod.TransactionId
}

object FetchPageRequest {
  @scala.inline
  def apply(NextPageToken: PageToken, TransactionId: TransactionId): FetchPageRequest = {
    val __obj = js.Dynamic.literal(NextPageToken = NextPageToken, TransactionId = TransactionId)
  
    __obj.asInstanceOf[FetchPageRequest]
  }
}

