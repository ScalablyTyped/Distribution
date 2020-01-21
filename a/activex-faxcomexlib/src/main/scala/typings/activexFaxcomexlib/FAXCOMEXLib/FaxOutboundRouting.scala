package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRouting")
@js.native
class FaxOutboundRouting protected () extends js.Object {
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting = js.native
  /** Configuration of the outbound routing groups */
  def GetGroups(): FaxOutboundRoutingGroups = js.native
  /** Configuration of the outbound routing rules */
  def GetRules(): FaxOutboundRoutingRules = js.native
}

