package typings.adone.adoneNs.collectionNs

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a queue
  */
@JSGlobal("adone.collection.Queue")
@js.native
class Queue[S, T] () extends js.Object {
  /**
    * Whether the queue is empty
    */
  val empty: Boolean = js.native
  /**
    * Whether the queue is full
    */
  val full: Boolean = js.native
  /**
    * The length of the queue
    */
  val length: Double = js.native
  /**
    * Removes and returns an element from the beginning
    */
  def pop(): js.UndefOr[T] = js.native
  /**
    * Inserts a new element at the end
    */
  def push(x: S): this.type = js.native
}

/* static members */
@JSGlobal("adone.collection.Queue")
@js.native
object Queue extends js.Object {
  def from[T](iterable: Iterable[T]): Queue[T, T] = js.native
  def from[T](iterable: Iterable[T], length: Double): Queue[T, T] = js.native
}

