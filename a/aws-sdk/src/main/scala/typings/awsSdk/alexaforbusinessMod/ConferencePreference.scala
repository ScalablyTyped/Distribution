package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConferencePreference extends js.Object {
  /**
    * The ARN of the default conference provider.
    */
  var DefaultConferenceProviderArn: js.UndefOr[Arn] = js.native
}

object ConferencePreference {
  @scala.inline
  def apply(DefaultConferenceProviderArn: Arn = null): ConferencePreference = {
    val __obj = js.Dynamic.literal()
    if (DefaultConferenceProviderArn != null) __obj.updateDynamic("DefaultConferenceProviderArn")(DefaultConferenceProviderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConferencePreference]
  }
}

