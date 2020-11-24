package typings.activexVbide.VBIDE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferencesEvents extends js.Object {
  
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
  implicit class ReferencesEventsOps[Self <: ReferencesEvents] (val x: Self) extends AnyVal {
    
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
    def setVBIDEDotReferencesEvents_typekey(value: ReferencesEvents): Self = this.set("VBIDE.ReferencesEvents_typekey", value.asInstanceOf[js.Any])
  }
}
