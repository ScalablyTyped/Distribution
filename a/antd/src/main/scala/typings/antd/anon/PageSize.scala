package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSize extends js.Object {
  var pageSize: js.UndefOr[Double] = js.undefined
}

object PageSize {
  @scala.inline
  def apply(pageSize: js.UndefOr[Double] = js.undefined): PageSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSize]
  }
}

