package typings
package adoneLib.adoneNs.collectionNs.INs.LinkedListNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the node of a linked list
  */
trait Node[T] extends js.Object {
  /**
    * The next node
    */
  var next: js.UndefOr[Node[T]] = js.undefined
  /**
    * The previous node
    */
  var prev: js.UndefOr[Node[T]] = js.undefined
  /**
    * The value this node contains
    */
  var value: T
}

object Node {
  @scala.inline
  def apply[T](value: T, next: Node[T] = null, prev: Node[T] = null): Node[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next)
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[Node[T]]
  }
}

