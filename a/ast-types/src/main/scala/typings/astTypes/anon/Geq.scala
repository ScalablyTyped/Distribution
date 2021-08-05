package typings.astTypes.anon

import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geq extends StObject {
  
  var defaults: EmptyArray
  
  def geq(than: js.Any): Type[js.Any]
  
  var isPrimitive: Type[js.Any]
}
object Geq {
  
  inline def apply(defaults: EmptyArray, geq: js.Any => Type[js.Any], isPrimitive: Type[js.Any]): Geq = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], geq = js.Any.fromFunction1(geq), isPrimitive = isPrimitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geq]
  }
  
  extension [Self <: Geq](x: Self) {
    
    inline def setDefaults(value: EmptyArray): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setGeq(value: js.Any => Type[js.Any]): Self = StObject.set(x, "geq", js.Any.fromFunction1(value))
    
    inline def setIsPrimitive(value: Type[js.Any]): Self = StObject.set(x, "isPrimitive", value.asInstanceOf[js.Any])
  }
}
