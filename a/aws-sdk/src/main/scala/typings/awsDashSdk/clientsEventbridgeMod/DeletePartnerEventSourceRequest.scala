package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePartnerEventSourceRequest extends js.Object {
  /**
    * The AWS account ID of the AWS customer that the event source was created for.
    */
  var Account: AccountId
  /**
    * The name of the event source to delete.
    */
  var Name: EventSourceName
}

object DeletePartnerEventSourceRequest {
  @scala.inline
  def apply(Account: AccountId, Name: EventSourceName): DeletePartnerEventSourceRequest = {
    val __obj = js.Dynamic.literal(Account = Account, Name = Name)
  
    __obj.asInstanceOf[DeletePartnerEventSourceRequest]
  }
}

