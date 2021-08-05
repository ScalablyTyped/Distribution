package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterContentChecked extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has completed checking all of the directive's
    * content.
    */
  def ngAfterContentChecked(): Unit
}
object AfterContentChecked {
  
  inline def apply(ngAfterContentChecked: () => Unit): AfterContentChecked = {
    val __obj = js.Dynamic.literal(ngAfterContentChecked = js.Any.fromFunction0(ngAfterContentChecked))
    __obj.asInstanceOf[AfterContentChecked]
  }
  
  extension [Self <: AfterContentChecked](x: Self) {
    
    inline def setNgAfterContentChecked(value: () => Unit): Self = StObject.set(x, "ngAfterContentChecked", js.Any.fromFunction0(value))
  }
}
