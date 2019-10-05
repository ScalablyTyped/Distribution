package typings.androiduix.android.util

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.ArrayMap")
@js.native
class ArrayMap[K, V] () extends js.Object {
  def this(capacity: Double) = this()
  var map: js.Any = js.native
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
  def put(key: K, value: V): V = js.native
  def remove(key: K): V = js.native
  def removeAt(index: Double): V = js.native
  def setValueAt(index: Double, value: V): V = js.native
  def size(): Double = js.native
  def valueAt(index: Double): V = js.native
}

