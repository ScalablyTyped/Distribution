package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRouting Class */
trait FaxInboundRouting extends js.Object {
  @JSName("FAXCOMEXLib.FaxInboundRouting_typekey")
  var FAXCOMEXLibDotFaxInboundRouting_typekey: FaxInboundRouting
  /** Registered inbound routing extensions collection */
  def GetExtensions(): FaxInboundRoutingExtensions
  /** Ordered collection of all the registered methods */
  def GetMethods(): FaxInboundRoutingMethods
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
}

