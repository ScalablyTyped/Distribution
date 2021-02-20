package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single field in a sort descriptor.
  * @deprecated Deprecated
  */
@js.native
trait SortField extends StObject {
  
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
  implicit class SortFieldMutableBuilder[Self <: SortField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: Double): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: SortFieldType): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
  }
}
