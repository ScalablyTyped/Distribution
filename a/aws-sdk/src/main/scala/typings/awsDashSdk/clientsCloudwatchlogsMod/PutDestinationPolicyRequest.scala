package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutDestinationPolicyRequest extends js.Object {
  /**
    * An IAM policy document that authorizes cross-account users to deliver their log events to the associated destination.
    */
  var accessPolicy: AccessPolicy = js.native
  /**
    * A name for an existing destination.
    */
  var destinationName: DestinationName = js.native
}

object PutDestinationPolicyRequest {
  @scala.inline
  def apply(accessPolicy: AccessPolicy, destinationName: DestinationName): PutDestinationPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutDestinationPolicyRequest]
  }
}

