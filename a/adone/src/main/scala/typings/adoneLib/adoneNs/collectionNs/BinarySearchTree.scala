package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Represents a binary search tree
     */
@JSGlobal("adone.collection.BinarySearchTree")
@js.native
class BinarySearchTree[K, V] () extends js.Object {
  def this(options: adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[K, V, BinarySearchTree[K, V]]) = this()
  /**
           * Returns all the values from the given key bounds
           */
  def betweenBounds(query: adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.Query[K]): js.Array[V] = js.native
  /**
           * Traverses the tree and calls the given function for each node
           */
  def checkAllNodesFullfillCondition(test: js.Function2[/* key */ K, /* value */ V, scala.Unit]): scala.Unit = js.native
  /**
           * Checks whether the tree is a binary search tree
           */
  def checkIsBST(): scala.Unit = js.native
  /**
           * Deletes the given key/value from the tree
           */
  def delete(key: K): scala.Unit = js.native
  /**
           * Deletes the given key/value from the tree
           */
  def delete(key: K, value: V): scala.Unit = js.native
  /**
           * Executed the given callback for each node from left to right
           */
  def executeOnEveryNode(fn: js.Function1[/* tree */ BinarySearchTree[K, V], scala.Unit]): scala.Unit = js.native
  /**
           * Returns the maximum key
           */
  def getMaxKey(): K = js.native
  /**
           * Returns the max descendant tree
           */
  def getMaxKeyDescendant(): BinarySearchTree[K, V] = js.native
  /**
           * Returns the minumum key
           */
  def getMinKey(): K = js.native
  /**
           * Returns the min descendant tree
           */
  def getMinKeyDescendant(): BinarySearchTree[K, V] = js.native
  /**
           * Returns the of keys in the tree
           */
  def getNumberOfKeys(): scala.Double = js.native
  /**
           * Inserts a new key/value
           */
  def insert(key: K, value: V): scala.Unit = js.native
  /**
           * Prints the tree
           */
  def prettyPrint(): scala.Unit = js.native
  /**
           * Prints the tree
           */
  def prettyPrint(printData: scala.Boolean): scala.Unit = js.native
  /**
           * Prints the tree
           */
  def prettyPrint(printData: scala.Boolean, spacing: java.lang.String): scala.Unit = js.native
  /**
           * Searches the given key in the tree
           */
  def search(key: K): js.Array[V] = js.native
}

