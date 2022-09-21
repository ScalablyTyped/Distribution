package typings.aureliaBinding.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectObservationAdapter extends StObject {
  
  def getObserver(`object`: Any, propertyName: String, descriptor: js.PropertyDescriptor): js.UndefOr[InternalPropertyObserver | Null]
}
object ObjectObservationAdapter {
  
  inline def apply(getObserver: (Any, String, js.PropertyDescriptor) => js.UndefOr[InternalPropertyObserver | Null]): ObjectObservationAdapter = {
    val __obj = js.Dynamic.literal(getObserver = js.Any.fromFunction3(getObserver))
    __obj.asInstanceOf[ObjectObservationAdapter]
  }
  
  extension [Self <: ObjectObservationAdapter](x: Self) {
    
    inline def setGetObserver(value: (Any, String, js.PropertyDescriptor) => js.UndefOr[InternalPropertyObserver | Null]): Self = StObject.set(x, "getObserver", js.Any.fromFunction3(value))
  }
}
