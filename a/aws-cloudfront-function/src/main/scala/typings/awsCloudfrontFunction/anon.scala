package typings.awsCloudfrontFunction

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attributes extends StObject {
    
    var attributes: String
    
    var value: String
  }
  object Attributes {
    
    inline def apply(attributes: String, value: String): Attributes = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait AttributesMultiValue extends StObject {
    
    var attributes: String
    
    var multiValue: js.UndefOr[js.Array[Attributes]] = js.undefined
    
    var value: String
  }
  object AttributesMultiValue {
    
    inline def apply(attributes: String, value: String): AttributesMultiValue = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributesMultiValue]
    }
    
    extension [Self <: AttributesMultiValue](x: Self) {
      
      inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setMultiValue(value: js.Array[Attributes]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
      
      inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
      
      inline def setMultiValueVarargs(value: Attributes*): Self = StObject.set(x, "multiValue", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiValue extends StObject {
    
    var multiValue: js.UndefOr[js.Array[Value]] = js.undefined
    
    var value: String
  }
  object MultiValue {
    
    inline def apply(value: String): MultiValue = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiValue]
    }
    
    extension [Self <: MultiValue](x: Self) {
      
      inline def setMultiValue(value: js.Array[Value]): Self = StObject.set(x, "multiValue", value.asInstanceOf[js.Any])
      
      inline def setMultiValueUndefined: Self = StObject.set(x, "multiValue", js.undefined)
      
      inline def setMultiValueVarargs(value: Value*): Self = StObject.set(x, "multiValue", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Value extends StObject {
    
    var value: String
  }
  object Value {
    
    inline def apply(value: String): Value = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Value]
    }
    
    extension [Self <: Value](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
