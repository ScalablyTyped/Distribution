package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryTraversalOptions extends StObject {
  
  /** Restore snapshot of selections marker layer to given selectionsMarkerLayer. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.undefined
}
object HistoryTraversalOptions {
  
  @scala.inline
  def apply(): HistoryTraversalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryTraversalOptions]
  }
  
  @scala.inline
  implicit class HistoryTraversalOptionsMutableBuilder[Self <: HistoryTraversalOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectionsMarkerLayer(value: MarkerLayer): Self = StObject.set(x, "selectionsMarkerLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsMarkerLayerUndefined: Self = StObject.set(x, "selectionsMarkerLayer", js.undefined)
  }
}
