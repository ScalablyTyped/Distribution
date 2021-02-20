package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSetMod {
  
  @JSImport("amcharts/DataSet", JSImport.Default)
  @js.native
  class default () extends DataSet
  
  @js.native
  trait DataSet extends StObject {
    
    /**
      * Category field name in your dataProvider.
      */
    var categoryField: String = js.native
    
    /**
      * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
      */
    var color: String = js.native
    
    /**
      * Whether this data set is selected for comparing.
      * If you change this property, you should call stockChart.validateData() method
      * in order the changes to be applied.
      */
    var compared: Boolean = js.native
    
    /**
      * Data provider of the data set.
      */
    var dataProvider: js.Array[_] = js.native
    
    /**
      * Array of field mappings. Field mapping is an object with fromField and toField properties.
      * fromField is a name of your value field in dataProvider.
      * toField might be chosen freely, it will be used to set value/open/close/high/low fields for the StockGraph.
      * Example: {fromField:"val1", toField:"value"}.
      */
    var fieldMappings: js.Array[_] = js.native
    
    /**
      * Specifies whether this data set should be visible in "compare to" list.
      * @default true
      */
    var showInCompare: Boolean = js.native
    
    /**
      * Specifies whether this data set should be visible in "select" dropdown.
      * @default true
      */
    var showInSelect: Boolean = js.native
    
    /**
      * Array of StockEvent objects.
      */
    var stockEvents: js.Array[typings.amcharts.stockEventMod.default] = js.native
    
    /**
      * DataSet title.
      */
    var title: String = js.native
  }
  object DataSet {
    
    @scala.inline
    def apply(
      categoryField: String,
      color: String,
      compared: Boolean,
      dataProvider: js.Array[_],
      fieldMappings: js.Array[_],
      showInCompare: Boolean,
      showInSelect: Boolean,
      stockEvents: js.Array[typings.amcharts.stockEventMod.default],
      title: String
    ): DataSet = {
      val __obj = js.Dynamic.literal(categoryField = categoryField.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], compared = compared.asInstanceOf[js.Any], dataProvider = dataProvider.asInstanceOf[js.Any], fieldMappings = fieldMappings.asInstanceOf[js.Any], showInCompare = showInCompare.asInstanceOf[js.Any], showInSelect = showInSelect.asInstanceOf[js.Any], stockEvents = stockEvents.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSet]
    }
    
    @scala.inline
    implicit class DataSetMutableBuilder[Self <: DataSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategoryField(value: String): Self = StObject.set(x, "categoryField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompared(value: Boolean): Self = StObject.set(x, "compared", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataProvider(value: js.Array[_]): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataProviderVarargs(value: js.Any*): Self = StObject.set(x, "dataProvider", js.Array(value :_*))
      
      @scala.inline
      def setFieldMappings(value: js.Array[_]): Self = StObject.set(x, "fieldMappings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldMappingsVarargs(value: js.Any*): Self = StObject.set(x, "fieldMappings", js.Array(value :_*))
      
      @scala.inline
      def setShowInCompare(value: Boolean): Self = StObject.set(x, "showInCompare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowInSelect(value: Boolean): Self = StObject.set(x, "showInSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStockEvents(value: js.Array[typings.amcharts.stockEventMod.default]): Self = StObject.set(x, "stockEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStockEventsVarargs(value: typings.amcharts.stockEventMod.default*): Self = StObject.set(x, "stockEvents", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
