package typings.aureliaKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Container extends js.Object {
  
  var container: typings.aureliaDependencyInjection.mod.Container = js.native
  
  def globalResources(resources: String*): js.Any = js.native
}
object Container {
  
  @scala.inline
  def apply(
    container: typings.aureliaDependencyInjection.mod.Container,
    globalResources: /* repeated */ String => js.Any
  ): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], globalResources = js.Any.fromFunction1(globalResources))
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit class ContainerOps[Self <: Container] (val x: Self) extends AnyVal {
    
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
    def setContainer(value: typings.aureliaDependencyInjection.mod.Container): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalResources(value: /* repeated */ String => js.Any): Self = this.set("globalResources", js.Any.fromFunction1(value))
  }
}
