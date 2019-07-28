package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
  /**
    * A list of user names.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.undefined
}

object ListVoiceConnectorTerminationCredentialsResponse {
  @scala.inline
  def apply(Usernames: SensitiveStringList = null): ListVoiceConnectorTerminationCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    if (Usernames != null) __obj.updateDynamic("Usernames")(Usernames)
    __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
  }
}

