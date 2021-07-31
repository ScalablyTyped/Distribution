package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDestroy extends StObject {
  
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * before a directive, pipe, or service instance is destroyed.
    */
  def ngOnDestroy(): Unit
}
object OnDestroy {
  
  @scala.inline
  def apply(ngOnDestroy: () => Unit): OnDestroy = {
    val __obj = js.Dynamic.literal(ngOnDestroy = js.Any.fromFunction0(ngOnDestroy))
    __obj.asInstanceOf[OnDestroy]
  }
  
  @scala.inline
  implicit class OnDestroyMutableBuilder[Self <: OnDestroy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgOnDestroy(value: () => Unit): Self = StObject.set(x, "ngOnDestroy", js.Any.fromFunction0(value))
  }
}
