package typings.antd.transferListItemMod

import typings.antd.transferMod.TransferItem
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var item: TransferItem
  var prefixCls: String
  var renderedEl: ReactNode
  var renderedText: js.UndefOr[String | Double] = js.undefined
  def onClick(item: TransferItem): Unit
}

object ListItemProps {
  @scala.inline
  def apply(
    item: TransferItem,
    onClick: TransferItem => Unit,
    prefixCls: String,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    renderedEl: ReactNode = null,
    renderedText: String | Double = null
  ): ListItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (renderedEl != null) __obj.updateDynamic("renderedEl")(renderedEl.asInstanceOf[js.Any])
    if (renderedText != null) __obj.updateDynamic("renderedText")(renderedText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

