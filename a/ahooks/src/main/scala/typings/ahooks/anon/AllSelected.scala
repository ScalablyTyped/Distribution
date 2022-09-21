package typings.ahooks.anon

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllSelected[T] extends StObject {
  
  val allSelected: Boolean
  
  def isSelected(item: T): Boolean
  
  val noneSelected: Boolean
  
  val partiallySelected: Boolean
  
  def select(item: T): Unit
  
  def selectAll(): Unit
  
  val selected: js.Array[T]
  
  val setSelected: Dispatch[SetStateAction[js.Array[T]]]
  
  def toggle(item: T): Unit
  
  def toggleAll(): Unit
  
  def unSelect(item: T): Unit
  
  def unSelectAll(): Unit
}
object AllSelected {
  
  inline def apply[T](
    allSelected: Boolean,
    isSelected: T => Boolean,
    noneSelected: Boolean,
    partiallySelected: Boolean,
    select: T => Unit,
    selectAll: () => Unit,
    selected: js.Array[T],
    setSelected: SetStateAction[js.Array[T]] => Unit,
    toggle: T => Unit,
    toggleAll: () => Unit,
    unSelect: T => Unit,
    unSelectAll: () => Unit
  ): AllSelected[T] = {
    val __obj = js.Dynamic.literal(allSelected = allSelected.asInstanceOf[js.Any], isSelected = js.Any.fromFunction1(isSelected), noneSelected = noneSelected.asInstanceOf[js.Any], partiallySelected = partiallySelected.asInstanceOf[js.Any], select = js.Any.fromFunction1(select), selectAll = js.Any.fromFunction0(selectAll), selected = selected.asInstanceOf[js.Any], setSelected = js.Any.fromFunction1(setSelected), toggle = js.Any.fromFunction1(toggle), toggleAll = js.Any.fromFunction0(toggleAll), unSelect = js.Any.fromFunction1(unSelect), unSelectAll = js.Any.fromFunction0(unSelectAll))
    __obj.asInstanceOf[AllSelected[T]]
  }
  
  extension [Self <: AllSelected[?], T](x: Self & AllSelected[T]) {
    
    inline def setAllSelected(value: Boolean): Self = StObject.set(x, "allSelected", value.asInstanceOf[js.Any])
    
    inline def setIsSelected(value: T => Boolean): Self = StObject.set(x, "isSelected", js.Any.fromFunction1(value))
    
    inline def setNoneSelected(value: Boolean): Self = StObject.set(x, "noneSelected", value.asInstanceOf[js.Any])
    
    inline def setPartiallySelected(value: Boolean): Self = StObject.set(x, "partiallySelected", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: T => Unit): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
    
    inline def setSelectAll(value: () => Unit): Self = StObject.set(x, "selectAll", js.Any.fromFunction0(value))
    
    inline def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setSetSelected(value: SetStateAction[js.Array[T]] => Unit): Self = StObject.set(x, "setSelected", js.Any.fromFunction1(value))
    
    inline def setToggle(value: T => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction1(value))
    
    inline def setToggleAll(value: () => Unit): Self = StObject.set(x, "toggleAll", js.Any.fromFunction0(value))
    
    inline def setUnSelect(value: T => Unit): Self = StObject.set(x, "unSelect", js.Any.fromFunction1(value))
    
    inline def setUnSelectAll(value: () => Unit): Self = StObject.set(x, "unSelectAll", js.Any.fromFunction0(value))
  }
}
