package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuManager extends StObject {
  
  /** Add context menu items scoped by CSS selectors. */
  def add(itemsBySelector: StringDictionary[js.Array[ContextMenuOptions]]): Disposable
}
object ContextMenuManager {
  
  @scala.inline
  def apply(add: StringDictionary[js.Array[ContextMenuOptions]] => Disposable): ContextMenuManager = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add))
    __obj.asInstanceOf[ContextMenuManager]
  }
  
  @scala.inline
  implicit class ContextMenuManagerMutableBuilder[Self <: ContextMenuManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: StringDictionary[js.Array[ContextMenuOptions]] => Disposable): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
  }
}
