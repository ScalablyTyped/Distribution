package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVoiceConnectorTerminationCredentialsResponse extends js.Object {
  /**
    * A list of user names.
    */
  var Usernames: js.UndefOr[SensitiveStringList] = js.native
}

object ListVoiceConnectorTerminationCredentialsResponse {
  @scala.inline
  def apply(Usernames: SensitiveStringList = null): ListVoiceConnectorTerminationCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    if (Usernames != null) __obj.updateDynamic("Usernames")(Usernames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVoiceConnectorTerminationCredentialsResponse]
  }
}

