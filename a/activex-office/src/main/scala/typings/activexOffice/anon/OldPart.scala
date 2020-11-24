package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldPart extends js.Object {
  
  val OldPart: CustomXMLPart = js.native
}
object OldPart {
  
  @scala.inline
  def apply(OldPart: CustomXMLPart): OldPart = {
    val __obj = js.Dynamic.literal(OldPart = OldPart.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldPart]
  }
  
  @scala.inline
  implicit class OldPartOps[Self <: OldPart] (val x: Self) extends AnyVal {
    
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
    def setOldPart(value: CustomXMLPart): Self = this.set("OldPart", value.asInstanceOf[js.Any])
  }
}
