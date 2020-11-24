package typings.aframe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parse extends js.Object {
  
  def parse(value: String): js.Object = js.native
  
  def stringify(data: js.Object): String = js.native
}
object Parse {
  
  @scala.inline
  def apply(parse: String => js.Object, stringify: js.Object => String): Parse = {
    val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit class ParseOps[Self <: Parse] (val x: Self) extends AnyVal {
    
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
    def setParse(value: String => js.Object): Self = this.set("parse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringify(value: js.Object => String): Self = this.set("stringify", js.Any.fromFunction1(value))
  }
}
