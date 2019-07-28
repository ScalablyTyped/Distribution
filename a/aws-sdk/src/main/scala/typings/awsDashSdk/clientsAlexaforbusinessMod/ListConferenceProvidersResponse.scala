package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConferenceProvidersResponse extends js.Object {
  /**
    * The conference providers.
    */
  var ConferenceProviders: js.UndefOr[ConferenceProvidersList] = js.undefined
  /**
    * The tokens used for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
}

object ListConferenceProvidersResponse {
  @scala.inline
  def apply(ConferenceProviders: ConferenceProvidersList = null, NextToken: NextToken = null): ListConferenceProvidersResponse = {
    val __obj = js.Dynamic.literal()
    if (ConferenceProviders != null) __obj.updateDynamic("ConferenceProviders")(ConferenceProviders)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListConferenceProvidersResponse]
  }
}

