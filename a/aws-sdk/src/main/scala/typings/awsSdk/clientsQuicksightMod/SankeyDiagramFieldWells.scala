package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyDiagramFieldWells extends StObject {
  
  /**
    * The field well configuration of a sankey diagram.
    */
  var SankeyDiagramAggregatedFieldWells: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SankeyDiagramAggregatedFieldWells] = js.undefined
}
object SankeyDiagramFieldWells {
  
  inline def apply(): SankeyDiagramFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyDiagramFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SankeyDiagramFieldWells] (val x: Self) extends AnyVal {
    
    inline def setSankeyDiagramAggregatedFieldWells(value: SankeyDiagramAggregatedFieldWells): Self = StObject.set(x, "SankeyDiagramAggregatedFieldWells", value.asInstanceOf[js.Any])
    
    inline def setSankeyDiagramAggregatedFieldWellsUndefined: Self = StObject.set(x, "SankeyDiagramAggregatedFieldWells", js.undefined)
  }
}
