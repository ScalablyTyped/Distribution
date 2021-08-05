package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurable extends StObject {
  
  var configurable: Boolean
  
  def get(): js.Any
}
object Configurable {
  
  inline def apply(configurable: Boolean, get: () => js.Any): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Configurable]
  }
  
  extension [Self <: Configurable](x: Self) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
  }
}
