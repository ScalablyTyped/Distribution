package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeospatialMapFieldWells extends StObject {
  
  /**
    * The aggregated field well for a geospatial map.
    */
  var GeospatialMapAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GeospatialMapAggregatedFieldWells] = js.undefined
}
object GeospatialMapFieldWells {
  
  inline def apply(): GeospatialMapFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeospatialMapFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeospatialMapFieldWells] (val x: Self) extends AnyVal {
    
    inline def setGeospatialMapAggregatedFieldWells(value: GeospatialMapAggregatedFieldWells): Self = StObject.set(x, "GeospatialMapAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setGeospatialMapAggregatedFieldWellsUndefined: Self = StObject.set(x, "GeospatialMapAggregatedFieldWells", js.undefined)
  }
}
