package typings.activexLibreoffice.com_.sun.star.util

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a single field in a sort descriptor.
  * @deprecated Deprecated
  */
trait SortField extends StObject {
  
  /** index of the field in the table; 0-based. */
  var Field: Double
  
  /** type of contents in the field. */
  var FieldType: SortFieldType
  
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var SortAscending: Boolean
}
object SortField {
  
  inline def apply(Field: Double, FieldType: SortFieldType, SortAscending: Boolean): SortField = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  
  extension [Self <: SortField](x: Self) {
    
    inline def setField(value: Double): Self = StObject.set(x, "Field", value.asInstanceOf[js.Any])
    
    inline def setFieldType(value: SortFieldType): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
  }
}
