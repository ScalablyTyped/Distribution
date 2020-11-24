package typings.atom.anon

import typings.atom.atomStrings.inside
import typings.atom.atomStrings.never
import typings.atom.atomStrings.overlap
import typings.atom.atomStrings.surround
import typings.atom.atomStrings.touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintainHistory extends js.Object {
  
  var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.native
  
  var maintainHistory: js.UndefOr[Boolean] = js.native
  
  var reversed: js.UndefOr[Boolean] = js.native
}
object MaintainHistory {
  
  @scala.inline
  def apply(): MaintainHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintainHistory]
  }
  
  @scala.inline
  implicit class MaintainHistoryOps[Self <: MaintainHistory] (val x: Self) extends AnyVal {
    
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
    def setInvalidate(value: never | surround | overlap | inside | touch): Self = this.set("invalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidate: Self = this.set("invalidate", js.undefined)
    
    @scala.inline
    def setMaintainHistory(value: Boolean): Self = this.set("maintainHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaintainHistory: Self = this.set("maintainHistory", js.undefined)
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReversed: Self = this.set("reversed", js.undefined)
  }
}
