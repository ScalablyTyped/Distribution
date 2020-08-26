package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRouting Class */
@js.native
trait FaxInboundRouting extends js.Object {
  @JSName("FAXCOMEXLib.FaxInboundRouting_typekey")
  var FAXCOMEXLibDotFaxInboundRouting_typekey: FaxInboundRouting = js.native
  /** Registered inbound routing extensions collection */
  def GetExtensions(): FaxInboundRoutingExtensions = js.native
  /** Ordered collection of all the registered methods */
  def GetMethods(): FaxInboundRoutingMethods = js.native
}

object FaxInboundRouting {
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxInboundRouting_typekey: FaxInboundRouting,
    GetExtensions: () => FaxInboundRoutingExtensions,
    GetMethods: () => FaxInboundRoutingMethods
  ): FaxInboundRouting = {
    val __obj = js.Dynamic.literal(GetExtensions = js.Any.fromFunction0(GetExtensions), GetMethods = js.Any.fromFunction0(GetMethods))
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRouting_typekey")(FAXCOMEXLibDotFaxInboundRouting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRouting]
  }
  @scala.inline
  implicit class FaxInboundRoutingOps[Self <: FaxInboundRouting] (val x: Self) extends AnyVal {
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
    def setFAXCOMEXLibDotFaxInboundRouting_typekey(value: FaxInboundRouting): Self = this.set("FAXCOMEXLib.FaxInboundRouting_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetExtensions(value: () => FaxInboundRoutingExtensions): Self = this.set("GetExtensions", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMethods(value: () => FaxInboundRoutingMethods): Self = this.set("GetMethods", js.Any.fromFunction0(value))
  }
  
}

