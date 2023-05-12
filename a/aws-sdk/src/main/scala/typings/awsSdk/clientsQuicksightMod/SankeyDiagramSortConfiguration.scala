package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SankeyDiagramSortConfiguration extends StObject {
  
  /**
    * The limit on the number of destination nodes that are displayed in a sankey diagram.
    */
  var DestinationItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The limit on the number of source nodes that are displayed in a sankey diagram.
    */
  var SourceItemsLimit: js.UndefOr[ItemsLimitConfiguration] = js.undefined
  
  /**
    * The sort configuration of the weight fields.
    */
  var WeightSort: js.UndefOr[FieldSortOptionsList] = js.undefined
}
object SankeyDiagramSortConfiguration {
  
  inline def apply(): SankeyDiagramSortConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SankeyDiagramSortConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SankeyDiagramSortConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDestinationItemsLimit(value: ItemsLimitConfiguration): Self = StObject.set(x, "DestinationItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setDestinationItemsLimitUndefined: Self = StObject.set(x, "DestinationItemsLimit", js.undefined)
    
    inline def setSourceItemsLimit(value: ItemsLimitConfiguration): Self = StObject.set(x, "SourceItemsLimit", value.asInstanceOf[js.Any])
    
    inline def setSourceItemsLimitUndefined: Self = StObject.set(x, "SourceItemsLimit", js.undefined)
    
    inline def setWeightSort(value: FieldSortOptionsList): Self = StObject.set(x, "WeightSort", value.asInstanceOf[js.Any])
    
    inline def setWeightSortUndefined: Self = StObject.set(x, "WeightSort", js.undefined)
    
    inline def setWeightSortVarargs(value: FieldSortOptions*): Self = StObject.set(x, "WeightSort", js.Array(value*))
  }
}
