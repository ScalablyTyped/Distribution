package typings.astTypes.anon

import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geq extends StObject {
  
  var defaults: EmptyArray = js.native
  
  def geq(than: js.Any): Type[_] = js.native
  
  var isPrimitive: Type[_] = js.native
}
object Geq {
  
  @scala.inline
  def apply(defaults: EmptyArray, geq: js.Any => Type[_], isPrimitive: Type[_]): Geq = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], geq = js.Any.fromFunction1(geq), isPrimitive = isPrimitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geq]
  }
  
  @scala.inline
  implicit class GeqMutableBuilder[Self <: Geq] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaults(value: EmptyArray): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeq(value: js.Any => Type[_]): Self = StObject.set(x, "geq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPrimitive(value: Type[_]): Self = StObject.set(x, "isPrimitive", value.asInstanceOf[js.Any])
  }
}
