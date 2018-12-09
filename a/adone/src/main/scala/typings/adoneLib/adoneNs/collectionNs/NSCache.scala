package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.collection.NSCache")
@js.native
class NSCache[T] protected () extends js.Object {
  def this(maxSize: scala.Double, namespaces: js.Array[java.lang.String]) = this()
  def clear(): scala.Unit = js.native
  def delete(ns: java.lang.String, key: java.lang.String): scala.Unit = js.native
  def get(ns: java.lang.String, key: java.lang.String): T = js.native
  def has(ns: java.lang.String, key: java.lang.String): scala.Boolean = js.native
  def resize(newSize: scala.Double): scala.Unit = js.native
  def set(ns: java.lang.String, key: java.lang.String, value: T): scala.Unit = js.native
}

