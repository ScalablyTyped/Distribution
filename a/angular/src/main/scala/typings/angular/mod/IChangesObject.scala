package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IChangesObject[T] extends StObject {
  
  var currentValue: T
  
  def isFirstChange(): Boolean
  
  var previousValue: T
}
object IChangesObject {
  
  inline def apply[T](currentValue: T, isFirstChange: () => Boolean, previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], isFirstChange = js.Any.fromFunction0(isFirstChange), previousValue = previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangesObject[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IChangesObject[?], T] (val x: Self & IChangesObject[T]) extends AnyVal {
    
    inline def setCurrentValue(value: T): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    inline def setIsFirstChange(value: () => Boolean): Self = StObject.set(x, "isFirstChange", js.Any.fromFunction0(value))
    
    inline def setPreviousValue(value: T): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
  }
}
