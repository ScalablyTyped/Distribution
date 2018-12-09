package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.collection.RefcountedCache")
@js.native
class RefcountedCache[T] () extends MapCache[T] {
  def ref(key: java.lang.String): scala.Unit = js.native
  def references(key: java.lang.String): scala.Double = js.native
  def unref(key: java.lang.String): scala.Unit = js.native
}

