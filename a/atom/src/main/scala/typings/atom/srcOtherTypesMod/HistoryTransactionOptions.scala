package typings.atom.srcOtherTypesMod

import typings.atom.dependenciesTextBufferSrcMarkerLayerMod.MarkerLayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryTransactionOptions extends StObject {
  
  /** When provided, skip taking snapshot for other selections markerLayers except given one. */
  var selectionsMarkerLayer: js.UndefOr[MarkerLayer] = js.undefined
}
object HistoryTransactionOptions {
  
  inline def apply(): HistoryTransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryTransactionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryTransactionOptions] (val x: Self) extends AnyVal {
    
    inline def setSelectionsMarkerLayer(value: MarkerLayer): Self = StObject.set(x, "selectionsMarkerLayer", value.asInstanceOf[js.Any])
    
    inline def setSelectionsMarkerLayerUndefined: Self = StObject.set(x, "selectionsMarkerLayer", js.undefined)
  }
}
