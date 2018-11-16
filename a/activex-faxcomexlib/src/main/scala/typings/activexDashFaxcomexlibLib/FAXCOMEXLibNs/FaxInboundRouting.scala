package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRouting")
@js.native
class FaxInboundRouting protected () extends js.Object {
  var `FAXCOMEXLib.FaxInboundRouting_typekey`: FaxInboundRouting = js.native
  /** Registered inbound routing extensions collection */
  def GetExtensions(): FaxInboundRoutingExtensions = js.native
  /** Ordered collection of all the registered methods */
  def GetMethods(): FaxInboundRoutingMethods = js.native
}

