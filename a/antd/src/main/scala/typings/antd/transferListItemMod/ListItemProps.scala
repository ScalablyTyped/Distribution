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
  var onRemove: js.UndefOr[js.Function1[/* item */ TransferItem, Unit]] = js.undefined
  var prefixCls: String
  var renderedEl: ReactNode
  var renderedText: js.UndefOr[String | Double] = js.undefined
  var showRemove: js.UndefOr[Boolean] = js.undefined
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
    onRemove: /* item */ TransferItem => Unit = null,
    renderedEl: ReactNode = null,
    renderedText: String | Double = null,
    showRemove: js.UndefOr[Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), prefixCls = prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (onRemove != null) __obj.updateDynamic("onRemove")(js.Any.fromFunction1(onRemove))
    if (renderedEl != null) __obj.updateDynamic("renderedEl")(renderedEl.asInstanceOf[js.Any])
    if (renderedText != null) __obj.updateDynamic("renderedText")(renderedText.asInstanceOf[js.Any])
    if (!js.isUndefined(showRemove)) __obj.updateDynamic("showRemove")(showRemove.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

