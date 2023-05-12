package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterOperationTargetVisualsConfiguration extends StObject {
  
  /**
    * The configuration of the same-sheet target visuals that you want to be filtered.
    */
  var SameSheetTargetVisualConfiguration: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SameSheetTargetVisualConfiguration] = js.undefined
}
object FilterOperationTargetVisualsConfiguration {
  
  inline def apply(): FilterOperationTargetVisualsConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOperationTargetVisualsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterOperationTargetVisualsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSameSheetTargetVisualConfiguration(value: SameSheetTargetVisualConfiguration): Self = StObject.set(x, "SameSheetTargetVisualConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSameSheetTargetVisualConfigurationUndefined: Self = StObject.set(x, "SameSheetTargetVisualConfiguration", js.undefined)
  }
}
