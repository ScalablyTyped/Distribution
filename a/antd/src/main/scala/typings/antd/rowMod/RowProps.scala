package typings.antd.rowMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps extends js.Object {
  var bordered: js.UndefOr[Boolean] = js.undefined
  var colon: Boolean
  var index: Double
  var prefixCls: String
  var row: js.Array[ReactElement]
  var vertical: Boolean
}

object RowProps {
  @scala.inline
  def apply(
    colon: Boolean,
    index: Double,
    prefixCls: String,
    row: js.Array[ReactElement],
    vertical: Boolean,
    bordered: js.UndefOr[Boolean] = js.undefined
  ): RowProps = {
    val __obj = js.Dynamic.literal(colon = colon.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowProps]
  }
}

