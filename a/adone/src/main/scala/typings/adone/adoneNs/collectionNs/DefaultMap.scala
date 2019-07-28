package typings.adone.adoneNs.collectionNs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Iterable
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Map that has a default values factory object or function.
  * Each get of non-existent key goes through the factory
  */
@JSGlobal("adone.collection.DefaultMap")
@js.native
class DefaultMap[K, V] () extends Map[K, V] {
  def this(factory: js.Function1[/* key */ K, V]) = this()
  def this(factory: StringDictionary[V]) = this()
  def this(factory: js.Function1[/* key */ K, V], iterable: Iterable[js.Tuple2[K, V]]) = this()
  def this(factory: StringDictionary[V], iterable: Iterable[js.Tuple2[K, V]]) = this()
}

