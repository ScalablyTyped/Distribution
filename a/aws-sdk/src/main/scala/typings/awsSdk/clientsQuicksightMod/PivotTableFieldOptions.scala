package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableFieldOptions extends StObject {
  
  /**
    * The data path options for the pivot table field options.
    */
  var DataPathOptions: js.UndefOr[PivotTableDataPathOptionList] = js.undefined
  
  /**
    * The selected field options for the pivot table field options.
    */
  var SelectedFieldOptions: js.UndefOr[PivotTableFieldOptionList] = js.undefined
}
object PivotTableFieldOptions {
  
  inline def apply(): PivotTableFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableFieldOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableFieldOptions] (val x: Self) extends AnyVal {
    
    inline def setDataPathOptions(value: PivotTableDataPathOptionList): Self = StObject.set(x, "DataPathOptions", value.asInstanceOf[js.Any])
    
    inline def setDataPathOptionsUndefined: Self = StObject.set(x, "DataPathOptions", js.undefined)
    
    inline def setDataPathOptionsVarargs(value: PivotTableDataPathOption*): Self = StObject.set(x, "DataPathOptions", js.Array(value*))
    
    inline def setSelectedFieldOptions(value: PivotTableFieldOptionList): Self = StObject.set(x, "SelectedFieldOptions", value.asInstanceOf[js.Any])
    
    inline def setSelectedFieldOptionsUndefined: Self = StObject.set(x, "SelectedFieldOptions", js.undefined)
    
    inline def setSelectedFieldOptionsVarargs(value: PivotTableFieldOption*): Self = StObject.set(x, "SelectedFieldOptions", js.Array(value*))
  }
}
