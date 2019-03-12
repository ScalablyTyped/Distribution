package typings
package adoneLib.adoneNs.collectionNs

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
  val empty: scala.Boolean = js.native
  /**
    * Returns an iterator over the values
    */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[stdLib.IterableIterator[T]] = js.native
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
  def from[T](iterable: stdLib.Iterable[T]): adoneLib.adoneNs.collectionNs.Stack[T] = js.native
}

