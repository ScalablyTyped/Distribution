package typings
package adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstructorOptions[K, V, Tree] extends js.Object {
  /**
    * Function that defines whether 2 values are the same, by default a === b
    */
  var checkValueEquality: js.UndefOr[js.Function2[/* a */ V, /* b */ V, scala.Boolean]] = js.undefined
  /**
    * Custom keys comparator, by default if a > b => -1, a < b -1, a === b => 0
    */
  var compareKeys: js.UndefOr[js.Function2[/* a */ K, /* b */ K, scala.Double]] = js.undefined
  /**
    * The parent tree
    */
  var parent: js.UndefOr[Tree] = js.undefined
  /**
    * WHether the values must be unique, false by default.
    * If false you can store many values for same keys, otherwise only one
    */
  var unique: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Value to keep in this node
    */
  var value: js.UndefOr[V] = js.undefined
}

