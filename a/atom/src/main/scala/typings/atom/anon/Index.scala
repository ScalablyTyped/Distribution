package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Index extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var pending: js.UndefOr[Boolean] = js.undefined
}

object Index {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, pending: js.UndefOr[Boolean] = js.undefined): Index = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

