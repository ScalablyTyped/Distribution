package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IncludeNewline extends js.Object {
  
  var includeNewline: js.UndefOr[Boolean] = js.native
}
object IncludeNewline {
  
  @scala.inline
  def apply(): IncludeNewline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IncludeNewline]
  }
  
  @scala.inline
  implicit class IncludeNewlineOps[Self <: IncludeNewline] (val x: Self) extends AnyVal {
    
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
    def setIncludeNewline(value: Boolean): Self = this.set("includeNewline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeNewline: Self = this.set("includeNewline", js.undefined)
  }
}
