package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePartnerEventSourceRequest extends js.Object {
  /**
    * The AWS account ID of the AWS customer that the event source was created for.
    */
  var Account: AccountId = js.native
  /**
    * The name of the event source to delete.
    */
  var Name: EventSourceName = js.native
}

object DeletePartnerEventSourceRequest {
  @scala.inline
  def apply(Account: AccountId, Name: EventSourceName): DeletePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePartnerEventSourceRequest]
  }
}

