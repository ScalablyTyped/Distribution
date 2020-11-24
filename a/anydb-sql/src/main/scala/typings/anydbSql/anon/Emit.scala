package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Emit extends js.Object {
  
  def emit(`type`: String, args: js.Any*): Unit = js.native
  
  def on(eventName: String, handler: js.Function): Unit = js.native
}
object Emit {
  
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Unit, on: (String, js.Function) => Unit): Emit = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[Emit]
  }
  
  @scala.inline
  implicit class EmitOps[Self <: Emit] (val x: Self) extends AnyVal {
    
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
    def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = this.set("emit", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, js.Function) => Unit): Self = this.set("on", js.Any.fromFunction2(value))
  }
}
