package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AfterContentInit extends StObject {
  
  /**
    * A callback method that is invoked immediately after
    * Angular has completed initialization of all of the directive's
    * content.
    * It is invoked only once when the directive is instantiated.
    */
  def ngAfterContentInit(): Unit = js.native
}
object AfterContentInit {
  
  @scala.inline
  def apply(ngAfterContentInit: () => Unit): AfterContentInit = {
    val __obj = js.Dynamic.literal(ngAfterContentInit = js.Any.fromFunction0(ngAfterContentInit))
    __obj.asInstanceOf[AfterContentInit]
  }
  
  @scala.inline
  implicit class AfterContentInitMutableBuilder[Self <: AfterContentInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNgAfterContentInit(value: () => Unit): Self = StObject.set(x, "ngAfterContentInit", js.Any.fromFunction0(value))
  }
}
