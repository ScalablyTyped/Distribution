package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureTableSelectionChangeEvent extends StObject {
  
  var added: js.Array[FeatureTableSelectionChangeEventAdded]
  
  var removed: js.Array[FeatureTableSelectionChangeEventRemoved]
}
object FeatureTableSelectionChangeEvent {
  
  @scala.inline
  def apply(
    added: js.Array[FeatureTableSelectionChangeEventAdded],
    removed: js.Array[FeatureTableSelectionChangeEventRemoved]
  ): FeatureTableSelectionChangeEvent = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureTableSelectionChangeEvent]
  }
  
  @scala.inline
  implicit class FeatureTableSelectionChangeEventMutableBuilder[Self <: FeatureTableSelectionChangeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdded(value: js.Array[FeatureTableSelectionChangeEventAdded]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddedVarargs(value: FeatureTableSelectionChangeEventAdded*): Self = StObject.set(x, "added", js.Array(value :_*))
    
    @scala.inline
    def setRemoved(value: js.Array[FeatureTableSelectionChangeEventRemoved]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemovedVarargs(value: FeatureTableSelectionChangeEventRemoved*): Self = StObject.set(x, "removed", js.Array(value :_*))
  }
}
