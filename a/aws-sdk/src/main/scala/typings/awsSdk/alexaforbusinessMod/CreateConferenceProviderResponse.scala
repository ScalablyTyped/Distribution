package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateConferenceProviderResponse extends js.Object {
  /**
    * The ARN of the newly-created conference provider.
    */
  var ConferenceProviderArn: js.UndefOr[Arn] = js.native
}

object CreateConferenceProviderResponse {
  @scala.inline
  def apply(ConferenceProviderArn: Arn = null): CreateConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (ConferenceProviderArn != null) __obj.updateDynamic("ConferenceProviderArn")(ConferenceProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConferenceProviderResponse]
  }
}

