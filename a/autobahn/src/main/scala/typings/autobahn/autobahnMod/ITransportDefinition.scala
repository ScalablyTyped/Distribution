package typings.autobahn.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransportDefinition extends js.Object {
  var protocols: js.UndefOr[js.Array[String]] = js.undefined
  var `type`: TransportType
  var url: js.UndefOr[String] = js.undefined
}

object ITransportDefinition {
  @scala.inline
  def apply(`type`: TransportType, protocols: js.Array[String] = null, url: String = null): ITransportDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ITransportDefinition]
  }
}

