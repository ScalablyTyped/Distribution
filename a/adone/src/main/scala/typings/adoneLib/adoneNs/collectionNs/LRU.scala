package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent an LRU cache
  */
@JSGlobal("adone.collection.LRU")
@js.native
/**
  * Creates an LRU cache with the given options
  */
class LRU[K, V] () extends js.Object {
  def this(options: adoneLib.adoneNs.collectionNs.INs.LRUNs.ConstructorOptions[K, V]) = this()
  /**
    * stale setting
    */
  var allowStale: scala.Boolean = js.native
  /**
    * Total quantity of objects currently in cache.
    * Note, that stale items are returned as part of this item count.
    */
  val itemCount: scala.Double = js.native
  /**
    * Total length of objects in cache taking into account length options function
    */
  val length: scala.Double = js.native
  /**
    * length setting
    */
  @JSName("lengthCalculator")
  var lengthCalculator_Original: adoneLib.adoneNs.collectionNs.INs.LRUNs.LengthCalculator[K, V] = js.native
  /**
    * maxAge setting
    */
  var maxAge: scala.Double = js.native
  /**
    * The length of the cache, setter resizes the cache
    */
  var maxSize: scala.Double = js.native
  /**
    * Deletes a key out of the cache
    */
  def del(key: K): scala.Unit = js.native
  /**
    * Return an array of the cache entries ready for serialization and usage with 'destinationCache.load(arr)`
    */
  def dump(): js.Array[adoneLib.adoneNs.collectionNs.INs.LRUNs.SerializedEntry[K, V]] = js.native
  /**
    * Returns an internal lru list of entries
    */
  def dumpLru(): LinkedList[adoneLib.adoneNs.collectionNs.INs.LRUNs.Entry[K, V]] = js.native
  /**
    * Iterates over all the keys in the cache, in order of recent-ness
    */
  def forEach[T](fn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ LRU[K, V], scala.Unit]): scala.Unit = js.native
  def forEach[T](
    fn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ LRU[K, V], scala.Unit],
    thisp: T
  ): scala.Unit = js.native
  /**
    * Gets the value of the given key. Updates the "recently used"-ness of the key
    */
  def get(key: K): js.UndefOr[V] = js.native
  /**
    * Check if a key is in the cache, without updating the recent-ness or deleting it for being stale
    */
  def has(key: K): scala.Boolean = js.native
  /**
    * @param opts std.util.inspect options
    */
  def inspect(): java.lang.String = js.native
  def inspect(opts: js.Object): java.lang.String = js.native
  /**
    * Returns an array of the keys in the cache
    */
  def keys(): js.Array[K] = js.native
  /**
    * length setting
    */
  def lengthCalculator(value: V, key: K): scala.Double = js.native
  /**
    * Loads another cache entries array, obtained with sourceCache.dump(), into the cache.
    * The destination cache is reset before loading new entries
    */
  def load(arr: js.Array[adoneLib.adoneNs.collectionNs.INs.LRUNs.SerializedEntry[K, V]]): scala.Unit = js.native
  /**
    * Returns the key value without updating the "recently used"-ness of the key
    */
  def peek(key: K): js.UndefOr[V] = js.native
  /**
    * Deletes the less recently used element
    */
  def pop(): adoneLib.adoneNs.collectionNs.INs.LRUNs.Entry[K, V] = js.native
  /**
    * Manually iterates over the entire cache proactively pruning old entries
    */
  def prune(): scala.Unit = js.native
  /**
    * Clears the cache entirely, throwing away all values
    */
  def reset(): scala.Unit = js.native
  /**
    * Iterates over all the keys in the cache, in reverse recent-ness order. (ie, less recently used items are iterated over first.)
    */
  def rforEach[T](fn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ LRU[K, V], scala.Unit]): scala.Unit = js.native
  def rforEach[T](
    fn: js.ThisFunction3[/* this */ T, /* value */ V, /* key */ K, /* cache */ LRU[K, V], scala.Unit],
    thisp: T
  ): scala.Unit = js.native
  /**
    * Sets a new value for the given key. Updates the "recently used"-ness of the key
    *
    * @param maxAge maxAge option specific for this key
    * @returns Whether the key was set
    */
  def set(key: K, value: V): scala.Boolean = js.native
  def set(key: K, value: V, maxAge: scala.Double): scala.Boolean = js.native
  /**
    * Returns an array of the values in the cache
    */
  def values(): js.Array[V] = js.native
}

