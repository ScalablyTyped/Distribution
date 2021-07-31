package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_GROUP_STATUS_ENUM
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxDeviceIds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRoutingGroup Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRoutingGroup")
@js.native
class FaxOutboundRoutingGroup protected ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroup {
  
  /** Ordered collection of device IDs */
  /* CompleteClass */
  override def DeviceIds(lIndex: Double): Double = js.native
  /** Ordered collection of device IDs */
  /* CompleteClass */
  @JSName("DeviceIds")
  override val DeviceIds_Original: FaxDeviceIds = js.native
  
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRoutingGroup_typekey")
  var FAXCOMEXLibDotFaxOutboundRoutingGroup_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroup = js.native
  
  /** Name of the group */
  /* CompleteClass */
  override val Name: String = js.native
  
  /** Status of the group */
  /* CompleteClass */
  override val Status: FAX_GROUP_STATUS_ENUM = js.native
}
