package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetIdentityFeedbackForwardingEnabledRequest extends js.Object {
  /**
    * Sets whether Amazon SES will forward bounce and complaint notifications as email. true specifies that Amazon SES will forward bounce and complaint notifications as email, in addition to any Amazon SNS topic publishing otherwise specified. false specifies that Amazon SES will publish bounce and complaint notifications only through Amazon SNS. This value can only be set to false when Amazon SNS topics are set for both Bounce and Complaint notification types.
    */
  var ForwardingEnabled: Enabled
  /**
    * The identity for which to set bounce and complaint notification forwarding. Examples: user@example.com, example.com.
    */
  var Identity: awsDashSdkLib.clientsSesMod.Identity
}

object SetIdentityFeedbackForwardingEnabledRequest {
  @scala.inline
  def apply(ForwardingEnabled: Enabled, Identity: Identity): SetIdentityFeedbackForwardingEnabledRequest = {
    val __obj = js.Dynamic.literal(ForwardingEnabled = ForwardingEnabled, Identity = Identity)
  
    __obj.asInstanceOf[SetIdentityFeedbackForwardingEnabledRequest]
  }
}

