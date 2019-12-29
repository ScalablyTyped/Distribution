package typings.antDashDesignDashPro.libAvatarListMod

import typings.antDashDesignDashPro.libAvatarListAvatarItemMod.SizeType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvatarListProps extends js.Object {
  var Item: js.UndefOr[ReactElement] = js.undefined
  var children: ReactElement | js.Array[ReactElement]
  var excessItemsStyle: js.UndefOr[CSSProperties] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[SizeType] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object AvatarListProps {
  @scala.inline
  def apply(
    children: ReactElement | js.Array[ReactElement],
    Item: ReactElement = null,
    excessItemsStyle: CSSProperties = null,
    maxLength: Int | Double = null,
    size: SizeType = null,
    style: CSSProperties = null
  ): AvatarListProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (excessItemsStyle != null) __obj.updateDynamic("excessItemsStyle")(excessItemsStyle.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvatarListProps]
  }
}

