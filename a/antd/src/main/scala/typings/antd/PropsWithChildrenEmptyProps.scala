package typings.antd

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.PropsWithChildren<antd.antd/lib/empty.EmptyProps> */
trait PropsWithChildrenEmptyProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[ReactNode] = js.undefined
  var image: js.UndefOr[ReactNode] = js.undefined
  /**
    * @since 3.16.0
    */
  var imageStyle: js.UndefOr[CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object PropsWithChildrenEmptyProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    description: ReactNode = null,
    image: ReactNode = null,
    imageStyle: CSSProperties = null,
    prefixCls: String = null,
    style: CSSProperties = null
  ): PropsWithChildrenEmptyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[PropsWithChildrenEmptyProps]
  }
}

