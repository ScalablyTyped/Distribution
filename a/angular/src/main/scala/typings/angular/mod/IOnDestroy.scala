package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $onDestroy lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IOnDestroy extends StObject {
  
  /**
    * Called on a controller when its containing scope is destroyed. Use this hook for releasing external resources,
    * watches and event handlers.
    */
  @JSName("$onDestroy")
  def $onDestroy(): Unit
}
object IOnDestroy {
  
  inline def apply($onDestroy: () => Unit): IOnDestroy = {
    val __obj = js.Dynamic.literal($onDestroy = js.Any.fromFunction0($onDestroy))
    __obj.asInstanceOf[IOnDestroy]
  }
  
  extension [Self <: IOnDestroy](x: Self) {
    
    inline def set$onDestroy(value: () => Unit): Self = StObject.set(x, "$onDestroy", js.Any.fromFunction0(value))
  }
}
