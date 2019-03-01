package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IterateOptions extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
  var probability: js.UndefOr[scala.Double] = js.undefined
}

object IterateOptions {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null, probability: scala.Int | scala.Double = null): IterateOptions = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (probability != null) __obj.updateDynamic("probability")(probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[IterateOptions]
  }
}

