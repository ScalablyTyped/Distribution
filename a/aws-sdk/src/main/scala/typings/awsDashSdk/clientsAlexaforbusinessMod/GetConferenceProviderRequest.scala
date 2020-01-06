package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the newly created conference provider.
    */
  var ConferenceProviderArn: Arn = js.native
}

object GetConferenceProviderRequest {
  @scala.inline
  def apply(ConferenceProviderArn: Arn): GetConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetConferenceProviderRequest]
  }
}

