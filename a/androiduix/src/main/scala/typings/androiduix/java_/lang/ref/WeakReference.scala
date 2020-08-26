package typings.androiduix.java_.lang.ref

import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakReference[T] extends js.Object {
  var weakMap: WeakMap[_, T] = js.native
  def clear(): Unit = js.native
  def get(): T = js.native
  def set(value: T): Unit = js.native
}

object WeakReference {
  @scala.inline
  def apply[T](clear: () => Unit, get: () => T, set: T => Unit, weakMap: WeakMap[_, T]): WeakReference[T] = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set), weakMap = weakMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakReference[T]]
  }
  @scala.inline
  implicit class WeakReferenceOps[Self <: WeakReference[_], T] (val x: Self with WeakReference[T]) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGet(value: () => T): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: T => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setWeakMap(value: WeakMap[_, T]): Self = this.set("weakMap", value.asInstanceOf[js.Any])
  }
  
}

