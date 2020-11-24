package typings.antvComponent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NameStyle extends js.Object {
  
  var nameStyle: OpacityNumber = js.native
}
object NameStyle {
  
  @scala.inline
  def apply(nameStyle: OpacityNumber): NameStyle = {
    val __obj = js.Dynamic.literal(nameStyle = nameStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameStyle]
  }
  
  @scala.inline
  implicit class NameStyleOps[Self <: NameStyle] (val x: Self) extends AnyVal {
    
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
    def setNameStyle(value: OpacityNumber): Self = this.set("nameStyle", value.asInstanceOf[js.Any])
  }
}
