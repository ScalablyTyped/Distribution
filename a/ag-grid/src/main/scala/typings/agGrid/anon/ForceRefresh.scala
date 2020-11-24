package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForceRefresh extends js.Object {
  
  var forceRefresh: js.UndefOr[Boolean] = js.native
  
  var newData: js.UndefOr[Boolean] = js.native
  
  var suppressFlash: js.UndefOr[Boolean] = js.native
}
object ForceRefresh {
  
  @scala.inline
  def apply(): ForceRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForceRefresh]
  }
  
  @scala.inline
  implicit class ForceRefreshOps[Self <: ForceRefresh] (val x: Self) extends AnyVal {
    
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
    def setForceRefresh(value: Boolean): Self = this.set("forceRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceRefresh: Self = this.set("forceRefresh", js.undefined)
    
    @scala.inline
    def setNewData(value: Boolean): Self = this.set("newData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewData: Self = this.set("newData", js.undefined)
    
    @scala.inline
    def setSuppressFlash(value: Boolean): Self = this.set("suppressFlash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressFlash: Self = this.set("suppressFlash", js.undefined)
  }
}
