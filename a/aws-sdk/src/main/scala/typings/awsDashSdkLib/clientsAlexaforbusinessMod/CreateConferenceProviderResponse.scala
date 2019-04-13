package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateConferenceProviderResponse extends js.Object {
  /**
    * The ARN of the newly-created conference provider.
    */
  var ConferenceProviderArn: js.UndefOr[Arn] = js.undefined
}

object CreateConferenceProviderResponse {
  @scala.inline
  def apply(ConferenceProviderArn: Arn = null): CreateConferenceProviderResponse = {
    val __obj = js.Dynamic.literal()
    if (ConferenceProviderArn != null) __obj.updateDynamic("ConferenceProviderArn")(ConferenceProviderArn)
    __obj.asInstanceOf[CreateConferenceProviderResponse]
  }
}

