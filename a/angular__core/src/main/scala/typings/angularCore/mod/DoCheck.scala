package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoCheck extends StObject {
  
  /**
    * A callback method that performs change-detection, invoked
    * after the default change-detector runs.
    * See `KeyValueDiffers` and `IterableDiffers` for implementing
    * custom change checking for collections.
    *
    */
  def ngDoCheck(): Unit = js.native
}
object DoCheck {
  
  @scala.inline
  def apply(ngDoCheck: () => Unit): DoCheck = {
    val __obj = js.Dynamic.literal(ngDoCheck = js.Any.fromFunction0(ngDoCheck))
    __obj.asInstanceOf[DoCheck]
  }
  
  @scala.inline
  implicit class DoCheckMutableBuilder[Self <: DoCheck] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgDoCheck(value: () => Unit): Self = StObject.set(x, "ngDoCheck", js.Any.fromFunction0(value))
  }
}
