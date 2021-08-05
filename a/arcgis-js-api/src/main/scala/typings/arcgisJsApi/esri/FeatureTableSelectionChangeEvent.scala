package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableSelectionChangeEvent extends StObject {
  
  var added: js.Array[FeatureTableSelectionChangeEventAdded]
  
  var removed: js.Array[FeatureTableSelectionChangeEventRemoved]
}
object FeatureTableSelectionChangeEvent {
  
  inline def apply(
    added: js.Array[FeatureTableSelectionChangeEventAdded],
    removed: js.Array[FeatureTableSelectionChangeEventRemoved]
  ): FeatureTableSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEvent]
  }
  
  extension [Self <: FeatureTableSelectionChangeEvent](x: Self) {
    
    inline def setAdded(value: js.Array[FeatureTableSelectionChangeEventAdded]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    inline def setAddedVarargs(value: FeatureTableSelectionChangeEventAdded*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    inline def setRemoved(value: js.Array[FeatureTableSelectionChangeEventRemoved]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    inline def setRemovedVarargs(value: FeatureTableSelectionChangeEventRemoved*): Self = StObject.set(x, "removed", js.Array(value :_*))
  }
}
