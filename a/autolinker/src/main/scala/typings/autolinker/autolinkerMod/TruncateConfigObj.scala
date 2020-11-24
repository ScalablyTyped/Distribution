package typings.autolinker.autolinkerMod

import typings.autolinker.autolinkerStrings.end
import typings.autolinker.autolinkerStrings.middle
import typings.autolinker.autolinkerStrings.smart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TruncateConfigObj extends js.Object {
  
  var length: js.UndefOr[Double] = js.native
  
  var location: js.UndefOr[end | middle | smart] = js.native
}
object TruncateConfigObj {
  
  @scala.inline
  def apply(): TruncateConfigObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateConfigObj]
  }
  
  @scala.inline
  implicit class TruncateConfigObjOps[Self <: TruncateConfigObj] (val x: Self) extends AnyVal {
    
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
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setLocation(value: end | middle | smart): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
  }
}
