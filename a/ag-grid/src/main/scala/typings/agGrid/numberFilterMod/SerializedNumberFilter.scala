package typings.agGrid.numberFilterMod

import typings.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializedNumberFilter extends SerializedFilter {
  
  var filter: Double = js.native
  
  var filterTo: Double = js.native
  
  var `type`: String = js.native
}
object SerializedNumberFilter {
  
  @scala.inline
  def apply(filter: Double, filterTo: Double, filterType: String, `type`: String): SerializedNumberFilter = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], filterTo = filterTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedNumberFilter]
  }
  
  @scala.inline
  implicit class SerializedNumberFilterOps[Self <: SerializedNumberFilter] (val x: Self) extends AnyVal {
    
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
    def setFilter(value: Double): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterTo(value: Double): Self = this.set("filterTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
