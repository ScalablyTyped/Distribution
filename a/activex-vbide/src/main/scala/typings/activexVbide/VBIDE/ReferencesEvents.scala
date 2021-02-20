package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferencesEvents extends StObject {
  
  @JSName("VBIDE.ReferencesEvents_typekey")
  var VBIDEDotReferencesEvents_typekey: ReferencesEvents = js.native
}
object ReferencesEvents {
  
  @scala.inline
  def apply(VBIDEDotReferencesEvents_typekey: ReferencesEvents): ReferencesEvents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VBIDE.ReferencesEvents_typekey")(VBIDEDotReferencesEvents_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferencesEvents]
  }
  
  @scala.inline
  implicit class ReferencesEventsMutableBuilder[Self <: ReferencesEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVBIDEDotReferencesEvents_typekey(value: ReferencesEvents): Self = StObject.set(x, "VBIDE.ReferencesEvents_typekey", value.asInstanceOf[js.Any])
  }
}
