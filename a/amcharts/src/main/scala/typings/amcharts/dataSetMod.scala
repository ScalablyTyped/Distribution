package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSetMod {
  
  @JSImport("amcharts/DataSet", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with DataSet {
    
    /**
      * Category field name in your dataProvider.
      */
    /* CompleteClass */
    var categoryField: String = js.native
    
    /**
      * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Whether this data set is selected for comparing.
      * If you change this property, you should call stockChart.validateData() method
      * in order the changes to be applied.
      */
    /* CompleteClass */
    var compared: Boolean = js.native
    
    /**
      * Data provider of the data set.
      */
    /* CompleteClass */
    var dataProvider: js.Array[js.Any] = js.native
    
    /**
      * Array of field mappings. Field mapping is an object with fromField and toField properties.
      * fromField is a name of your value field in dataProvider.
      * toField might be chosen freely, it will be used to set value/open/close/high/low fields for the StockGraph.
      * Example: {fromField:"val1", toField:"value"}.
      */
    /* CompleteClass */
    var fieldMappings: js.Array[js.Any] = js.native
    
    /**
      * Specifies whether this data set should be visible in "compare to" list.
      * @default true
      */
    /* CompleteClass */
    var showInCompare: Boolean = js.native
    
    /**
      * Specifies whether this data set should be visible in "select" dropdown.
      * @default true
      */
    /* CompleteClass */
    var showInSelect: Boolean = js.native
    
    /**
      * Array of StockEvent objects.
      */
    /* CompleteClass */
    var stockEvents: js.Array[typings.amcharts.stockEventMod.default] = js.native
    
    /**
      * DataSet title.
      */
    /* CompleteClass */
    var title: String = js.native
  }
  
  trait DataSet extends StObject {
    
    /**
      * Category field name in your dataProvider.
      */
    var categoryField: String
    
    /**
      * Color of the data set. One of colors from AmStockChart.colors array will be used if not set.
      */
    var color: String
    
    /**
      * Whether this data set is selected for comparing.
      * If you change this property, you should call stockChart.validateData() method
      * in order the changes to be applied.
      */
    var compared: Boolean
    
    /**
      * Data provider of the data set.
      */
    var dataProvider: js.Array[js.Any]
    
    /**
      * Array of field mappings. Field mapping is an object with fromField and toField properties.
      * fromField is a name of your value field in dataProvider.
      * toField might be chosen freely, it will be used to set value/open/close/high/low fields for the StockGraph.
      * Example: {fromField:"val1", toField:"value"}.
      */
    var fieldMappings: js.Array[js.Any]
    
    /**
      * Specifies whether this data set should be visible in "compare to" list.
      * @default true
      */
    var showInCompare: Boolean
    
    /**
      * Specifies whether this data set should be visible in "select" dropdown.
      * @default true
      */
    var showInSelect: Boolean
    
    /**
      * Array of StockEvent objects.
      */
    var stockEvents: js.Array[typings.amcharts.stockEventMod.default]
    
    /**
      * DataSet title.
      */
    var title: String
  }
  object DataSet {
    
    inline def apply(
      categoryField: String,
      color: String,
      compared: Boolean,
      dataProvider: js.Array[js.Any],
      fieldMappings: js.Array[js.Any],
      showInCompare: Boolean,
      showInSelect: Boolean,
      stockEvents: js.Array[typings.amcharts.stockEventMod.default],
      title: String
    ): DataSet = {
      val __obj = js.Dynamic.literal(categoryField = categoryField.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], compared = compared.asInstanceOf[js.Any], dataProvider = dataProvider.asInstanceOf[js.Any], fieldMappings = fieldMappings.asInstanceOf[js.Any], showInCompare = showInCompare.asInstanceOf[js.Any], showInSelect = showInSelect.asInstanceOf[js.Any], stockEvents = stockEvents.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSet]
    }
    
    extension [Self <: DataSet](x: Self) {
      
      inline def setCategoryField(value: String): Self = StObject.set(x, "categoryField", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setCompared(value: Boolean): Self = StObject.set(x, "compared", value.asInstanceOf[js.Any])
      
      inline def setDataProvider(value: js.Array[js.Any]): Self = StObject.set(x, "dataProvider", value.asInstanceOf[js.Any])
      
      inline def setDataProviderVarargs(value: js.Any*): Self = StObject.set(x, "dataProvider", js.Array(value :_*))
      
      inline def setFieldMappings(value: js.Array[js.Any]): Self = StObject.set(x, "fieldMappings", value.asInstanceOf[js.Any])
      
      inline def setFieldMappingsVarargs(value: js.Any*): Self = StObject.set(x, "fieldMappings", js.Array(value :_*))
      
      inline def setShowInCompare(value: Boolean): Self = StObject.set(x, "showInCompare", value.asInstanceOf[js.Any])
      
      inline def setShowInSelect(value: Boolean): Self = StObject.set(x, "showInSelect", value.asInstanceOf[js.Any])
      
      inline def setStockEvents(value: js.Array[typings.amcharts.stockEventMod.default]): Self = StObject.set(x, "stockEvents", value.asInstanceOf[js.Any])
      
      inline def setStockEventsVarargs(value: typings.amcharts.stockEventMod.default*): Self = StObject.set(x, "stockEvents", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
