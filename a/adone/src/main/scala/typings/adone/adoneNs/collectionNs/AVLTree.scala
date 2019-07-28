package typings.adone.adoneNs.collectionNs

import typings.adone.adoneNs.collectionNs.INs.BinarySearchTreeNs.ConstructorOptions
import typings.adone.adoneNs.collectionNs.INs.BinarySearchTreeNs.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an AVL tree, a self-balancing binary search tree
  */
@JSGlobal("adone.collection.AVLTree")
@js.native
class AVLTree[K, V] () extends js.Object {
  def this(options: ConstructorOptions[K, V, AVLTree[K, V]]) = this()
  /**
    * Returns all the values from the given key bounds
    */
  def betweenBounds(query: Query[K]): js.Array[V] = js.native
  /**
    * Checks whether the tree is an avl tree
    */
  def checkIsAVLT(): Unit = js.native
  /**
    * Deletes the given key/value from the tree
    */
  def delete(key: K): Unit = js.native
  def delete(key: K, value: V): Unit = js.native
  /**
    * Executed the given callback for each node from left to right
    */
  def executeOnEveryNode(fn: js.Function1[/* tree */ AVLTree[K, V], Unit]): Unit = js.native
  /**
    * Returns the of keys in the tree
    */
  def getNumberOFKeys(): Double = js.native
  /**
    * Inserts a new key/value
    */
  def insert(key: K, value: V): Unit = js.native
  /**
    * Prints the tree
    */
  def prettyPrint(): Unit = js.native
  def prettyPrint(printDate: Boolean): Unit = js.native
  def prettyPrint(printDate: Boolean, spacing: String): Unit = js.native
  /**
    * Searches the given key in the tree
    */
  def search(key: K): js.Array[V] = js.native
}

