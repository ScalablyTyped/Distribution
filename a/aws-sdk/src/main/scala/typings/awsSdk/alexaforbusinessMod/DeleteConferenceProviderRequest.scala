package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
}

object DeleteConferenceProviderRequest {
  @scala.inline
  def apply(ConferenceProviderArn: Arn): DeleteConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteConferenceProviderRequest]
  }
}

