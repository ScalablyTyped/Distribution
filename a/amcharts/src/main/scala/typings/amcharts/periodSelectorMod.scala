package typings.amcharts

import typings.amcharts.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object periodSelectorMod {
  
  @JSImport("amcharts/PeriodSelector", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with PeriodSelector {
    
    /**
      * Adds event listener to the object.
      * @param handler - Dispatched when dates in period selector input fields are changed or
      * user clicks on one of the predefined period buttons.
      */
    /* CompleteClass */
    override def addListener(`type`: String, handler: js.Function1[/* e */ Count, Unit]): Unit = js.native
    
    /**
      * Date format of date input fields.
      * Check [[http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/mx/formatters/DateFormatter.html
      * @default "DD-MM-YYYY"
      */
    /* CompleteClass */
    var dateFormat: String = js.native
    
    /**
      * Text displayed next to "from" date input field. From:
      */
    /* CompleteClass */
    var fromText: String = js.native
    
    /**
      * Specifies if period buttons with date range bigger than available data should be hidden.
      * @default true
      */
    /* CompleteClass */
    var hideOutOfScopePeriods: Boolean = js.native
    
    /**
      * Width of date input fields, in pixels. Works only if period selector is horizontal.
      * @default 100
      */
    /* CompleteClass */
    var inputFieldWidth: Double = js.native
    
    /**
      * Specifies whether period selector displays "from" and "to" date input fields.
      * @default true
      */
    /* CompleteClass */
    var inputFieldsEnabled: Boolean = js.native
    
    /**
      * Array of predefined period objects. Period object has 4 properties - period, count, label and selected.
      * Possible period values are:
      * "ss" - seconds,
      * "mm" - minutes,
      * "hh" - hours,
      * "DD" - days,
      * "MM" - months,
      * "YYYY" - years.
      * Property "count" specifies how many periods this button will select.
      * "label" will be displayed on a button.
      * "selected" is a boolean which specifies if this button is selected when chart is initialized or not.
      * Example: {period:"DD", count:10, label:"10 days", selected:false}.
      */
    /* CompleteClass */
    var periods: js.Array[Any] = js.native
    
    /**
      * Text displayed next to predefined period buttons. Zoom:
      */
    /* CompleteClass */
    var periodsText: String = js.native
    
    /**
      * Possible values: "right", "left", "top", "bottom". bottom
      */
    /* CompleteClass */
    var position: String = js.native
    
    /**
      * Removes event listener from chart object.
      */
    /* CompleteClass */
    override def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: Any): Unit = js.native
    
    /**
      * Specifies whether predefined period buttons should select a period from the beginning or the end of the data.
      */
    /* CompleteClass */
    var selectFromStart: Boolean = js.native
    
    /**
      * Text displayed next to "to" date input field. To:
      */
    /* CompleteClass */
    var toText: String = js.native
    
    /**
      * Width of a period selector, when position is "left" or "right".
      * @default 180
      */
    /* CompleteClass */
    var width: Double = js.native
  }
  
  trait PeriodSelector extends StObject {
    
    /**
      * Adds event listener to the object.
      * @param handler - Dispatched when dates in period selector input fields are changed or
      * user clicks on one of the predefined period buttons.
      */
    def addListener(`type`: String, handler: js.Function1[/* e */ Count, Unit]): Unit
    
    /**
      * Date format of date input fields.
      * Check [[http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/mx/formatters/DateFormatter.html
      * @default "DD-MM-YYYY"
      */
    var dateFormat: String
    
    /**
      * Text displayed next to "from" date input field. From:
      */
    var fromText: String
    
    /**
      * Specifies if period buttons with date range bigger than available data should be hidden.
      * @default true
      */
    var hideOutOfScopePeriods: Boolean
    
    /**
      * Width of date input fields, in pixels. Works only if period selector is horizontal.
      * @default 100
      */
    var inputFieldWidth: Double
    
    /**
      * Specifies whether period selector displays "from" and "to" date input fields.
      * @default true
      */
    var inputFieldsEnabled: Boolean
    
    /**
      * Array of predefined period objects. Period object has 4 properties - period, count, label and selected.
      * Possible period values are:
      * "ss" - seconds,
      * "mm" - minutes,
      * "hh" - hours,
      * "DD" - days,
      * "MM" - months,
      * "YYYY" - years.
      * Property "count" specifies how many periods this button will select.
      * "label" will be displayed on a button.
      * "selected" is a boolean which specifies if this button is selected when chart is initialized or not.
      * Example: {period:"DD", count:10, label:"10 days", selected:false}.
      */
    var periods: js.Array[Any]
    
    /**
      * Text displayed next to predefined period buttons. Zoom:
      */
    var periodsText: String
    
    /**
      * Possible values: "right", "left", "top", "bottom". bottom
      */
    var position: String
    
    /**
      * Removes event listener from chart object.
      */
    def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: Any): Unit
    
    /**
      * Specifies whether predefined period buttons should select a period from the beginning or the end of the data.
      */
    var selectFromStart: Boolean
    
    /**
      * Text displayed next to "to" date input field. To:
      */
    var toText: String
    
    /**
      * Width of a period selector, when position is "left" or "right".
      * @default 180
      */
    var width: Double
  }
  object PeriodSelector {
    
    inline def apply(
      addListener: (String, js.Function1[/* e */ Count, Unit]) => Unit,
      dateFormat: String,
      fromText: String,
      hideOutOfScopePeriods: Boolean,
      inputFieldWidth: Double,
      inputFieldsEnabled: Boolean,
      periods: js.Array[Any],
      periodsText: String,
      position: String,
      removeListener: (typings.amcharts.amChartMod.default, String, Any) => Unit,
      selectFromStart: Boolean,
      toText: String,
      width: Double
    ): PeriodSelector = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), dateFormat = dateFormat.asInstanceOf[js.Any], fromText = fromText.asInstanceOf[js.Any], hideOutOfScopePeriods = hideOutOfScopePeriods.asInstanceOf[js.Any], inputFieldWidth = inputFieldWidth.asInstanceOf[js.Any], inputFieldsEnabled = inputFieldsEnabled.asInstanceOf[js.Any], periods = periods.asInstanceOf[js.Any], periodsText = periodsText.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), selectFromStart = selectFromStart.asInstanceOf[js.Any], toText = toText.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeriodSelector]
    }
    
    extension [Self <: PeriodSelector](x: Self) {
      
      inline def setAddListener(value: (String, js.Function1[/* e */ Count, Unit]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setFromText(value: String): Self = StObject.set(x, "fromText", value.asInstanceOf[js.Any])
      
      inline def setHideOutOfScopePeriods(value: Boolean): Self = StObject.set(x, "hideOutOfScopePeriods", value.asInstanceOf[js.Any])
      
      inline def setInputFieldWidth(value: Double): Self = StObject.set(x, "inputFieldWidth", value.asInstanceOf[js.Any])
      
      inline def setInputFieldsEnabled(value: Boolean): Self = StObject.set(x, "inputFieldsEnabled", value.asInstanceOf[js.Any])
      
      inline def setPeriods(value: js.Array[Any]): Self = StObject.set(x, "periods", value.asInstanceOf[js.Any])
      
      inline def setPeriodsText(value: String): Self = StObject.set(x, "periodsText", value.asInstanceOf[js.Any])
      
      inline def setPeriodsVarargs(value: Any*): Self = StObject.set(x, "periods", js.Array(value*))
      
      inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: (typings.amcharts.amChartMod.default, String, Any) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      inline def setSelectFromStart(value: Boolean): Self = StObject.set(x, "selectFromStart", value.asInstanceOf[js.Any])
      
      inline def setToText(value: String): Self = StObject.set(x, "toText", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
