package typings.astTypes.anon

import typings.astTypes.typesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geq extends js.Object {
  
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
  implicit class GeqOps[Self <: Geq] (val x: Self) extends AnyVal {
    
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
    def setDefaults(value: EmptyArray): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeq(value: js.Any => Type[_]): Self = this.set("geq", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsPrimitive(value: Type[_]): Self = this.set("isPrimitive", value.asInstanceOf[js.Any])
  }
}
