package typings
package adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Iterator[K, V] extends js.Object {
  /**
               * If true, then the iterator is not at the end of the sequence
               */
  val hasNext: scala.Boolean
  /**
               * If true, then the iterator is not at the beginning of the sequence
               */
  val hasPrev: scala.Boolean
  /**
               * Returns the position of this iterator in the sequence
               */
  val index: scala.Double
  /**
               * The key of the item referenced by the iterator, undefined if invalid
               */
  val key: js.UndefOr[K] = js.undefined
  /**
               * The value of the node at the iterator's current position, null if invalid
               */
  val node: (Node[K, V]) | scala.Null
  /**
               * The tree associated to the iterator
               */
  var tree: adoneLib.adoneNs.collectionNs.RedBlackTree[K, V]
  /**
               * Checks if the iterator is valid
               */
  val valid: scala.Boolean
  /**
               * The value of the item referenced by the iterator, undefined if invalid
               */
  val value: js.UndefOr[V] = js.undefined
  /**
               * Advances the iterator to the next position
               */
  def next(): scala.Unit
  /**
               * Moves the iterator backward one element
               */
  def prev(): scala.Unit
  /**
               * Removes the item at the position of the iterator and returns a new rb-tree
               */
  def remove(): adoneLib.adoneNs.collectionNs.RedBlackTree[K, V]
  /**
               * Updates the value of the node in the tree at this iterator and returns a new rb-tree
               */
  def update(value: V): adoneLib.adoneNs.collectionNs.RedBlackTree[K, V]
}

