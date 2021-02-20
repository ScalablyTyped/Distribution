package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutboundRouting Class */
@js.native
trait FaxOutboundRouting extends StObject {
  
  @JSName("FAXCOMEXLib.FaxOutboundRouting_typekey")
  var FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting = js.native
  
  /** Configuration of the outbound routing groups */
  def GetGroups(): FaxOutboundRoutingGroups = js.native
  
  /** Configuration of the outbound routing rules */
  def GetRules(): FaxOutboundRoutingRules = js.native
}
object FaxOutboundRouting {
  
  @scala.inline
  def apply(
    FAXCOMEXLibDotFaxOutboundRouting_typekey: FaxOutboundRouting,
    GetGroups: () => FaxOutboundRoutingGroups,
    GetRules: () => FaxOutboundRoutingRules
  ): FaxOutboundRouting = {
    val __obj = js.Dynamic.literal(GetGroups = js.Any.fromFunction0(GetGroups), GetRules = js.Any.fromFunction0(GetRules))
    __obj.updateDynamic("FAXCOMEXLib.FaxOutboundRouting_typekey")(FAXCOMEXLibDotFaxOutboundRouting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutboundRouting]
  }
  
  @scala.inline
  implicit class FaxOutboundRoutingMutableBuilder[Self <: FaxOutboundRouting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAXCOMEXLibDotFaxOutboundRouting_typekey(value: FaxOutboundRouting): Self = StObject.set(x, "FAXCOMEXLib.FaxOutboundRouting_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetGroups(value: () => FaxOutboundRoutingGroups): Self = StObject.set(x, "GetGroups", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRules(value: () => FaxOutboundRoutingRules): Self = StObject.set(x, "GetRules", js.Any.fromFunction0(value))
  }
}
