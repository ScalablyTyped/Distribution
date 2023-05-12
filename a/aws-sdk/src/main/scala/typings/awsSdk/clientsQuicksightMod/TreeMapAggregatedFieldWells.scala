package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeMapAggregatedFieldWells extends StObject {
  
  /**
    * The color field well of a tree map. Values are grouped by aggregations based on group by fields.
    */
  var Colors: js.UndefOr[TreeMapMeasureFieldList] = js.undefined
  
  /**
    * The group by field well of a tree map. Values are grouped based on group by fields.
    */
  var Groups: js.UndefOr[TreeMapDimensionFieldList] = js.undefined
  
  /**
    * The size field well of a tree map. Values are aggregated based on group by fields.
    */
  var Sizes: js.UndefOr[TreeMapMeasureFieldList] = js.undefined
}
object TreeMapAggregatedFieldWells {
  
  inline def apply(): TreeMapAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeMapAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeMapAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setColors(value: TreeMapMeasureFieldList): Self = StObject.set(x, "Colors", value.asInstanceOf[js.Any])
    
    inline def setColorsUndefined: Self = StObject.set(x, "Colors", js.undefined)
    
    inline def setColorsVarargs(value: MeasureField*): Self = StObject.set(x, "Colors", js.Array(value*))
    
    inline def setGroups(value: TreeMapDimensionFieldList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: DimensionField*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setSizes(value: TreeMapMeasureFieldList): Self = StObject.set(x, "Sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesUndefined: Self = StObject.set(x, "Sizes", js.undefined)
    
    inline def setSizesVarargs(value: MeasureField*): Self = StObject.set(x, "Sizes", js.Array(value*))
  }
}
