package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<antd.antd/lib/empty.EmptyProps> */
trait WeakValidationMapEmptyProps extends js.Object {
  var children: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var className: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var description: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var image: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]]
  ] = js.undefined
  var imageStyle: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]]
  ] = js.undefined
  var prefixCls: js.UndefOr[reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]]] = js.undefined
  var style: js.UndefOr[
    reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]]
  ] = js.undefined
}

object WeakValidationMapEmptyProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    className: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    description: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    image: reactLib.reactMod.Validator[js.UndefOr[scala.Null | reactLib.reactMod.ReactNode]] = null,
    imageStyle: reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]] = null,
    prefixCls: reactLib.reactMod.Validator[js.UndefOr[scala.Null | java.lang.String]] = null,
    style: reactLib.reactMod.Validator[js.UndefOr[reactLib.reactMod.CSSProperties | scala.Null]] = null
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

