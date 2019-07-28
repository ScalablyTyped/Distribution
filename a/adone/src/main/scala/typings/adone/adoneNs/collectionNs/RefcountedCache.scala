package typings.adone.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.collection.RefcountedCache")
@js.native
class RefcountedCache[T] () extends MapCache[T] {
  def ref(key: String): Unit = js.native
  def references(key: String): Double = js.native
  def unref(key: String): Unit = js.native
}

