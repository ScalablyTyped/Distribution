package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChangesObject[T] extends StObject {
  
  var currentValue: T = js.native
  
  def isFirstChange(): Boolean = js.native
  
  var previousValue: T = js.native
}
object IChangesObject {
  
  @scala.inline
  def apply[T](currentValue: T, isFirstChange: () => Boolean, previousValue: T): IChangesObject[T] = {
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], isFirstChange = js.Any.fromFunction0(isFirstChange), previousValue = previousValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangesObject[T]]
  }
  
  @scala.inline
  implicit class IChangesObjectMutableBuilder[Self <: IChangesObject[_], T] (val x: Self with IChangesObject[T]) extends AnyVal {
    
    @scala.inline
    def setCurrentValue(value: T): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFirstChange(value: () => Boolean): Self = StObject.set(x, "isFirstChange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousValue(value: T): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
  }
}
