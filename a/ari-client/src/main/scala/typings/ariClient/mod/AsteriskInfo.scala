package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsteriskInfo extends js.Object {
  /**
    * Info about how Asterisk was built.
    */
  var build: js.UndefOr[BuildInfo] = js.undefined
  /**
    * Info about Asterisk configuration.
    */
  var config: js.UndefOr[ConfigInfo] = js.undefined
  /**
    * Info about Asterisk status.
    */
  var status: js.UndefOr[StatusInfo] = js.undefined
  /**
    * Info about the system running Asterisk.
    */
  var system: js.UndefOr[SystemInfo] = js.undefined
}

object AsteriskInfo {
  @scala.inline
  def apply(
    build: BuildInfo = null,
    config: ConfigInfo = null,
    status: StatusInfo = null,
    system: SystemInfo = null
  ): AsteriskInfo = {
    val __obj = js.Dynamic.literal()
    if (build != null) __obj.updateDynamic("build")(build.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsteriskInfo]
  }
}

