package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotFieldSortOptions extends StObject {
  
  /**
    * The field ID for the field sort options.
    */
  var FieldId: typings.awsSdk.clientsQuicksightMod.FieldId
  
  /**
    * The sort by field for the field sort options.
    */
  var SortBy: PivotTableSortBy
}
object PivotFieldSortOptions {
  
  inline def apply(FieldId: FieldId, SortBy: PivotTableSortBy): PivotFieldSortOptions = {
    val __obj = js.Dynamic.literal(FieldId = FieldId.asInstanceOf[js.Any], SortBy = SortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotFieldSortOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotFieldSortOptions] (val x: Self) extends AnyVal {
    
    inline def setFieldId(value: FieldId): Self = StObject.set(x, "FieldId", value.asInstanceOf[js.Any])
    
    inline def setSortBy(value: PivotTableSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
  }
}
