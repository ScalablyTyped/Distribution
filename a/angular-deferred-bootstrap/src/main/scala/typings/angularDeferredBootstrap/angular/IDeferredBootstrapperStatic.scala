package typings.angularDeferredBootstrap.angular

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeferredBootstrapperStatic extends js.Object {
  
  def bootstrap(configParam: IConfigParam): IPromise[Boolean] = js.native
}
object IDeferredBootstrapperStatic {
  
  @scala.inline
  def apply(bootstrap: IConfigParam => IPromise[Boolean]): IDeferredBootstrapperStatic = {
    val __obj = js.Dynamic.literal(bootstrap = js.Any.fromFunction1(bootstrap))
    __obj.asInstanceOf[IDeferredBootstrapperStatic]
  }
  
  @scala.inline
  implicit class IDeferredBootstrapperStaticOps[Self <: IDeferredBootstrapperStatic] (val x: Self) extends AnyVal {
    
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
    def setBootstrap(value: IConfigParam => IPromise[Boolean]): Self = this.set("bootstrap", js.Any.fromFunction1(value))
  }
}
