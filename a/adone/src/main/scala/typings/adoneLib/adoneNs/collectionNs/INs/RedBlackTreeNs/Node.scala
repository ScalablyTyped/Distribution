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

