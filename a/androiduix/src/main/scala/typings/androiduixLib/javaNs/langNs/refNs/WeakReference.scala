package typings
package androiduixLib.javaNs.langNs.refNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("java.lang.ref.WeakReference")
@js.native
class WeakReference[T] protected () extends js.Object {
  def this(referent: T) = this()
  var weakMap: stdLib.WeakMap[_, T] = js.native
  def clear(): scala.Unit = js.native
  def get(): T = js.native
  def set(value: T): scala.Unit = js.native
}

