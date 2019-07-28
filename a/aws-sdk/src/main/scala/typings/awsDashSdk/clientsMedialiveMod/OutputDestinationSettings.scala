package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputDestinationSettings extends js.Object {
  /**
    * key used to extract the password from EC2 Parameter store
    */
  var PasswordParam: js.UndefOr[__string] = js.undefined
  /**
    * Stream name for RTMP destinations (URLs of type rtmp://)
    */
  var StreamName: js.UndefOr[__string] = js.undefined
  /**
    * A URL specifying a destination
    */
  var Url: js.UndefOr[__string] = js.undefined
  /**
    * username for destination
    */
  var Username: js.UndefOr[__string] = js.undefined
}

object OutputDestinationSettings {
  @scala.inline
  def apply(
    PasswordParam: __string = null,
    StreamName: __string = null,
    Url: __string = null,
    Username: __string = null
  ): OutputDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (PasswordParam != null) __obj.updateDynamic("PasswordParam")(PasswordParam)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[OutputDestinationSettings]
  }
}

