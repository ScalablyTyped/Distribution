package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyDiagramAggregatedFieldWells extends StObject {
  
  /**
    * The destination field wells of a sankey diagram.
    */
  var Destination: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The source field wells of a sankey diagram.
    */
  var Source: js.UndefOr[DimensionFieldList] = js.undefined
  
  /**
    * The weight field wells of a sankey diagram.
    */
  var Weight: js.UndefOr[MeasureFieldList] = js.undefined
}
object SankeyDiagramAggregatedFieldWells {
  
  inline def apply(): SankeyDiagramAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyDiagramAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SankeyDiagramAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: DimensionFieldList): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setDestinationVarargs(value: DimensionField*): Self = StObject.set(x, "Destination", js.Array(value*))
    
    inline def setSource(value: DimensionFieldList): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setSourceVarargs(value: DimensionField*): Self = StObject.set(x, "Source", js.Array(value*))
    
    inline def setWeight(value: MeasureFieldList): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
    
    inline def setWeightVarargs(value: MeasureField*): Self = StObject.set(x, "Weight", js.Array(value*))
  }
}
