package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnTooltipItem extends StObject {
  
  /**
    * The aggregation function of the column tooltip item.
    */
  var Aggregation: js.UndefOr[AggregationFunction] = js.undefined
  
  /**
    * The target column of the tooltip item.
    */
  var Column: ColumnIdentifier
  
  /**
    * The label of the tooltip item.
    */
  var Label: js.UndefOr[String] = js.undefined
  
  /**
    * The visibility of the tooltip item.
    */
  var Visibility: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Visibility] = js.undefined
}
object ColumnTooltipItem {
  
  inline def apply(Column: ColumnIdentifier): ColumnTooltipItem = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnTooltipItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnTooltipItem] (val x: Self) extends AnyVal {
    
    inline def setAggregation(value: AggregationFunction): Self = StObject.set(x, "Aggregation", value.asInstanceOf[js.Any])
    
    inline def setAggregationUndefined: Self = StObject.set(x, "Aggregation", js.undefined)
    
    inline def setColumn(value: ColumnIdentifier): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setVisibility(value: Visibility): Self = StObject.set(x, "Visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "Visibility", js.undefined)
  }
}
