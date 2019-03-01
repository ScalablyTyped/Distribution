package typings
package adoneLib.adoneNs.collectionNs.INs.BinarySearchTreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query[K] extends js.Object {
  @JSName("$gt")
  var $gt: js.UndefOr[K] = js.undefined
  @JSName("$gte")
  var $gte: js.UndefOr[K] = js.undefined
  @JSName("$lt")
  var $lt: js.UndefOr[K] = js.undefined
  @JSName("$lte")
  var $lte: js.UndefOr[K] = js.undefined
}

object Query {
  @scala.inline
  def apply[K]($gt: K = null, $gte: K = null, $lt: K = null, $lte: K = null): Query[K] = {
    val __obj = js.Dynamic.literal()
    if ($gt != null) __obj.updateDynamic("$gt")($gt.asInstanceOf[js.Any])
    if ($gte != null) __obj.updateDynamic("$gte")($gte.asInstanceOf[js.Any])
    if ($lt != null) __obj.updateDynamic("$lt")($lt.asInstanceOf[js.Any])
    if ($lte != null) __obj.updateDynamic("$lte")($lte.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query[K]]
  }
}

