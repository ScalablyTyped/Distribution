package typings.adone.adoneNs.collectionNs

import typings.adone.Anon_Dispose
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a faster LRU cache but with less functionality
  */
@JSGlobal("adone.collection.FastLRU")
@js.native
/**
  * @param size
  */
class FastLRU[K, V] () extends js.Object {
  def this(options: Anon_Dispose[K, V]) = this()
  /**
    * The actual size of the cache
    */
  val size: Double = js.native
  /**
    * Clears the cache
    */
  def clear(): Unit = js.native
  /**
    * Deletes the given key from the cache
    */
  def delete(key: K): Boolean = js.native
  /**
    * Returns the entries iterator
    */
  def entries(): IterableIterator[js.Tuple2[K, V]] = js.native
  /**
    * Gets the value by the given key
    */
  def get(key: K): js.UndefOr[V] = js.native
  /**
    * Checks whether the cache has an element with the given key
    */
  def has(key: K): Boolean = js.native
  /**
    * Returns the keys iterator
    */
  def keys(): IterableIterator[K] = js.native
  /**
    * Sets a new value for the given key
    */
  def set(key: K, value: V): Unit = js.native
  /**
    * Returns the values iterator
    */
  def values(): IterableIterator[V] = js.native
}

