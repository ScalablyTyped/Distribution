package typings
package adoneLib.adoneNs.collectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a priority queue
  */
@JSGlobal("adone.collection.PriorityQueue")
@js.native
class PriorityQueue[T] () extends js.Object {
  def this(options: adoneLib.adoneNs.collectionNs.INs.PriorityQueueNs.ConstructorOptions[T]) = this()
  /**
    * Whether the queue is empty
    */
  val empty: scala.Boolean = js.native
  /**
    * The length of the queue
    */
  val length: scala.Double = js.native
  /**
    * Deletes the given element from the queue
    */
  def delete(x: T): this.type = js.native
  /**
    * Removes the top element (that has the highest priority)
    */
  def pop(): js.UndefOr[T] = js.native
  /**
    * Inserts a new element
    */
  def push(x: T): this.type = js.native
  /**
    * Faster push + pop
    */
  def pushpop(x: T): T = js.native
  /**
    * Replaces the top element (pop + push)
    */
  def replace(x: T): T = js.native
  /**
    * Converts the queue to an array, it works with a clone of the queue, so the original queue is untouched
    */
  def toArray(): js.Array[T] = js.native
}

/* static members */
@JSGlobal("adone.collection.PriorityQueue")
@js.native
object PriorityQueue extends js.Object {
  /**
    * Creates a queue object from the given iterable
    */
  def from[T](iterable: nodeLib.Iterable[T]): adoneLib.adoneNs.collectionNs.PriorityQueue[T] = js.native
  def from[T](
    iterable: nodeLib.Iterable[T],
    options: adoneLib.adoneNs.collectionNs.INs.PriorityQueueNs.ConstructorOptions[T]
  ): adoneLib.adoneNs.collectionNs.PriorityQueue[T] = js.native
}

