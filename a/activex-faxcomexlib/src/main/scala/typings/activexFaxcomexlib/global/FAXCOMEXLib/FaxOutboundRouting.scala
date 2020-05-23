package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroups
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRules
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRouting")
@js.native
class FaxOutboundRouting protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting {
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  override var FAXCOMEXLibDotFaxOutboundRouting_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting = js.native
  /** Configuration of the outbound routing groups */
  /* CompleteClass */
  override def GetGroups(): FaxOutboundRoutingGroups = js.native
  /** Configuration of the outbound routing rules */
  /* CompleteClass */
  override def GetRules(): FaxOutboundRoutingRules = js.native
}

