package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutDestinationPolicyRequest extends js.Object {
  /**
    * An IAM policy document that authorizes cross-account users to deliver their log events to the associated destination.
    */
  var accessPolicy: AccessPolicy
  /**
    * A name for an existing destination.
    */
  var destinationName: DestinationName
}

object PutDestinationPolicyRequest {
  @scala.inline
  def apply(accessPolicy: AccessPolicy, destinationName: DestinationName): PutDestinationPolicyRequest = {
    val __obj = js.Dynamic.literal(accessPolicy = accessPolicy, destinationName = destinationName)
  
    __obj.asInstanceOf[PutDestinationPolicyRequest]
  }
}

