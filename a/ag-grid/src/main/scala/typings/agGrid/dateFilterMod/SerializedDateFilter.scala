package typings.agGrid.dateFilterMod

import typings.agGrid.iFilterMod.SerializedFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializedDateFilter extends SerializedFilter {
  
  var dateFrom: String = js.native
  
  var dateTo: String = js.native
  
  var `type`: String = js.native
}
object SerializedDateFilter {
  
  @scala.inline
  def apply(dateFrom: String, dateTo: String, filterType: String, `type`: String): SerializedDateFilter = {
    val __obj = js.Dynamic.literal(dateFrom = dateFrom.asInstanceOf[js.Any], dateTo = dateTo.asInstanceOf[js.Any], filterType = filterType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedDateFilter]
  }
  
  @scala.inline
  implicit class SerializedDateFilterOps[Self <: SerializedDateFilter] (val x: Self) extends AnyVal {
    
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
    def setDateFrom(value: String): Self = this.set("dateFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTo(value: String): Self = this.set("dateTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
