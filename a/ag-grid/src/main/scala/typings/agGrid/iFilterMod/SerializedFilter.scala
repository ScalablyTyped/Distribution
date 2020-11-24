package typings.agGrid.iFilterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializedFilter extends js.Object {
  
  var filterType: String = js.native
}
object SerializedFilter {
  
  @scala.inline
  def apply(filterType: String): SerializedFilter = {
    val __obj = js.Dynamic.literal(filterType = filterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedFilter]
  }
  
  @scala.inline
  implicit class SerializedFilterOps[Self <: SerializedFilter] (val x: Self) extends AnyVal {
    
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
    def setFilterType(value: String): Self = this.set("filterType", value.asInstanceOf[js.Any])
  }
}
