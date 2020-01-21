package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConferenceProvidersResponse extends js.Object {
  /**
    * The conference providers.
    */
  var ConferenceProviders: js.UndefOr[ConferenceProvidersList] = js.native
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListConferenceProvidersResponse {
  @scala.inline
  def apply(ConferenceProviders: ConferenceProvidersList = null, NextToken: NextToken = null): ListConferenceProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (ConferenceProviders != null) __obj.updateDynamic("ConferenceProviders")(ConferenceProviders.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListConferenceProvidersResponse]
  }
}

