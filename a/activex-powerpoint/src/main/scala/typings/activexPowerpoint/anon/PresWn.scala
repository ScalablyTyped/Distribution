package typings.activexPowerpoint.anon

import typings.activexPowerpoint.PowerPoint.DocumentWindow
import typings.activexPowerpoint.PowerPoint.Presentation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresWn extends js.Object {
  
  val Pres: Presentation = js.native
  
  val Wn: DocumentWindow = js.native
}
object PresWn {
  
  @scala.inline
  def apply(Pres: Presentation, Wn: DocumentWindow): PresWn = {
    val __obj = js.Dynamic.literal(Pres = Pres.asInstanceOf[js.Any], Wn = Wn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresWn]
  }
  
  @scala.inline
  implicit class PresWnOps[Self <: PresWn] (val x: Self) extends AnyVal {
    
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
    def setPres(value: Presentation): Self = this.set("Pres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWn(value: DocumentWindow): Self = this.set("Wn", value.asInstanceOf[js.Any])
  }
}
