package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIndex[T] extends StObject {
  
  def getIndex(key: Double): Double
  
  def getKey(index: Double): Double
  
  def insert(index: Double, item: T): Unit
  
  var list: js.Array[T]
  
  def merge(index: Double, items: js.Array[T]): Unit
  
  def move(oldIndex: Double, newIndex: Double): Unit
  
  def pop(): Unit
  
  def push(item: T): Unit
  
  def remove(index: Double): Unit
  
  def replace(index: Double, item: T): Unit
  
  def resetList(newList: js.Array[T]): Unit
  
  def shift(): Unit
  
  def sortList(result: js.Array[T]): js.Array[T]
  
  def unshift(item: T): Unit
}
object GetIndex {
  
  inline def apply[T](
    getIndex: Double => Double,
    getKey: Double => Double,
    insert: (Double, T) => Unit,
    list: js.Array[T],
    merge: (Double, js.Array[T]) => Unit,
    move: (Double, Double) => Unit,
    pop: () => Unit,
    push: T => Unit,
    remove: Double => Unit,
    replace: (Double, T) => Unit,
    resetList: js.Array[T] => Unit,
    shift: () => Unit,
    sortList: js.Array[T] => js.Array[T],
    unshift: T => Unit
  ): GetIndex[T] = {
    val __obj = js.Dynamic.literal(getIndex = js.Any.fromFunction1(getIndex), getKey = js.Any.fromFunction1(getKey), insert = js.Any.fromFunction2(insert), list = list.asInstanceOf[js.Any], merge = js.Any.fromFunction2(merge), move = js.Any.fromFunction2(move), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2(replace), resetList = js.Any.fromFunction1(resetList), shift = js.Any.fromFunction0(shift), sortList = js.Any.fromFunction1(sortList), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[GetIndex[T]]
  }
  
  extension [Self <: GetIndex[?], T](x: Self & GetIndex[T]) {
    
    inline def setGetIndex(value: Double => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction1(value))
    
    inline def setGetKey(value: Double => Double): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    
    inline def setInsert(value: (Double, T) => Unit): Self = StObject.set(x, "insert", js.Any.fromFunction2(value))
    
    inline def setList(value: js.Array[T]): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
    
    inline def setListVarargs(value: T*): Self = StObject.set(x, "list", js.Array(value*))
    
    inline def setMerge(value: (Double, js.Array[T]) => Unit): Self = StObject.set(x, "merge", js.Any.fromFunction2(value))
    
    inline def setMove(value: (Double, Double) => Unit): Self = StObject.set(x, "move", js.Any.fromFunction2(value))
    
    inline def setPop(value: () => Unit): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
    
    inline def setPush(value: T => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    inline def setRemove(value: Double => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setReplace(value: (Double, T) => Unit): Self = StObject.set(x, "replace", js.Any.fromFunction2(value))
    
    inline def setResetList(value: js.Array[T] => Unit): Self = StObject.set(x, "resetList", js.Any.fromFunction1(value))
    
    inline def setShift(value: () => Unit): Self = StObject.set(x, "shift", js.Any.fromFunction0(value))
    
    inline def setSortList(value: js.Array[T] => js.Array[T]): Self = StObject.set(x, "sortList", js.Any.fromFunction1(value))
    
    inline def setUnshift(value: T => Unit): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
  }
}
