package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SheetVisualScopingConfiguration extends StObject {
  
  /**
    * The scope of the applied entities. Choose one of the following options:    ALL_VISUALS     SELECTED_VISUALS   
    */
  var Scope: FilterVisualScope
  
  /**
    * The selected sheet that the filter is applied to.
    */
  var SheetId: ShortRestrictiveResourceId
  
  /**
    * The selected visuals that the filter is applied to.
    */
  var VisualIds: js.UndefOr[FilteredVisualsList] = js.undefined
}
object SheetVisualScopingConfiguration {
  
  inline def apply(Scope: FilterVisualScope, SheetId: ShortRestrictiveResourceId): SheetVisualScopingConfiguration = {
    val __obj = js.Dynamic.literal(Scope = Scope.asInstanceOf[js.Any], SheetId = SheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SheetVisualScopingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SheetVisualScopingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setScope(value: FilterVisualScope): Self = StObject.set(x, "Scope", value.asInstanceOf[js.Any])
    
    inline def setSheetId(value: ShortRestrictiveResourceId): Self = StObject.set(x, "SheetId", value.asInstanceOf[js.Any])
    
    inline def setVisualIds(value: FilteredVisualsList): Self = StObject.set(x, "VisualIds", value.asInstanceOf[js.Any])
    
    inline def setVisualIdsUndefined: Self = StObject.set(x, "VisualIds", js.undefined)
    
    inline def setVisualIdsVarargs(value: ShortRestrictiveResourceId*): Self = StObject.set(x, "VisualIds", js.Array(value*))
  }
}
