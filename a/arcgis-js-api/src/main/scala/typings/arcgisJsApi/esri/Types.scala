package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Types[T /* <: Base */, Base] extends js.Object {
  
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
  implicit class TypesOps[Self <: Types[_, _], T /* <: Base */, Base] (val x: Self with (Types[T, Base])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBase(value: Constructor[Base] | js.Function): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyFunction1(value: /* obj */ js.Any => String): Self = this.set("key", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKey(value: String | (js.Function1[/* obj */ js.Any, String])): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeMap(value: HashMap[Constructor[T]]): Self = this.set("typeMap", value.asInstanceOf[js.Any])
  }
}
