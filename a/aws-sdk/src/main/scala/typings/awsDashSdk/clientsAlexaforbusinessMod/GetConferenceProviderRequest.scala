package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConferenceProviderRequest extends js.Object {
  /**
    * The ARN of the newly created conference provider.
    */
  var ConferenceProviderArn: Arn
}

object GetConferenceProviderRequest {
  @scala.inline
  def apply(ConferenceProviderArn: Arn): GetConferenceProviderRequest = {
    val __obj = js.Dynamic.literal(ConferenceProviderArn = ConferenceProviderArn)
  
    __obj.asInstanceOf[GetConferenceProviderRequest]
  }
}

