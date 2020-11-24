package typings.apostrophe.mod

import typings.apostrophe.anon.Form
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AposType extends js.Object {
  
  var bless: js.UndefOr[js.Function2[/* req */ js.Any, /* field */ js.Any, Unit]] = js.native
  
  var converters: Form = js.native
  
  var empty: js.UndefOr[js.Function2[/* field */ js.Any, /* value */ js.Any, Unit]] = js.native
  
  def index(value: js.Any, field: js.Any, texts: js.Any): Unit = js.native
  
  var name: String = js.native
}
object AposType {
  
  @scala.inline
  def apply(converters: Form, index: (js.Any, js.Any, js.Any) => Unit, name: String): AposType = {
    val __obj = js.Dynamic.literal(converters = converters.asInstanceOf[js.Any], index = js.Any.fromFunction3(index), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AposType]
  }
  
  @scala.inline
  implicit class AposTypeOps[Self <: AposType] (val x: Self) extends AnyVal {
    
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
    def setConverters(value: Form): Self = this.set("converters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: (js.Any, js.Any, js.Any) => Unit): Self = this.set("index", js.Any.fromFunction3(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBless(value: (/* req */ js.Any, /* field */ js.Any) => Unit): Self = this.set("bless", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBless: Self = this.set("bless", js.undefined)
    
    @scala.inline
    def setEmpty(value: (/* field */ js.Any, /* value */ js.Any) => Unit): Self = this.set("empty", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEmpty: Self = this.set("empty", js.undefined)
  }
}
