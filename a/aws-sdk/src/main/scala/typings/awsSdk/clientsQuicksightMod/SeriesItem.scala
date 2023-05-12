package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesItem extends StObject {
  
  /**
    * The data field series item configuration of a line chart.
    */
  var DataFieldSeriesItem: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataFieldSeriesItem] = js.undefined
  
  /**
    * The field series item configuration of a line chart.
    */
  var FieldSeriesItem: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FieldSeriesItem] = js.undefined
}
object SeriesItem {
  
  inline def apply(): SeriesItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SeriesItem] (val x: Self) extends AnyVal {
    
    inline def setDataFieldSeriesItem(value: DataFieldSeriesItem): Self = StObject.set(x, "DataFieldSeriesItem", value.asInstanceOf[js.Any])
    
    inline def setDataFieldSeriesItemUndefined: Self = StObject.set(x, "DataFieldSeriesItem", js.undefined)
    
    inline def setFieldSeriesItem(value: FieldSeriesItem): Self = StObject.set(x, "FieldSeriesItem", value.asInstanceOf[js.Any])
    
    inline def setFieldSeriesItemUndefined: Self = StObject.set(x, "FieldSeriesItem", js.undefined)
  }
}
