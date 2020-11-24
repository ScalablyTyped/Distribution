package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingGroup Class */
@js.native
trait FaxOutboundRoutingGroup extends js.Object {
  
  /** Ordered collection of device IDs */
  def DeviceIds(lIndex: Double): Double = js.native
  /** Ordered collection of device IDs */
  @JSName("DeviceIds")
  val DeviceIds_Original: FaxDeviceIds = js.native
  
  @JSName("FAXCOMEXLib.FaxOutboundRoutingGroup_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingGroup_typekey: FaxOutboundRoutingGroup = js.native
  
  /** Name of the group */
  val Name: String = js.native
  
  /** Status of the group */
  val Status: FAX_GROUP_STATUS_ENUM = js.native
}
