package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientProperties extends js.Object {
  /**
    * Specifies whether users can cache their credentials on the Amazon WorkSpaces client. When enabled, users can choose to reconnect to their WorkSpaces without re-entering their credentials. 
    */
  var ReconnectEnabled: js.UndefOr[ReconnectEnum] = js.undefined
}

object ClientProperties {
  @scala.inline
  def apply(ReconnectEnabled: ReconnectEnum = null): ClientProperties = {
    val __obj = js.Dynamic.literal()
    if (ReconnectEnabled != null) __obj.updateDynamic("ReconnectEnabled")(ReconnectEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientProperties]
  }
}

