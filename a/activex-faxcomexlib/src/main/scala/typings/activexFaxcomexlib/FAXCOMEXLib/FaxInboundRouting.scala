package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxInboundRouting Class */
@js.native
trait FaxInboundRouting extends StObject {
  
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
  implicit class FaxInboundRoutingMutableBuilder[Self <: FaxInboundRouting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxInboundRouting_typekey(value: FaxInboundRouting): Self = StObject.set(x, "FAXCOMEXLib.FaxInboundRouting_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetExtensions(value: () => FaxInboundRoutingExtensions): Self = StObject.set(x, "GetExtensions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMethods(value: () => FaxInboundRoutingMethods): Self = StObject.set(x, "GetMethods", js.Any.fromFunction0(value))
  }
}
