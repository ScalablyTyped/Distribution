package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingRule Class */
trait FaxOutboundRoutingRule extends js.Object {
  /** Area code */
  val AreaCode: Double
  /** Country code */
  val CountryCode: Double
  /** Destination device */
  var DeviceId: Double
  @JSName("FAXCOMEXLib.FaxOutboundRoutingRule_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingRule_typekey: FaxOutboundRoutingRule
  /** Group name */
  var GroupName: String
  /** Status */
  val Status: FAX_RULE_STATUS_ENUM
  /** Uses single device or group */
  var UseDevice: Boolean
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxOutboundRoutingRule {
  @scala.inline
  def apply(
    AreaCode: Double,
    CountryCode: Double,
    DeviceId: Double,
    FAXCOMEXLibDotFaxOutboundRoutingRule_typekey: FaxOutboundRoutingRule,
    GroupName: String,
    Refresh: () => Unit,
    Save: () => Unit,
    Status: FAX_RULE_STATUS_ENUM,
    UseDevice: Boolean
  ): FaxOutboundRoutingRule = {
    val __obj = js.Dynamic.literal(AreaCode = AreaCode.asInstanceOf[js.Any], CountryCode = CountryCode.asInstanceOf[js.Any], DeviceId = DeviceId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save), Status = Status.asInstanceOf[js.Any], UseDevice = UseDevice.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutboundRoutingRule_typekey")(FAXCOMEXLibDotFaxOutboundRoutingRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutboundRoutingRule]
  }
}

