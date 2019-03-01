package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelsParams extends js.Object {
  var limit: js.UndefOr[scala.Double] = js.undefined
}

object PushChannelsParams {
  @scala.inline
  def apply(limit: scala.Int | scala.Double = null): PushChannelsParams = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushChannelsParams]
  }
}

