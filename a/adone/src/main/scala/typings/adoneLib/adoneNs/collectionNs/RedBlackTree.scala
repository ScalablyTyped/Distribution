package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a fully persistent red-black tree
  */
@JSGlobal("adone.collection.RedBlackTree")
@js.native
class RedBlackTree[K, V] () extends js.Object {
  def this(compare: js.Function2[/* a */ K, /* b */ K, scala.Double]) = this()
  def this(compare: js.Function2[/* a */ K, /* b */ K, scala.Double], root: RedBlackTree[K, V]) = this()
  /**
    * An iterator pointing to the first element in the tree
    */
  val begin: adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V] = js.native
  /**
    * An iterator pointing to the last element in the tree
    */
  val end: adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V] = js.native
  /**
    * A sorted array of all the keys in the tree
    */
  val keys: js.Array[K] = js.native
  /**
    * The number of items in the tree
    */
  val length: scala.Double = js.native
  /**
    * The root node of the tree
    */
  var root: adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Node[K, V] = js.native
  /**
    * An array of all the values in the tree
    */
  val values: js.Array[V] = js.native
  /**
    * Finds an iterator starting at the given element
    */
  def at(idx: scala.Double): adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V] = js.native
  /**
    * Returns an iterator pointing to the first item in the tree with key, otherwise null
    */
  def find(key: K): (adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V]) | scala.Null = js.native
  /**
    * Walks a visitor function over the nodes of the tree in order
    *
    * @param visit A callback that gets executed on each node.
    *              If a truthy value is returned from the visitor, then iteration is stopped.
    * @param lo An optional start of the range to visit (inclusive)
    * @param hi An optional end of the range to visit (non-inclusive)
    */
  def forEach[T](visit: js.Function2[/* key */ K, /* value */ V, T]): T = js.native
  def forEach[T](visit: js.Function2[/* key */ K, /* value */ V, T], lo: K): T = js.native
  def forEach[T](visit: js.Function2[/* key */ K, /* value */ V, T], lo: K, hi: K): T = js.native
  /**
    * Finds the first item in the tree whose key is >= key
    */
  def ge(key: K): adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V] = js.native
  /**
    * Retrieves the value associated to the given key
    */
  def get(key: K): js.UndefOr[V] = js.native
  /**
    * Finds the first item in the tree whose key is > key
    */
  def gt(key: K): adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V] = js.native
  /**
    * Creates a new tree with the new pair inserted
    */
  def insert(key: K, value: V): RedBlackTree[K, V] = js.native
  /**
    * Finds the first item in the tree whose key is <= key
    */
  def le(key: K): adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V] = js.native
  /**
    * Finds the first item in the tree whose key is < key
    */
  def lt(key: K): adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs.Iterator[K, V] = js.native
  /**
    * Removes the first item with key in the tree
    */
  def remove(key: K): RedBlackTree[K, V] = js.native
}

