package typings.antdMobileRn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSegmentedControlPropsTypeMod {
  
  trait SegmentedControlPropsType extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* e */ Any, Unit]] = js.undefined
    
    var onValueChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
    
    var values: js.UndefOr[js.Array[String]] = js.undefined
  }
  object SegmentedControlPropsType {
    
    inline def apply(): SegmentedControlPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentedControlPropsType]
    }
    
    extension [Self <: SegmentedControlPropsType](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setOnChange(value: /* e */ Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnValueChange(value: /* value */ String => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
      
      inline def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
      
      inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
