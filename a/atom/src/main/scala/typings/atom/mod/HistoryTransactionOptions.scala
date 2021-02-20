package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryTransactionOptions extends StObject {
  
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.native
}
object HistoryTransactionOptions {
  
  @scala.inline
  def apply(): HistoryTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryTransactionOptions]
  }
  
  @scala.inline
  implicit class HistoryTransactionOptionsMutableBuilder[Self <: HistoryTransactionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSelectionsMarkerLayer(value: MarkerLayer): Self = StObject.set(x, "selectionsMarkerLayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsMarkerLayerUndefined: Self = StObject.set(x, "selectionsMarkerLayer", js.undefined)
  }
}
