package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataSetSelectorMod {
  
  @JSImport("amcharts/DataSetSelector", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DataSetSelector {
    
    /**
      * Text displayed in the "compare to" combobox (when position is "top" or "bottom"). Select...
      */
    /* CompleteClass */
    var comboBoxSelectText: String = js.native
    
    /**
      * Text displayed near "compare to" list. Compare to:
      */
    /* CompleteClass */
    var compareText: String = js.native
    
    /**
      * The maximum height of the Compare to field in pixels.
      * @default 150
      */
    /* CompleteClass */
    var listHeight: Double = js.native
    
    /**
      * Possible values: "right", "left", "top", "bottom". "top" and "bottom" positions has a limitation -
      * only one data set can be selected for comparing.
      * @default "left"
      */
    /* CompleteClass */
    var position: String = js.native
    
    /**
      * Text displayed near "Select" dropDown. Select:
      */
    /* CompleteClass */
    var selectText: String = js.native
    
    /**
      * Width of a Data set selector, when position is "left" or "right".
      * @default 180
      */
    /* CompleteClass */
    var width: Double = js.native
  }
  
  trait DataSetSelector extends StObject {
    
    /**
      * Text displayed in the "compare to" combobox (when position is "top" or "bottom"). Select...
      */
    var comboBoxSelectText: String
    
    /**
      * Text displayed near "compare to" list. Compare to:
      */
    var compareText: String
    
    /**
      * The maximum height of the Compare to field in pixels.
      * @default 150
      */
    var listHeight: Double
    
    /**
      * Possible values: "right", "left", "top", "bottom". "top" and "bottom" positions has a limitation -
      * only one data set can be selected for comparing.
      * @default "left"
      */
    var position: String
    
    /**
      * Text displayed near "Select" dropDown. Select:
      */
    var selectText: String
    
    /**
      * Width of a Data set selector, when position is "left" or "right".
      * @default 180
      */
    var width: Double
  }
  object DataSetSelector {
    
    inline def apply(
      comboBoxSelectText: String,
      compareText: String,
      listHeight: Double,
      position: String,
      selectText: String,
      width: Double
    ): DataSetSelector = {
      val __obj = js.Dynamic.literal(comboBoxSelectText = comboBoxSelectText.asInstanceOf[js.Any], compareText = compareText.asInstanceOf[js.Any], listHeight = listHeight.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], selectText = selectText.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataSetSelector]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataSetSelector] (val x: Self) extends AnyVal {
      
      inline def setComboBoxSelectText(value: String): Self = StObject.set(x, "comboBoxSelectText", value.asInstanceOf[js.Any])
      
      inline def setCompareText(value: String): Self = StObject.set(x, "compareText", value.asInstanceOf[js.Any])
      
      inline def setListHeight(value: Double): Self = StObject.set(x, "listHeight", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setSelectText(value: String): Self = StObject.set(x, "selectText", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
