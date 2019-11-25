package typings.antd.esBreadcrumbBreadcrumbMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BreadcrumbProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var itemRender: js.UndefOr[
    js.Function4[
      /* route */ Route, 
      /* params */ js.Any, 
      /* routes */ js.Array[Route], 
      /* paths */ js.Array[String], 
      ReactNode
    ]
  ] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var routes: js.UndefOr[js.Array[Route]] = js.undefined
  var separator: js.UndefOr[ReactNode] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object BreadcrumbProps {
  @scala.inline
  def apply(
    className: String = null,
    itemRender: (/* route */ Route, /* params */ js.Any, /* routes */ js.Array[Route], /* paths */ js.Array[String]) => ReactNode = null,
    params: js.Any = null,
    prefixCls: String = null,
    routes: js.Array[Route] = null,
    separator: ReactNode = null,
    style: CSSProperties = null
  ): BreadcrumbProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(js.Any.fromFunction4(itemRender))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreadcrumbProps]
  }
}

