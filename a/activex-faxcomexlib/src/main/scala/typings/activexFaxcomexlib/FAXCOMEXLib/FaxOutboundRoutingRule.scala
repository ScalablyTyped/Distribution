package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingRule Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRoutingRule")
@js.native
class FaxOutboundRoutingRule protected () extends js.Object {
  /** Area code */
  val AreaCode: Double = js.native
  /** Country code */
  val CountryCode: Double = js.native
  /** Destination device */
  var DeviceId: Double = js.native
  @JSName("FAXCOMEXLib.FaxOutboundRoutingRule_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingRule_typekey: FaxOutboundRoutingRule = js.native
  /** Group name */
  var GroupName: String = js.native
  /** Status */
  val Status: FAX_RULE_STATUS_ENUM = js.native
  /** Uses single device or group */
  var UseDevice: Boolean = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

