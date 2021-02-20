package typings.androiduix.android.widget

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkable extends StObject {
  
  def isChecked(): Boolean = js.native
  
  def setChecked(checked: Boolean): Unit = js.native
  
  def toggle(): Unit = js.native
}
object Checkable {
  
  @scala.inline
  def apply(isChecked: () => Boolean, setChecked: Boolean => Unit, toggle: () => Unit): Checkable = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), setChecked = js.Any.fromFunction1(setChecked), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Checkable]
  }
  
  @scala.inline
  implicit class CheckableMutableBuilder[Self <: Checkable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsChecked(value: () => Boolean): Self = StObject.set(x, "isChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetChecked(value: Boolean => Unit): Self = StObject.set(x, "setChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
  }
}
