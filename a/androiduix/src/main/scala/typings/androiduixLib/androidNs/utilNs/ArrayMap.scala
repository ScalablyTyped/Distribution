package typings
package androiduixLib.androidNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.ArrayMap")
@js.native
class ArrayMap[K, V] () extends js.Object {
  def this(capacity: scala.Double) = this()
  var map: js.Any = js.native
  def append(key: K, value: V): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def containsKey(key: K): scala.Boolean = js.native
  def containsValue(value: V): scala.Boolean = js.native
  def ensureCapacity(minimumCapacity: scala.Double): scala.Unit = js.native
  def erase(): scala.Unit = js.native
  def get(key: K): V = js.native
  def indexOfValue(value: V): scala.Double = js.native
  def isEmpty(): scala.Boolean = js.native
  def keyAt(index: scala.Double): K = js.native
  def keySet(): stdLib.Set[K] = js.native
  def put(key: K, value: V): V = js.native
  def remove(key: K): V = js.native
  def removeAt(index: scala.Double): V = js.native
  def setValueAt(index: scala.Double, value: V): V = js.native
  def size(): scala.Double = js.native
  def valueAt(index: scala.Double): V = js.native
}

