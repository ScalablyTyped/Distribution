package typings.activexFaxcomexlib.global.FAXCOMEXLib

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingGroups
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRoutingRules
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRouting Class */
@JSGlobal("FAXCOMEXLib.FaxOutboundRouting")
@js.native
/* private */ class FaxOutboundRouting ()
  extends StObject
     with typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting {
  
  /* private */ /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutboundRouting = js.native
  
  /** Configuration of the outbound routing groups */
  /* CompleteClass */
  override def GetGroups(): FaxOutboundRoutingGroups = js.native
  
  /** Configuration of the outbound routing rules */
  /* CompleteClass */
  override def GetRules(): FaxOutboundRoutingRules = js.native
}
