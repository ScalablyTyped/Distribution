package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the $onInit lifecycle hook
  * https://docs.angularjs.org/api/ng/service/$compile#life-cycle-hooks
  */
trait IOnInit extends StObject {
  
  /**
    * Called on each controller after all the controllers on an element have been constructed and had their bindings
    * initialized (and before the pre & post linking functions for the directives on this element). This is a good
    * place to put initialization code for your controller.
    */
  @JSName("$onInit")
  def $onInit(): Unit
}
object IOnInit {
  
  inline def apply($onInit: () => Unit): IOnInit = {
    val __obj = js.Dynamic.literal($onInit = js.Any.fromFunction0($onInit))
    __obj.asInstanceOf[IOnInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IOnInit] (val x: Self) extends AnyVal {
    
    inline def set$onInit(value: () => Unit): Self = StObject.set(x, "$onInit", js.Any.fromFunction0(value))
  }
}
