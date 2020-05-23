package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxInboundRoutingMethod Class */
trait FaxInboundRoutingMethod extends js.Object {
  /** Friendly name of the extension exposing this method */
  val ExtensionFriendlyName: String
  /** Image name of the extension exposing this method */
  val ExtensionImageName: String
  @JSName("FAXCOMEXLib.FaxInboundRoutingMethod_typekey")
  var FAXCOMEXLibDotFaxInboundRoutingMethod_typekey: FaxInboundRoutingMethod
  /** Internal function name */
  val FunctionName: String
  /** GUID of the method */
  val GUID: String
  /** The name of the method */
  val Name: String
  /** Priority of the method */
  var Priority: Double
  /** Refresh the object */
  def Refresh(): Unit
  /** Save the object */
  def Save(): Unit
}

object FaxInboundRoutingMethod {
  @scala.inline
  def apply(
    ExtensionFriendlyName: String,
    ExtensionImageName: String,
    FAXCOMEXLibDotFaxInboundRoutingMethod_typekey: FaxInboundRoutingMethod,
    FunctionName: String,
    GUID: String,
    Name: String,
    Priority: Double,
    Refresh: () => Unit,
    Save: () => Unit
  ): FaxInboundRoutingMethod = {
    val __obj = js.Dynamic.literal(ExtensionFriendlyName = ExtensionFriendlyName.asInstanceOf[js.Any], ExtensionImageName = ExtensionImageName.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Refresh = js.Any.fromFunction0(Refresh), Save = js.Any.fromFunction0(Save))
    __obj.updateDynamic("FAXCOMEXLib.FaxInboundRoutingMethod_typekey")(FAXCOMEXLibDotFaxInboundRoutingMethod_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxInboundRoutingMethod]
  }
}

