package typings.awesomplete

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Label extends StObject {
    
    var label: String | js.Any = js.native
    
    var value: String | js.Any = js.native
  }
  object Label {
    
    @scala.inline
    def apply(label: String | js.Any, value: String | js.Any): Label = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Label]
    }
    
    @scala.inline
    implicit class LabelMutableBuilder[Self <: Label] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String | js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String | js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Replace extends StObject {
    
    def replace(arg0: RegExp, arg1: String): Unit = js.native
  }
  object Replace {
    
    @scala.inline
    def apply(replace: (RegExp, String) => Unit): Replace = {
      val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
      __obj.asInstanceOf[Replace]
    }
    
    @scala.inline
    implicit class ReplaceMutableBuilder[Self <: Replace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReplace(value: (RegExp, String) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Value extends StObject {
    
    var label: String = js.native
    
    var value: js.Any = js.native
  }
  object Value {
    
    @scala.inline
    def apply(label: String, value: js.Any): Value = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
