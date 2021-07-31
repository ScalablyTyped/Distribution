package typings.activexStdole

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PropertyName extends StObject {
    
    val PropertyName: String
  }
  object PropertyName {
    
    @scala.inline
    def apply(PropertyName: String): PropertyName = {
      val __obj = js.Dynamic.literal(PropertyName = PropertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyName]
    }
    
    @scala.inline
    implicit class PropertyNameMutableBuilder[Self <: PropertyName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropertyName(value: String): Self = StObject.set(x, "PropertyName", value.asInstanceOf[js.Any])
    }
  }
}
