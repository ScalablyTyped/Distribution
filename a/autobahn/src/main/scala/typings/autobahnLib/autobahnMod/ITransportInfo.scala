package typings
package autobahnLib.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportInfo extends js.Object {
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var `type`: TransportType
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ITransportInfo {
  @scala.inline
  def apply(`type`: TransportType, protocol: java.lang.String = null, url: java.lang.String = null): ITransportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ITransportInfo]
  }
}

