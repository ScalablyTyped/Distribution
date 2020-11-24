package typings.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinglePropertySchema[T] extends js.Object {
  
  var default: js.UndefOr[T] = js.native
  
  var parse: js.UndefOr[js.Function1[/* value */ String, T]] = js.native
  
  var stringify: js.UndefOr[js.Function1[/* value */ T, String]] = js.native
  
  var `type`: js.UndefOr[PropertyTypes] = js.native
}
object SinglePropertySchema {
  
  @scala.inline
  def apply[T](): SinglePropertySchema[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SinglePropertySchema[T]]
  }
  
  @scala.inline
  implicit class SinglePropertySchemaOps[Self <: SinglePropertySchema[_], T] (val x: Self with SinglePropertySchema[T]) extends AnyVal {
    
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
    def setDefault(value: T): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setParse(value: /* value */ String => T): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    
    @scala.inline
    def setStringify(value: /* value */ T => String): Self = this.set("stringify", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    
    @scala.inline
    def setType(value: PropertyTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
