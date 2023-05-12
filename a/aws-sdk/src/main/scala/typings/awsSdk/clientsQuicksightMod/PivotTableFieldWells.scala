package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTableFieldWells extends StObject {
  
  /**
    * The aggregated field well for the pivot table.
    */
  var PivotTableAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PivotTableAggregatedFieldWells] = js.undefined
}
object PivotTableFieldWells {
  
  inline def apply(): PivotTableFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotTableFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PivotTableFieldWells] (val x: Self) extends AnyVal {
    
    inline def setPivotTableAggregatedFieldWells(value: PivotTableAggregatedFieldWells): Self = StObject.set(x, "PivotTableAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setPivotTableAggregatedFieldWellsUndefined: Self = StObject.set(x, "PivotTableAggregatedFieldWells", js.undefined)
  }
}
