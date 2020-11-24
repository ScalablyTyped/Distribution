package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoAutoSub extends js.Object {
  
  var noAutoSub: js.UndefOr[Boolean] = js.native
}
object NoAutoSub {
  
  @scala.inline
  def apply(): NoAutoSub = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoAutoSub]
  }
  
  @scala.inline
  implicit class NoAutoSubOps[Self <: NoAutoSub] (val x: Self) extends AnyVal {
    
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
    def setNoAutoSub(value: Boolean): Self = this.set("noAutoSub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoAutoSub: Self = this.set("noAutoSub", js.undefined)
  }
}
