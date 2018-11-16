package typings
package activexDashFaxcomexlibLib.FAXCOMEXLibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingMethod Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRoutingMethod")
@js.native
class FaxInboundRoutingMethod protected () extends js.Object {
  /** Friendly name of the extension exposing this method */
  val ExtensionFriendlyName: java.lang.String = js.native
  /** Image name of the extension exposing this method */
  val ExtensionImageName: java.lang.String = js.native
  var `FAXCOMEXLib.FaxInboundRoutingMethod_typekey`: FaxInboundRoutingMethod = js.native
  /** Internal function name */
  val FunctionName: java.lang.String = js.native
  /** GUID of the method */
  val GUID: java.lang.String = js.native
  /** The name of the method */
  val Name: java.lang.String = js.native
  /** Priority of the method */
  var Priority: scala.Double = js.native
  /** Refresh the object */
  def Refresh(): scala.Unit = js.native
  /** Save the object */
  def Save(): scala.Unit = js.native
}

