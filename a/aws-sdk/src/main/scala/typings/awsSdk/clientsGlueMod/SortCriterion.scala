package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortCriterion extends StObject {
  
  /**
    * The name of the field on which to sort.
    */
  var FieldName: js.UndefOr[ValueString] = js.undefined
  
  /**
    * An ascending or descending sort.
    */
  var Sort: js.UndefOr[typings.awsSdk.clientsGlueMod.Sort] = js.undefined
}
object SortCriterion {
  
  inline def apply(): SortCriterion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortCriterion]
  }
  
  extension [Self <: SortCriterion](x: Self) {
    
    inline def setFieldName(value: ValueString): Self = StObject.set(x, "FieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "FieldName", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
  }
}
