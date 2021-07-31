package typings.atom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuManager extends StObject {
  
  /** Adds the given items to the application menu. */
  def add(items: js.Array[MenuOptions]): Disposable
  
  /** Refreshes the currently visible menu. */
  def update(): Unit
}
object MenuManager {
  
  @scala.inline
  def apply(add: js.Array[MenuOptions] => Disposable, update: () => Unit): MenuManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[MenuManager]
  }
  
  @scala.inline
  implicit class MenuManagerMutableBuilder[Self <: MenuManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Array[MenuOptions] => Disposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
  }
}
