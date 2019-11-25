package typings.autobahn.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportInfo extends js.Object {
  var protocol: js.UndefOr[String] = js.undefined
  var `type`: TransportType
  var url: js.UndefOr[String] = js.undefined
}

object ITransportInfo {
  @scala.inline
  def apply(`type`: TransportType, protocol: String = null, url: String = null): ITransportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransportInfo]
  }
}

