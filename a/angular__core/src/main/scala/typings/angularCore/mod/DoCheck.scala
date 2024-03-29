package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoCheck extends StObject {
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  def ngDoCheck(): Unit
}
object DoCheck {
  
  inline def apply(ngDoCheck: () => Unit): DoCheck = {
    val __obj = js.Dynamic.literal(ngDoCheck = js.Any.fromFunction0(ngDoCheck))
    __obj.asInstanceOf[DoCheck]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DoCheck] (val x: Self) extends AnyVal {
    
    inline def setNgDoCheck(value: () => Unit): Self = StObject.set(x, "ngDoCheck", js.Any.fromFunction0(value))
  }
}
