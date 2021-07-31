package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingExtensions
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRoutingMethods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxInboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxInboundRouting")
@js.native
class FaxInboundRouting protected ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting {
  
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxInboundRouting_typekey")
  var FAXCOMEXLibDotFaxInboundRouting_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxInboundRouting = js.native
  
  /** Registered inbound routing extensions collection */
  /* CompleteClass */
  override def GetExtensions(): FaxInboundRoutingExtensions = js.native
  
  /** Ordered collection of all the registered methods */
  /* CompleteClass */
  override def GetMethods(): FaxInboundRoutingMethods = js.native
}
