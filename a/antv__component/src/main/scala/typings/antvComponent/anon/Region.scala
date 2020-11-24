package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Region extends js.Object {
  
  var region: Style = js.native
  
  var text: ContentStyle = js.native
}
object Region {
  
  @scala.inline
  def apply(region: Style, text: ContentStyle): Region = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
    
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
    def setRegion(value: Style): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: ContentStyle): Self = this.set("text", value.asInstanceOf[js.Any])
  }
}
