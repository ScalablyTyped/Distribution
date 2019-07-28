package typings.adone.adoneNs.collectionNs

import typings.adone.adoneNs.collectionNs.INs.LinkedListNs.Node
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a linked list
  */
@JSGlobal("adone.collection.LinkedList")
@js.native
/**
  * @param maxLength Maximum length of the linked list
  */
class LinkedList[T] () extends js.Object {
  def this(maxLength: Double) = this()
  /**
    * Whether the list is autoresizable
    */
  val autoresize: Boolean = js.native
  /**
    * The last element of the list
    */
  val back: T = js.native
  /**
    * Whether the list is empty
    */
  val empty: Boolean = js.native
  /**
    * The first element of the list
    */
  val front: T = js.native
  /**
    * Whether the list is full
    */
  val full: Boolean = js.native
  /**
    * Returns an iterator over the list elements
    */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  /**
    * Current length of the list
    */
  val length: Double = js.native
  /**
    * The maximum length of the list
    */
  val maxLength: Double = js.native
  /**
    * Clears the list
    *
    * @param strong Whether to reset all the node's values
    */
  def clear(): Unit = js.native
  def clear(strong: Boolean): Unit = js.native
  /**
    * Invokes the given callback for each value from the beginning to the end (much faster than for-of).
    * If the given function returns false it stops iterating.
    */
  def forEach(callback: js.Function2[/* value */ T, /* index */ Double, Unit | Boolean]): Unit = js.native
  /**
    * Maps this linked list to a new one using the given function
    */
  def map[R](fn: js.Function2[/* value */ T, /* index */ Double, R]): LinkedList[R] = js.native
  /**
    * Returns the next node for the given node
    */
  def nextNode(node: Node[T]): Node[T] = js.native
  /**
    * Removes the last node, returns undefined if the list is empty
    */
  def pop(): js.UndefOr[T] = js.native
  /**
    * Adds a new node to the end
    *
    * @returns Added node
    */
  def push(value: T): Node[T] = js.native
  /**
    * Moves the given node to the end of the list
    */
  def pushNode(node: Node[T]): Unit = js.native
  /**
    * Removes the given node from the list
    */
  def removeNode(node: Node[T]): Unit = js.native
  /**
    * Resizes the list
    */
  def resize(newLength: Double): this.type = js.native
  /**
    * Removes the first node, returns undefined if the list is empty
    */
  def shift(): js.UndefOr[T] = js.native
  /**
    * Convers the list to an array
    */
  def toArray(): js.Array[T] = js.native
  /**
    * Inserts a new node at the beginning of the list
    *
    * @returns Added node
    */
  def unshift(value: T): Node[T] = js.native
  /**
    * Moved the given node to the beginning of the list
    */
  def unshiftNode(node: Node[T]): Unit = js.native
}

/* static members */
@JSGlobal("adone.collection.LinkedList")
@js.native
object LinkedList extends js.Object {
  /**
    * Default length of a new created linked list
    */
  var DEFAULT_LENGTH: Double = js.native
}

