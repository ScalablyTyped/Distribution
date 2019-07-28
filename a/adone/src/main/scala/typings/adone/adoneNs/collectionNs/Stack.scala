package typings.adone.adoneNs.collectionNs

import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a stack
  */
@JSGlobal("adone.collection.Stack")
@js.native
class Stack[T] () extends js.Object {
  /**
    * Whether the stack is empty
    */
  val empty: Boolean = js.native
  /**
    * Returns an iterator over the values
    */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  /**
    * The top element of the stack
    */
  val top: T = js.native
  /**
    * Removes the top element
    */
  def pop(): js.UndefOr[T] = js.native
  /**
    * Inserts a new element
    */
  def push(x: T): this.type = js.native
}

/* static members */
@JSGlobal("adone.collection.Stack")
@js.native
object Stack extends js.Object {
  /**
    * Creates a stack and pushed all the values from the given iterable object
    */
  def from[T](iterable: Iterable[T]): Stack[T] = js.native
}

