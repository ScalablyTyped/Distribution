package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedSelection extends js.Object {
  
  var end: Point = js.native
  
  var isBackwards: Boolean = js.native
  
  var start: Point = js.native
}
object SavedSelection {
  
  @scala.inline
  def apply(end: Point, isBackwards: Boolean, start: Point): SavedSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], isBackwards = isBackwards.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedSelection]
  }
  
  @scala.inline
  implicit class SavedSelectionOps[Self <: SavedSelection] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: Point): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBackwards(value: Boolean): Self = this.set("isBackwards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
