package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxInboundRoutingMethod Class */
@js.native
trait FaxInboundRoutingMethod extends js.Object {
  
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
  
  @scala.inline
  implicit class FaxInboundRoutingMethodOps[Self <: FaxInboundRoutingMethod] (val x: Self) extends AnyVal {
    
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
    def setExtensionFriendlyName(value: String): Self = this.set("ExtensionFriendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionImageName(value: String): Self = this.set("ExtensionImageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxInboundRoutingMethod_typekey(value: FaxInboundRoutingMethod): Self = this.set("FAXCOMEXLib.FaxInboundRoutingMethod_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionName(value: String): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGUID(value: String): Self = this.set("GUID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double): Self = this.set("Priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("Refresh", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: () => Unit): Self = this.set("Save", js.Any.fromFunction0(value))
  }
}
