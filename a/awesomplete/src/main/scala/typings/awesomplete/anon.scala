package typings.awesomplete

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Label extends StObject {
    
    var label: String
    
    var value: Any
  }
  object Label {
    
    inline def apply(label: String, value: Any): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Replace extends StObject {
    
    def replace(arg0: js.RegExp, arg1: String): Unit
  }
  object Replace {
    
    inline def apply(replace: (js.RegExp, String) => Unit): Replace = {
      val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
      __obj.asInstanceOf[Replace]
    }
    
    extension [Self <: Replace](x: Self) {
      
      inline def setReplace(value: (js.RegExp, String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    }
  }
  
  trait Value extends StObject {
    
    var label: String | Any
    
    var value: String | Any
  }
  object Value {
    
    inline def apply(label: String | Any, value: String | Any): Value = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setLabel(value: String | Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
