package typings.antDesignPro.noticeIconMod

import typings.antDesignPro.anon.Dictkey
import typings.antDesignPro.noticeIconTabMod.NoticeIconData
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoticeIconProps extends js.Object {
  var bell: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var clearClose: js.UndefOr[Boolean] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var locale: js.UndefOr[Dictkey] = js.undefined
  var onClear: js.UndefOr[js.Function1[/* tabName */ String, Unit]] = js.undefined
  var onItemClick: js.UndefOr[js.Function2[/* item */ NoticeIconData, /* tabProps */ NoticeIconProps, Unit]] = js.undefined
  var onPopupVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* tabTile */ String, Unit]] = js.undefined
  var onViewMore: js.UndefOr[js.Function2[/* tabProps */ NoticeIconProps, /* e */ MouseEvent, Unit]] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object NoticeIconProps {
  @scala.inline
  def apply(
    bell: ReactNode = null,
    className: String = null,
    clearClose: js.UndefOr[Boolean] = js.undefined,
    count: js.UndefOr[Double] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    locale: Dictkey = null,
    onClear: /* tabName */ String => Unit = null,
    onItemClick: (/* item */ NoticeIconData, /* tabProps */ NoticeIconProps) => Unit = null,
    onPopupVisibleChange: /* visible */ Boolean => Unit = null,
    onTabChange: /* tabTile */ String => Unit = null,
    onViewMore: (/* tabProps */ NoticeIconProps, /* e */ MouseEvent) => Unit = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
  ): NoticeIconProps = {
    val __obj = js.Dynamic.literal()
    if (bell != null) __obj.updateDynamic("bell")(bell.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clearClose)) __obj.updateDynamic("clearClose")(clearClose.get.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1(onClear))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onPopupVisibleChange != null) __obj.updateDynamic("onPopupVisibleChange")(js.Any.fromFunction1(onPopupVisibleChange))
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1(onTabChange))
    if (onViewMore != null) __obj.updateDynamic("onViewMore")(js.Any.fromFunction2(onViewMore))
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticeIconProps]
  }
}

