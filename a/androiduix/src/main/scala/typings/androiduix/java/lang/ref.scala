package typings.androiduix.java.lang

import typings.std.WeakMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.lang.ref")
@js.native
object ref extends js.Object {
  @js.native
  class WeakReference[T] protected () extends js.Object {
    def this(referent: T) = this()
    var weakMap: WeakMap[_, T] = js.native
    def clear(): Unit = js.native
    def get(): T = js.native
    def set(value: T): Unit = js.native
  }
  
}

