package typings.agGrid.baseFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NullComparator extends js.Object {
  
  @JSName("equals")
  var equals_FNullComparator: js.UndefOr[Boolean] = js.native
  
  var greaterThan: js.UndefOr[Boolean] = js.native
  
  var lessThan: js.UndefOr[Boolean] = js.native
}
object NullComparator {
  
  @scala.inline
  def apply(): NullComparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NullComparator]
  }
  
  @scala.inline
  implicit class NullComparatorOps[Self <: NullComparator] (val x: Self) extends AnyVal {
    
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
    def setEquals(value: Boolean): Self = this.set("equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setGreaterThan(value: Boolean): Self = this.set("greaterThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreaterThan: Self = this.set("greaterThan", js.undefined)
    
    @scala.inline
    def setLessThan(value: Boolean): Self = this.set("lessThan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLessThan: Self = this.set("lessThan", js.undefined)
  }
}
