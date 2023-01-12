package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnInit extends StObject {
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked the directive's
    * data-bound properties for the first time,
    * and before any of the view or content children have been checked.
    * It is invoked only once when the directive is instantiated.
    */
  def ngOnInit(): Unit
}
object OnInit {
  
  inline def apply(ngOnInit: () => Unit): OnInit = {
    val __obj = js.Dynamic.literal(ngOnInit = js.Any.fromFunction0(ngOnInit))
    __obj.asInstanceOf[OnInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnInit] (val x: Self) extends AnyVal {
    
    inline def setNgOnInit(value: () => Unit): Self = StObject.set(x, "ngOnInit", js.Any.fromFunction0(value))
  }
}
