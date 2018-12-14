package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a Map that has a default values factory object or function.
     * Each get of non-existent key goes through the factory
     */
@JSGlobal("adone.collection.DefaultMap")
@js.native
class DefaultMap[K, V] ()
  extends lodashLib.lodashMod.Global.Map[K, V] {
  def this(factory: js.Function1[/* key */ K, V]) = this()
  def this(factory: org.scalablytyped.runtime.StringDictionary[V]) = this()
  def this(factory: js.Function1[/* key */ K, V], iterable: nodeLib.Iterable[js.Tuple2[K, V]]) = this()
  def this(factory: org.scalablytyped.runtime.StringDictionary[V], iterable: nodeLib.Iterable[js.Tuple2[K, V]]) = this()
}

