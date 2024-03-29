package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterViewChecked extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed one change-check cycle
    * for a component's view.
    */
  def ngAfterViewChecked(): Unit
}
object AfterViewChecked {
  
  inline def apply(ngAfterViewChecked: () => Unit): AfterViewChecked = {
    val __obj = js.Dynamic.literal(ngAfterViewChecked = js.Any.fromFunction0(ngAfterViewChecked))
    __obj.asInstanceOf[AfterViewChecked]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterViewChecked] (val x: Self) extends AnyVal {
    
    inline def setNgAfterViewChecked(value: () => Unit): Self = StObject.set(x, "ngAfterViewChecked", js.Any.fromFunction0(value))
  }
}
