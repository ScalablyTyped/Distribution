package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a faster LRU cache but with less functionality
     */
@JSGlobal("adone.collection.FastLRU")
@js.native
class FastLRU[K, V] () extends js.Object {
  /**
           * @param size
           */
  def this(options: adoneLib.Anon_Dispose[K, V]) = this()
  /**
           * The actual size of the cache
           */
  val size: scala.Double = js.native
  /**
           * Clears the cache
           */
  def clear(): scala.Unit = js.native
  /**
           * Deletes the given key from the cache
           */
  def delete(key: K): scala.Boolean = js.native
  /**
           * Returns the entries iterator
           */
  def entries(): nodeLib.IterableIterator[js.Tuple2[K, V]] = js.native
  /**
           * Gets the value by the given key
           */
  def get(key: K): js.UndefOr[V] = js.native
  /**
           * Checks whether the cache has an element with the given key
           */
  def has(key: K): scala.Boolean = js.native
  /**
           * Returns the keys iterator
           */
  def keys(): nodeLib.IterableIterator[K] = js.native
  /**
           * Sets a new value for the given key
           */
  def set(key: K, value: V): scala.Unit = js.native
  /**
           * Returns the values iterator
           */
  def values(): nodeLib.IterableIterator[V] = js.native
}

