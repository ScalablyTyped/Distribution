package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRouting Class */
trait FaxOutboundRouting extends js.Object {
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting
  /** Configuration of the outbound routing groups */
  def GetGroups(): FaxOutboundRoutingGroups
  /** Configuration of the outbound routing rules */
  def GetRules(): FaxOutboundRoutingRules
}

object FaxOutboundRouting {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting,
    GetGroups: () => FaxOutboundRoutingGroups,
    GetRules: () => FaxOutboundRoutingRules
  ): FaxOutboundRouting = {
    val __obj = js.Dynamic.literal(GetGroups = js.Any.fromFunction0(GetGroups), GetRules = js.Any.fromFunction0(GetRules))
    __obj.updateDynamic("FAXCOMEXLib.FaxOutboundRouting_typekey")(FAXCOMEXLibDotFaxOutboundRouting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutboundRouting]
  }
}

