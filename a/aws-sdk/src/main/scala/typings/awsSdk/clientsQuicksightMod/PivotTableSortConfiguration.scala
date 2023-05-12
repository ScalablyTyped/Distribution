package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableSortConfiguration extends StObject {
  
  /**
    * The field sort options for a pivot table sort configuration.
    */
  var FieldSortOptions: js.UndefOr[PivotFieldSortOptionsList] = js.undefined
}
object PivotTableSortConfiguration {
  
  inline def apply(): PivotTableSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFieldSortOptions(value: PivotFieldSortOptionsList): Self = StObject.set(x, "FieldSortOptions", value.asInstanceOf[js.Any])
    
    inline def setFieldSortOptionsUndefined: Self = StObject.set(x, "FieldSortOptions", js.undefined)
    
    inline def setFieldSortOptionsVarargs(value: PivotFieldSortOptions*): Self = StObject.set(x, "FieldSortOptions", js.Array(value*))
  }
}
