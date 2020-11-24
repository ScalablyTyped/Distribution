package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single field in a sort descriptor.
  * @deprecated Deprecated
  */
@js.native
trait SortField extends js.Object {
  
  /** index of the field in the table; 0-based. */
  var Field: Double = js.native
  
  /** type of contents in the field. */
  var FieldType: SortFieldType = js.native
  
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var SortAscending: Boolean = js.native
}
object SortField {
  
  @scala.inline
  def apply(Field: Double, FieldType: SortFieldType, SortAscending: Boolean): SortField = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  
  @scala.inline
  implicit class SortFieldOps[Self <: SortField] (val x: Self) extends AnyVal {
    
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
    def setField(value: Double): Self = this.set("Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: SortFieldType): Self = this.set("FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = this.set("SortAscending", value.asInstanceOf[js.Any])
  }
}
