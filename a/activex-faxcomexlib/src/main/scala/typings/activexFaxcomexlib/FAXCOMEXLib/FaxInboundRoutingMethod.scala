package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingMethod Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRoutingMethod")
@js.native
class FaxInboundRoutingMethod protected () extends js.Object {
  /** Friendly name of the extension exposing this method */
  val ExtensionFriendlyName: String = js.native
  /** Image name of the extension exposing this method */
  val ExtensionImageName: String = js.native
  @JSName("FAXCOMEXLib.FaxInboundRoutingMethod_typekey")
  var FAXCOMEXLibDotFaxInboundRoutingMethod_typekey: FaxInboundRoutingMethod = js.native
  /** Internal function name */
  val FunctionName: String = js.native
  /** GUID of the method */
  val GUID: String = js.native
  /** The name of the method */
  val Name: String = js.native
  /** Priority of the method */
  var Priority: Double = js.native
  /** Refresh the object */
  def Refresh(): Unit = js.native
  /** Save the object */
  def Save(): Unit = js.native
}

