package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingRule Class */
@js.native
trait FaxOutboundRoutingRule extends StObject {
  
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
  
  /** Refresh the object */
  def Refresh(): Unit = js.native
  
  /** Save the object */
  def Save(): Unit = js.native
  
  /** Status */
  val Status: FAX_RULE_STATUS_ENUM = js.native
  
  /** Uses single device or group */
  var UseDevice: Boolean = js.native
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
  implicit class FaxOutboundRoutingRuleMutableBuilder[Self <: FaxOutboundRoutingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaCode(value: Double): Self = StObject.set(x, "AreaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: Double): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceId(value: Double): Self = StObject.set(x, "DeviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxOutboundRoutingRule_typekey(value: FaxOutboundRoutingRule): Self = StObject.set(x, "FAXCOMEXLib.FaxOutboundRoutingRule_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupName(value: String): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStatus(value: FAX_RULE_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDevice(value: Boolean): Self = StObject.set(x, "UseDevice", value.asInstanceOf[js.Any])
  }
}
