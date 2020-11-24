package typings.androiduix.android.util

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArrayMap[K, V] extends js.Object {
  
  def append(key: K, value: V): Unit = js.native
  
  def clear(): Unit = js.native
  
  def containsKey(key: K): Boolean = js.native
  
  def containsValue(value: V): Boolean = js.native
  
  def ensureCapacity(minimumCapacity: Double): Unit = js.native
  
  def erase(): Unit = js.native
  
  def get(key: K): V = js.native
  
  def indexOfValue(value: V): Double = js.native
  
  def isEmpty(): Boolean = js.native
  
  def keyAt(index: Double): K = js.native
  
  def keySet(): Set[K] = js.native
  
  var map: js.Any = js.native
  
  def put(key: K, value: V): V = js.native
  
  def remove(key: K): V = js.native
  
  def removeAt(index: Double): V = js.native
  
  def setValueAt(index: Double, value: V): V = js.native
  
  def size(): Double = js.native
  
  def valueAt(index: Double): V = js.native
}
object ArrayMap {
  
  @scala.inline
  def apply[K, V](
    append: (K, V) => Unit,
    clear: () => Unit,
    containsKey: K => Boolean,
    containsValue: V => Boolean,
    ensureCapacity: Double => Unit,
    erase: () => Unit,
    get: K => V,
    indexOfValue: V => Double,
    isEmpty: () => Boolean,
    keyAt: Double => K,
    keySet: () => Set[K],
    map: js.Any,
    put: (K, V) => V,
    remove: K => V,
    removeAt: Double => V,
    setValueAt: (Double, V) => V,
    size: () => Double,
    valueAt: Double => V
  ): ArrayMap[K, V] = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), containsKey = js.Any.fromFunction1(containsKey), containsValue = js.Any.fromFunction1(containsValue), ensureCapacity = js.Any.fromFunction1(ensureCapacity), erase = js.Any.fromFunction0(erase), get = js.Any.fromFunction1(get), indexOfValue = js.Any.fromFunction1(indexOfValue), isEmpty = js.Any.fromFunction0(isEmpty), keyAt = js.Any.fromFunction1(keyAt), keySet = js.Any.fromFunction0(keySet), map = map.asInstanceOf[js.Any], put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt), setValueAt = js.Any.fromFunction2(setValueAt), size = js.Any.fromFunction0(size), valueAt = js.Any.fromFunction1(valueAt))
    __obj.asInstanceOf[ArrayMap[K, V]]
  }
  
  @scala.inline
  implicit class ArrayMapOps[Self <: ArrayMap[_, _], K, V] (val x: Self with (ArrayMap[K, V])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppend(value: (K, V) => Unit): Self = this.set("append", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContainsKey(value: K => Boolean): Self = this.set("containsKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainsValue(value: V => Boolean): Self = this.set("containsValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnsureCapacity(value: Double => Unit): Self = this.set("ensureCapacity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setErase(value: () => Unit): Self = this.set("erase", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: K => V): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIndexOfValue(value: V => Double): Self = this.set("indexOfValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKeyAt(value: Double => K): Self = this.set("keyAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeySet(value: () => Set[K]): Self = this.set("keySet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPut(value: (K, V) => V): Self = this.set("put", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: K => V): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveAt(value: Double => V): Self = this.set("removeAt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetValueAt(value: (Double, V) => V): Self = this.set("setValueAt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValueAt(value: Double => V): Self = this.set("valueAt", js.Any.fromFunction1(value))
  }
}
