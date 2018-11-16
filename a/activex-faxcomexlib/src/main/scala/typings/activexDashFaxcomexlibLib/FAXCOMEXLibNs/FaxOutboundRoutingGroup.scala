package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingGroup Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRoutingGroup")
@js.native
class FaxOutboundRoutingGroup protected () extends js.Object {
  /** Ordered collection of device IDs */
  @JSName("DeviceIds")
  val DeviceIds_Original: FaxDeviceIds = js.native
  var `FAXCOMEXLib.FaxOutboundRoutingGroup_typekey`: FaxOutboundRoutingGroup = js.native
  /** Name of the group */
  val Name: java.lang.String = js.native
  /** Status of the group */
  val Status: FAX_GROUP_STATUS_ENUM = js.native
  /** Ordered collection of device IDs */
  def DeviceIds(lIndex: scala.Double): scala.Double = js.native
}

