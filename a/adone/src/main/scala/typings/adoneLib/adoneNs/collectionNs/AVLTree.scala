package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an AVL tree, a self-balancing binary search tree
  */
@JSGlobal("adone.collection.AVLTree")
@js.native
class AVLTree[K, V] () extends js.Object {
  def this(options: adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions[K, V, AVLTree[K, V]]) = this()
  /**
    * Returns all the values from the given key bounds
    */
  def betweenBounds(query: adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs.Query[K]): js.Array[V] = js.native
  /**
    * Checks whether the tree is an avl tree
    */
  def checkIsAVLT(): scala.Unit = js.native
  /**
    * Deletes the given key/value from the tree
    */
  def delete(key: K): scala.Unit = js.native
  def delete(key: K, value: V): scala.Unit = js.native
  /**
    * Executed the given callback for each node from left to right
    */
  def executeOnEveryNode(fn: js.Function1[/* tree */ AVLTree[K, V], scala.Unit]): scala.Unit = js.native
  /**
    * Returns the of keys in the tree
    */
  def getNumberOFKeys(): scala.Double = js.native
  /**
    * Inserts a new key/value
    */
  def insert(key: K, value: V): scala.Unit = js.native
  /**
    * Prints the tree
    */
  def prettyPrint(): scala.Unit = js.native
  def prettyPrint(printDate: scala.Boolean): scala.Unit = js.native
  def prettyPrint(printDate: scala.Boolean, spacing: java.lang.String): scala.Unit = js.native
  /**
    * Searches the given key in the tree
    */
  def search(key: K): js.Array[V] = js.native
}

