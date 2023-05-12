package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SameSheetTargetVisualConfiguration extends StObject {
  
  /**
    * The options that choose the target visual in the same sheet. Valid values are defined as follows:    ALL_VISUALS: Applies the filter operation to all visuals in the same sheet.  
    */
  var TargetVisualOptions: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TargetVisualOptions] = js.undefined
  
  /**
    * A list of the target visual IDs that are located in the same sheet of the analysis.
    */
  var TargetVisuals: js.UndefOr[TargetVisualList] = js.undefined
}
object SameSheetTargetVisualConfiguration {
  
  inline def apply(): SameSheetTargetVisualConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SameSheetTargetVisualConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SameSheetTargetVisualConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTargetVisualOptions(value: TargetVisualOptions): Self = StObject.set(x, "TargetVisualOptions", value.asInstanceOf[js.Any])
    
    inline def setTargetVisualOptionsUndefined: Self = StObject.set(x, "TargetVisualOptions", js.undefined)
    
    inline def setTargetVisuals(value: TargetVisualList): Self = StObject.set(x, "TargetVisuals", value.asInstanceOf[js.Any])
    
    inline def setTargetVisualsUndefined: Self = StObject.set(x, "TargetVisuals", js.undefined)
    
    inline def setTargetVisualsVarargs(value: ShortRestrictiveResourceId*): Self = StObject.set(x, "TargetVisuals", js.Array(value*))
  }
}
