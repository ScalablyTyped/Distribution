package typings
package adoneLib.adoneNs.collectionNs.INs.RedBlackTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node[K, V] extends js.Object {
  /**
    * The key associated to the node
    */
  var key: K
  /**
    * The left subtree of the node
    */
  var left: js.UndefOr[Node[K, V]] = js.undefined
  /**
    * The right subtree of the node
    */
  var right: js.UndefOr[Node[K, V]] = js.undefined
  /**
    * The value associated to the node
    */
  var value: V
}

object Node {
  @scala.inline
  def apply[K, V](key: K, value: V, left: Node[K, V] = null, right: Node[K, V] = null): Node[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (right != null) __obj.updateDynamic("right")(right)
    __obj.asInstanceOf[Node[K, V]]
  }
}

