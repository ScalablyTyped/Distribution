package typings
package androiduixLib.androidNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.SparseMap")
@js.native
class SparseMap[K, T] () extends js.Object {
  def this(initialCapacity: scala.Double) = this()
  var map: stdLib.Map[K, T] = js.native
  def append(key: js.Any, value: js.Any): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def delete(key: K): scala.Unit = js.native
  def get(key: K): T = js.native
  def get(key: K, valueIfKeyNotFound: T): T = js.native
  def indexOfKey(key: K): scala.Double = js.native
  def indexOfValue(value: T): scala.Double = js.native
  def keyAt(index: scala.Double): K = js.native
  def put(key: K, value: T): scala.Unit = js.native
  def remove(key: K): scala.Unit = js.native
  def removeAt(index: scala.Double): scala.Unit = js.native
  def removeAtRange(index: scala.Double): scala.Unit = js.native
  def removeAtRange(index: scala.Double, size: scala.Double): scala.Unit = js.native
  def setValueAt(index: scala.Double, value: T): scala.Unit = js.native
  def size(): scala.Double = js.native
  def valueAt(index: scala.Double): T = js.native
}

