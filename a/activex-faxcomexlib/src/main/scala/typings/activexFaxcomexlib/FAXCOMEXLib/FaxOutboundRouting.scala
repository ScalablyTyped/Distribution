package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutboundRouting Class */
@js.native
trait FaxOutboundRouting extends js.Object {
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting = js.native
  /** Configuration of the outbound routing groups */
  def GetGroups(): FaxOutboundRoutingGroups = js.native
  /** Configuration of the outbound routing rules */
  def GetRules(): FaxOutboundRoutingRules = js.native
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
  @scala.inline
  implicit class FaxOutboundRoutingOps[Self <: FaxOutboundRouting] (val x: Self) extends AnyVal {
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
    def setFAXCOMEXLibDotFaxOutboundRouting_typekey(value: FaxOutboundRouting): Self = this.set("FAXCOMEXLib.FaxOutboundRouting_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetGroups(value: () => FaxOutboundRoutingGroups): Self = this.set("GetGroups", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRules(value: () => FaxOutboundRoutingRules): Self = this.set("GetRules", js.Any.fromFunction0(value))
  }
  
}

