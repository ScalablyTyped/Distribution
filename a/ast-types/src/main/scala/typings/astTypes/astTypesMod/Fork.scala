package typings.astTypes.astTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fork extends js.Object {
  
  def use[T](plugin: Plugin[T]): T = js.native
}
object Fork {
  
  @scala.inline
  def apply(use: Plugin[js.Any] => js.Any): Fork = {
    val __obj = js.Dynamic.literal(use = js.Any.fromFunction1(use))
    __obj.asInstanceOf[Fork]
  }
  
  @scala.inline
  implicit class ForkOps[Self <: Fork] (val x: Self) extends AnyVal {
    
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
    def setUse(value: Plugin[js.Any] => js.Any): Self = this.set("use", js.Any.fromFunction1(value))
  }
}
