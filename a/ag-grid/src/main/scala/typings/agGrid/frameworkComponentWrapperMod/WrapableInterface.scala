package typings.agGrid.frameworkComponentWrapperMod

import typings.std.IArguments
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapableInterface extends js.Object {
  
  def addMethod(name: String, callback: js.Function): Unit = js.native
  
  def callMethod(name: String, args: IArguments): Unit = js.native
  
  def hasMethod(name: String): Boolean = js.native
}
object WrapableInterface {
  
  @scala.inline
  def apply(
    addMethod: (String, js.Function) => Unit,
    callMethod: (String, IArguments) => Unit,
    hasMethod: String => Boolean
  ): WrapableInterface = {
    val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction2(addMethod), callMethod = js.Any.fromFunction2(callMethod), hasMethod = js.Any.fromFunction1(hasMethod))
    __obj.asInstanceOf[WrapableInterface]
  }
  
  @scala.inline
  implicit class WrapableInterfaceOps[Self <: WrapableInterface] (val x: Self) extends AnyVal {
    
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
    def setAddMethod(value: (String, js.Function) => Unit): Self = this.set("addMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCallMethod(value: (String, IArguments) => Unit): Self = this.set("callMethod", js.Any.fromFunction2(value))
    
    @scala.inline
    def setHasMethod(value: String => Boolean): Self = this.set("hasMethod", js.Any.fromFunction1(value))
  }
}
