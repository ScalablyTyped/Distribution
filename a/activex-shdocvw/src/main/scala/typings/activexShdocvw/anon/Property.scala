package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property extends StObject {
  
  val Property: String
}
object Property {
  
  inline def apply(Property: String): Property = {
    val __obj = js.Dynamic.literal(Property = Property.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    inline def setProperty(value: String): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
  }
}
