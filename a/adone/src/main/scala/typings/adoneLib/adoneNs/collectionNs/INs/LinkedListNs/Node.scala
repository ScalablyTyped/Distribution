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

