package typings.adone.adoneNs.collectionNs.INs.RedBlackTreeNs

import typings.adone.adoneNs.collectionNs.RedBlackTree
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterator[K, V] extends js.Object {
  /**
    * If true, then the iterator is not at the end of the sequence
    */
  val hasNext: Boolean
  /**
    * If true, then the iterator is not at the beginning of the sequence
    */
  val hasPrev: Boolean
  /**
    * Returns the position of this iterator in the sequence
    */
  val index: Double
  /**
    * The key of the item referenced by the iterator, undefined if invalid
    */
  val key: js.UndefOr[K] = js.undefined
  /**
    * The value of the node at the iterator's current position, null if invalid
    */
  val node: (Node[K, V]) | Null
  /**
    * The tree associated to the iterator
    */
  var tree: RedBlackTree[K, V]
  /**
    * Checks if the iterator is valid
    */
  val valid: Boolean
  /**
    * The value of the item referenced by the iterator, undefined if invalid
    */
  val value: js.UndefOr[V] = js.undefined
  /**
    * Advances the iterator to the next position
    */
  def next(): Unit
  /**
    * Moves the iterator backward one element
    */
  def prev(): Unit
  /**
    * Removes the item at the position of the iterator and returns a new rb-tree
    */
  def remove(): RedBlackTree[K, V]
  /**
    * Updates the value of the node in the tree at this iterator and returns a new rb-tree
    */
  def update(value: V): RedBlackTree[K, V]
}

object Iterator {
  @scala.inline
  def apply[K, V](
    clone: () => Iterator[K, V],
    hasNext: Boolean,
    hasPrev: Boolean,
    index: Double,
    next: () => Unit,
    prev: () => Unit,
    remove: () => RedBlackTree[K, V],
    tree: RedBlackTree[K, V],
    update: V => RedBlackTree[K, V],
    valid: Boolean,
    key: K = null,
    node: Node[K, V] = null,
    value: V = null
  ): Iterator[K, V] = {
    val __obj = js.Dynamic.literal(clone = js.Any.fromFunction0(clone), hasNext = hasNext, hasPrev = hasPrev, index = index, next = js.Any.fromFunction0(next), prev = js.Any.fromFunction0(prev), remove = js.Any.fromFunction0(remove), tree = tree, update = js.Any.fromFunction1(update), valid = valid)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iterator[K, V]]
  }
}

