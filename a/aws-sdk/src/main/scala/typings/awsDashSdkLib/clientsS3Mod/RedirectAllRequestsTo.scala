package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectAllRequestsTo extends js.Object {
  /**
    * Name of the host where requests are redirected.
    */
  var HostName: awsDashSdkLib.clientsS3Mod.HostName
  /**
    * Protocol to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var Protocol: js.UndefOr[Protocol] = js.undefined
}

object RedirectAllRequestsTo {
  @scala.inline
  def apply(HostName: HostName, Protocol: Protocol = null): RedirectAllRequestsTo = {
    val __obj = js.Dynamic.literal(HostName = HostName)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedirectAllRequestsTo]
  }
}

