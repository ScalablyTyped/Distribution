package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WordCloudAggregatedFieldWells extends StObject {
  
  /**
    * The group by field well of a word cloud. Values are grouped by group by fields.
    */
  var GroupBy: js.UndefOr[WordCloudDimensionFieldList] = js.undefined
  
  /**
    * The size field well of a word cloud. Values are aggregated based on group by fields.
    */
  var Size: js.UndefOr[WordCloudMeasureFieldList] = js.undefined
}
object WordCloudAggregatedFieldWells {
  
  inline def apply(): WordCloudAggregatedFieldWells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordCloudAggregatedFieldWells]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WordCloudAggregatedFieldWells] (val x: Self) extends AnyVal {
    
    inline def setGroupBy(value: WordCloudDimensionFieldList): Self = StObject.set(x, "GroupBy", value.asInstanceOf[js.Any])
    
    inline def setGroupByUndefined: Self = StObject.set(x, "GroupBy", js.undefined)
    
    inline def setGroupByVarargs(value: DimensionField*): Self = StObject.set(x, "GroupBy", js.Array(value*))
    
    inline def setSize(value: WordCloudMeasureFieldList): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
    
    inline def setSizeVarargs(value: MeasureField*): Self = StObject.set(x, "Size", js.Array(value*))
  }
}
