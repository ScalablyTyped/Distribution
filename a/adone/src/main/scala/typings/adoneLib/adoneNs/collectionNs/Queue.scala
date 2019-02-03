package typings
package adoneLib.adoneNs.collectionNs

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
  val empty: scala.Boolean = js.native
  /**
    * Whether the queue is full
    */
  val full: scala.Boolean = js.native
  /**
    * The length of the queue
    */
  val length: scala.Double = js.native
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
  def from[T](iterable: nodeLib.Iterable[T]): adoneLib.adoneNs.collectionNs.Queue[T, T] = js.native
  def from[T](iterable: nodeLib.Iterable[T], length: scala.Double): adoneLib.adoneNs.collectionNs.Queue[T, T] = js.native
}

