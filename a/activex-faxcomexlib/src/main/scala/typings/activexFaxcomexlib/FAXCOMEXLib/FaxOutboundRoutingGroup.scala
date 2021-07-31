package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingGroup Class */
trait FaxOutboundRoutingGroup extends StObject {
  
  /** Ordered collection of device IDs */
  def DeviceIds(lIndex: Double): Double
  /** Ordered collection of device IDs */
  @JSName("DeviceIds")
  val DeviceIds_Original: FaxDeviceIds
  
  @JSName("FAXCOMEXLib.FaxOutboundRoutingGroup_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingGroup_typekey: FaxOutboundRoutingGroup
  
  /** Name of the group */
  val Name: String
  
  /** Status of the group */
  val Status: FAX_GROUP_STATUS_ENUM
}
object FaxOutboundRoutingGroup {
  
  @scala.inline
  def apply(
    DeviceIds: FaxDeviceIds,
    FAXCOMEXLibDotFaxOutboundRoutingGroup_typekey: FaxOutboundRoutingGroup,
    Name: String,
    Status: FAX_GROUP_STATUS_ENUM
  ): FaxOutboundRoutingGroup = {
    val __obj = js.Dynamic.literal(DeviceIds = DeviceIds.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutboundRoutingGroup_typekey")(FAXCOMEXLibDotFaxOutboundRoutingGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutboundRoutingGroup]
  }
  
  @scala.inline
  implicit class FaxOutboundRoutingGroupMutableBuilder[Self <: FaxOutboundRoutingGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceIds(value: FaxDeviceIds): Self = StObject.set(x, "DeviceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxOutboundRoutingGroup_typekey(value: FaxOutboundRoutingGroup): Self = StObject.set(x, "FAXCOMEXLib.FaxOutboundRoutingGroup_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: FAX_GROUP_STATUS_ENUM): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
