package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxInboundRoutingMethod Class */
trait FaxInboundRoutingMethod extends StObject {
  
  /** Friendly name of the extension exposing this method */
  val ExtensionFriendlyName: String
  
  /** Image name of the extension exposing this method */
  val ExtensionImageName: String
  
  /* private */ @JSName("FAXCOMEXLib.FaxInboundRoutingMethod_typekey")
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
  
  inline def apply(
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
  
  extension [Self <: FaxInboundRoutingMethod](x: Self) {
    
    inline def setExtensionFriendlyName(value: String): Self = StObject.set(x, "ExtensionFriendlyName", value.asInstanceOf[js.Any])
    
    inline def setExtensionImageName(value: String): Self = StObject.set(x, "ExtensionImageName", value.asInstanceOf[js.Any])
    
    inline def setFAXCOMEXLibDotFaxInboundRoutingMethod_typekey(value: FaxInboundRoutingMethod): Self = StObject.set(x, "FAXCOMEXLib.FaxInboundRoutingMethod_typekey", value.asInstanceOf[js.Any])
    
    inline def setFunctionName(value: String): Self = StObject.set(x, "FunctionName", value.asInstanceOf[js.Any])
    
    inline def setGUID(value: String): Self = StObject.set(x, "GUID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "Refresh", js.Any.fromFunction0(value))
    
    inline def setSave(value: () => Unit): Self = StObject.set(x, "Save", js.Any.fromFunction0(value))
  }
}
