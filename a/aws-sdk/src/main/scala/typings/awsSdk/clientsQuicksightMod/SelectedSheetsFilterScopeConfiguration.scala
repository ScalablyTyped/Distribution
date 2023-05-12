package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedSheetsFilterScopeConfiguration extends StObject {
  
  /**
    * The sheet ID and visual IDs of the sheet and visuals that the filter is applied to.
    */
  var SheetVisualScopingConfigurations: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SheetVisualScopingConfigurations] = js.undefined
}
object SelectedSheetsFilterScopeConfiguration {
  
  inline def apply(): SelectedSheetsFilterScopeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedSheetsFilterScopeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedSheetsFilterScopeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSheetVisualScopingConfigurations(value: SheetVisualScopingConfigurations): Self = StObject.set(x, "SheetVisualScopingConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSheetVisualScopingConfigurationsUndefined: Self = StObject.set(x, "SheetVisualScopingConfigurations", js.undefined)
    
    inline def setSheetVisualScopingConfigurationsVarargs(value: SheetVisualScopingConfiguration*): Self = StObject.set(x, "SheetVisualScopingConfigurations", js.Array(value*))
  }
}
