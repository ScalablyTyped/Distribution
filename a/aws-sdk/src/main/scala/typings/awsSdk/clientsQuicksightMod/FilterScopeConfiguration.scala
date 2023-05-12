package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterScopeConfiguration extends StObject {
  
  /**
    * The configuration for applying a filter to specific sheets.
    */
  var SelectedSheets: js.UndefOr[SelectedSheetsFilterScopeConfiguration] = js.undefined
}
object FilterScopeConfiguration {
  
  inline def apply(): FilterScopeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterScopeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterScopeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSelectedSheets(value: SelectedSheetsFilterScopeConfiguration): Self = StObject.set(x, "SelectedSheets", value.asInstanceOf[js.Any])
    
    inline def setSelectedSheetsUndefined: Self = StObject.set(x, "SelectedSheets", js.undefined)
  }
}
