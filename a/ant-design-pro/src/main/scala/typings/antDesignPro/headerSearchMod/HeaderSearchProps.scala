package typings.antDesignPro.headerSearchMod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderSearchProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var dataSource: js.UndefOr[js.Array[String]] = js.undefined
  var defaultOpen: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onPressEnter: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onSearch: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var open: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object HeaderSearchProps {
  @scala.inline
  def apply(
    className: String = null,
    dataSource: js.Array[String] = null,
    defaultOpen: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Unit = null,
    onPressEnter: /* value */ String => Unit = null,
    onSearch: /* value */ String => Unit = null,
    onVisibleChange: /* visible */ Boolean => Unit = null,
    open: js.UndefOr[Boolean] = js.undefined,
    placeholder: String = null,
    style: CSSProperties = null
  ): HeaderSearchProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultOpen)) __obj.updateDynamic("defaultOpen")(defaultOpen.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1(onPressEnter))
    if (onSearch != null) __obj.updateDynamic("onSearch")(js.Any.fromFunction1(onSearch))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderSearchProps]
  }
}

