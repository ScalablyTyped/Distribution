package typings.antd

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import typings.react.reactMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/empty.EmptyProps> */
trait WeakValidationMapEmptyProps extends js.Object {
  var children: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var description: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var image: js.UndefOr[Validator[js.UndefOr[Null | ReactNode]]] = js.undefined
  var imageStyle: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
  var prefixCls: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var style: js.UndefOr[Validator[js.UndefOr[CSSProperties | Null]]] = js.undefined
}

object WeakValidationMapEmptyProps {
  @scala.inline
  def apply(
    children: Validator[js.UndefOr[Null | ReactNode]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    description: Validator[js.UndefOr[Null | ReactNode]] = null,
    image: Validator[js.UndefOr[Null | ReactNode]] = null,
    imageStyle: Validator[js.UndefOr[CSSProperties | Null]] = null,
    prefixCls: Validator[js.UndefOr[Null | String]] = null,
    style: Validator[js.UndefOr[CSSProperties | Null]] = null
  ): WeakValidationMapEmptyProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (description != null) __obj.updateDynamic("description")(description)
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[WeakValidationMapEmptyProps]
  }
}

