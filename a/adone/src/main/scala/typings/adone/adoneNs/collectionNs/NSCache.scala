package typings.adone.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.collection.NSCache")
@js.native
class NSCache[T] protected () extends js.Object {
  def this(maxSize: Double, namespaces: js.Array[String]) = this()
  def clear(): Unit = js.native
  def delete(ns: String, key: String): Unit = js.native
  def get(ns: String, key: String): T = js.native
  def has(ns: String, key: String): Boolean = js.native
  def resize(newSize: Double): Unit = js.native
  def set(ns: String, key: String, value: T): Unit = js.native
}

