package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortProbeDetail extends js.Object {
  /**
    * Local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[LocalPortDetails] = js.undefined
  /**
    * Remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[RemoteIpDetails] = js.undefined
}

object PortProbeDetail {
  @scala.inline
  def apply(LocalPortDetails: LocalPortDetails = null, RemoteIpDetails: RemoteIpDetails = null): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    if (LocalPortDetails != null) __obj.updateDynamic("LocalPortDetails")(LocalPortDetails)
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails)
    __obj.asInstanceOf[PortProbeDetail]
  }
}

