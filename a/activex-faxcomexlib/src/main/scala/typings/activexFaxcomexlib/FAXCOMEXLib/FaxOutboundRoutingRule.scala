package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingRule Class */
@js.native
trait FaxOutboundRoutingRule extends js.Object {
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
  @scala.inline
  implicit class FaxOutboundRoutingRuleOps[Self <: FaxOutboundRoutingRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAreaCode(value: Double): Self = this.set("AreaCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCode(value: Double): Self = this.set("CountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeviceId(value: Double): Self = this.set("DeviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFAXCOMEXLibDotFaxOutboundRoutingRule_typekey(value: FaxOutboundRoutingRule): Self = this.set("FAXCOMEXLib.FaxOutboundRoutingRule_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupName(value: String): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: FAX_RULE_STATUS_ENUM): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDevice(value: Boolean): Self = this.set("UseDevice", value.asInstanceOf[js.Any])
  }
  
}

