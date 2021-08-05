package typings.awesomplete

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Label extends StObject {
    
    var label: String | js.Any
    
    var value: String | js.Any
  }
  object Label {
    
    inline def apply(label: String | js.Any, value: String | js.Any): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    extension [Self <: Label](x: Self) {
      
      inline def setLabel(value: String | js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Replace extends StObject {
    
    def replace(arg0: RegExp, arg1: String): Unit
  }
  object Replace {
    
    inline def apply(replace: (RegExp, String) => Unit): Replace = {
      val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
      __obj.asInstanceOf[Replace]
    }
    
    extension [Self <: Replace](x: Self) {
      
      inline def setReplace(value: (RegExp, String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    }
  }
  
  trait Value extends StObject {
    
    var label: String
    
    var value: js.Any
  }
  object Value {
    
    inline def apply(label: String, value: js.Any): Value = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
