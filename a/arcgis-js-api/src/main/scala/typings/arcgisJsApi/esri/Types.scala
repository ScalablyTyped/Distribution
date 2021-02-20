package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Types[T /* <: Base */, Base] extends StObject {
  
  var base: Constructor[Base] | js.Function = js.native
  
  var key: String | (js.Function1[/* obj */ js.Any, String]) = js.native
  
  var typeMap: HashMap[Constructor[T]] = js.native
}
object Types {
  
  @scala.inline
  def apply[T /* <: Base */, Base](
    base: Constructor[Base] | js.Function,
    key: String | (js.Function1[/* obj */ js.Any, String]),
    typeMap: HashMap[Constructor[T]]
  ): Types[T, Base] = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types[T, Base]]
  }
  
  @scala.inline
  implicit class TypesMutableBuilder[Self <: Types[_, _], T /* <: Base */, Base] (val x: Self with (Types[T, Base])) extends AnyVal {
    
    @scala.inline
    def setBase(value: Constructor[Base] | js.Function): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String | (js.Function1[/* obj */ js.Any, String])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFunction1(value: /* obj */ js.Any => String): Self = StObject.set(x, "key", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypeMap(value: HashMap[Constructor[T]]): Self = StObject.set(x, "typeMap", value.asInstanceOf[js.Any])
  }
}
