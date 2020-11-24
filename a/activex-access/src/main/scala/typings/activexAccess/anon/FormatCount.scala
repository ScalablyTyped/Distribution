package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatCount extends js.Object {
  
  var Cancel: Double = js.native
  
  var FormatCount: Double = js.native
}
object FormatCount {
  
  @scala.inline
  def apply(Cancel: Double, FormatCount: Double): FormatCount = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FormatCount = FormatCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatCount]
  }
  
  @scala.inline
  implicit class FormatCountOps[Self <: FormatCount] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Double): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatCount(value: Double): Self = this.set("FormatCount", value.asInstanceOf[js.Any])
  }
}
