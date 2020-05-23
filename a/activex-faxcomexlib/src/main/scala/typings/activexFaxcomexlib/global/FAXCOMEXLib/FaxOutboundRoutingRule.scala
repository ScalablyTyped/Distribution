package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FAX_RULE_STATUS_ENUM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRoutingRule Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRoutingRule")
@js.native
class FaxOutboundRoutingRule protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRule {
  /** Area code */
  /* CompleteClass */
  override val AreaCode: Double = js.native
  /** Country code */
  /* CompleteClass */
  override val CountryCode: Double = js.native
  /** Destination device */
  /* CompleteClass */
  override var DeviceId: Double = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRoutingRule_typekey")
  override var FAXCOMEXLibDotFaxOutboundRoutingRule_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRule = js.native
  /** Group name */
  /* CompleteClass */
  override var GroupName: String = js.native
  /** Status */
  /* CompleteClass */
  override val Status: FAX_RULE_STATUS_ENUM = js.native
  /** Uses single device or group */
  /* CompleteClass */
  override var UseDevice: Boolean = js.native
  /** Refresh the object */
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  /** Save the object */
  /* CompleteClass */
  override def Save(): Unit = js.native
}

