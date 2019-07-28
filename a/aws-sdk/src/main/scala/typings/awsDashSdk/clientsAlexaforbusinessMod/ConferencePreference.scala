package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConferencePreference extends js.Object {
  /**
    * The ARN of the default conference provider.
    */
  var DefaultConferenceProviderArn: js.UndefOr[Arn] = js.undefined
}

object ConferencePreference {
  @scala.inline
  def apply(DefaultConferenceProviderArn: Arn = null): ConferencePreference = {
    val __obj = js.Dynamic.literal()
    if (DefaultConferenceProviderArn != null) __obj.updateDynamic("DefaultConferenceProviderArn")(DefaultConferenceProviderArn)
    __obj.asInstanceOf[ConferencePreference]
  }
}

