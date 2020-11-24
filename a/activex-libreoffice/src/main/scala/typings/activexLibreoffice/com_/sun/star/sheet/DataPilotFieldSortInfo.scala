package typings.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes how to sort a single {@link DataPilotField} */
@js.native
trait DataPilotFieldSortInfo extends js.Object {
  
  /** contains the data field to sort by if the Mode is DATA */
  var Field: String = js.native
  
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var IsAscending: Boolean = js.native
  
  /**
    * contains the sort mode
    * @see com.sun.star.sheet.DataPilotFieldSortMode
    */
  var Mode: Double = js.native
}
object DataPilotFieldSortInfo {
  
  @scala.inline
  def apply(Field: String, IsAscending: Boolean, Mode: Double): DataPilotFieldSortInfo = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], IsAscending = IsAscending.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPilotFieldSortInfo]
  }
  
  @scala.inline
  implicit class DataPilotFieldSortInfoOps[Self <: DataPilotFieldSortInfo] (val x: Self) extends AnyVal {
    
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
    def setField(value: String): Self = this.set("Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAscending(value: Boolean): Self = this.set("IsAscending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: Double): Self = this.set("Mode", value.asInstanceOf[js.Any])
  }
}
