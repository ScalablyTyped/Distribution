package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistogramFieldWells extends StObject {
  
  /**
    * The field well configuration of a histogram.
    */
  var HistogramAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HistogramAggregatedFieldWells] = js.undefined
}
object HistogramFieldWells {
  
  inline def apply(): HistogramFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistogramFieldWells] (val x: Self) extends AnyVal {
    
    inline def setHistogramAggregatedFieldWells(value: HistogramAggregatedFieldWells): Self = StObject.set(x, "HistogramAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setHistogramAggregatedFieldWellsUndefined: Self = StObject.set(x, "HistogramAggregatedFieldWells", js.undefined)
  }
}
