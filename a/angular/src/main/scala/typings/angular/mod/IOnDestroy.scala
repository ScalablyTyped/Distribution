package typings.angular.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $onDestroy lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
@js.native
trait IOnDestroy extends js.Object {
  
  /**
    * Called on a controller when its containing scope is destroyed. Use this hook for releasing external resources,
    * watches and event handlers.
    */
  @JSName("$onDestroy")
  def $onDestroy(): Unit = js.native
}
object IOnDestroy {
  
  @scala.inline
  def apply($onDestroy: () => Unit): IOnDestroy = {
    val __obj = js.Dynamic.literal($onDestroy = js.Any.fromFunction0($onDestroy))
    __obj.asInstanceOf[IOnDestroy]
  }
  
  @scala.inline
  implicit class IOnDestroyOps[Self <: IOnDestroy] (val x: Self) extends AnyVal {
    
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
    def set$onDestroy(value: () => Unit): Self = this.set("$onDestroy", js.Any.fromFunction0(value))
  }
}
