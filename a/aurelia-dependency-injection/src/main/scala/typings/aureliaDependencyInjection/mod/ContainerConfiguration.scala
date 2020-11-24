package typings.aureliaDependencyInjection.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContainerConfiguration extends js.Object {
  
  var handlers: js.UndefOr[Map[_, _]] = js.native
  
  var onHandlerCreated: js.UndefOr[
    js.Function1[/* handler */ InvocationHandler[_, _, _], InvocationHandler[_, _, _]]
  ] = js.native
}
object ContainerConfiguration {
  
  @scala.inline
  def apply(): ContainerConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerConfiguration]
  }
  
  @scala.inline
  implicit class ContainerConfigurationOps[Self <: ContainerConfiguration] (val x: Self) extends AnyVal {
    
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
    def setHandlers(value: Map[_, _]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setOnHandlerCreated(value: /* handler */ InvocationHandler[_, _, _] => InvocationHandler[_, _, _]): Self = this.set("onHandlerCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnHandlerCreated: Self = this.set("onHandlerCreated", js.undefined)
  }
}
