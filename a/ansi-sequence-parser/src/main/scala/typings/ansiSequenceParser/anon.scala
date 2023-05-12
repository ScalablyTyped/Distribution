package typings.ansiSequenceParser

import typings.ansiSequenceParser.mod.Color
import typings.ansiSequenceParser.mod.ParseToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Parse extends StObject {
    
    def parse(value: String): js.Array[ParseToken]
  }
  object Parse {
    
    inline def apply(parse: String => js.Array[ParseToken]): Parse = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[Parse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
      
      inline def setParse(value: String => js.Array[ParseToken]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  trait Value extends StObject {
    
    def value(color: Color): String
  }
  object Value {
    
    inline def apply(value: Color => String): Value = {
      val __obj = js.Dynamic.literal(value = js.Any.fromFunction1(value))
      __obj.asInstanceOf[Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Color => String): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    }
  }
}
