package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Having[T] extends js.Object {
  
  def having(nodes: js.Any*): T = js.native
}
object Having {
  
  @scala.inline
  def apply[T](having: /* repeated */ js.Any => T): Having[T] = {
    val __obj = js.Dynamic.literal(having = js.Any.fromFunction1(having))
    __obj.asInstanceOf[Having[T]]
  }
  
  @scala.inline
  implicit class HavingOps[Self <: Having[_], T] (val x: Self with Having[T]) extends AnyVal {
    
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
    def setHaving(value: /* repeated */ js.Any => T): Self = this.set("having", js.Any.fromFunction1(value))
  }
}
