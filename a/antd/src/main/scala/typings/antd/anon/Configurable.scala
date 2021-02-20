package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Configurable extends StObject {
  
  var configurable: Boolean = js.native
  
  def get(): js.Any = js.native
}
object Configurable {
  
  @scala.inline
  def apply(configurable: Boolean, get: () => js.Any): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get))
    __obj.asInstanceOf[Configurable]
  }
  
  @scala.inline
  implicit class ConfigurableMutableBuilder[Self <: Configurable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: () => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
  }
}
