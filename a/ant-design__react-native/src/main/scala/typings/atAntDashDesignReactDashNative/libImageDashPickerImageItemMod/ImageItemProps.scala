package typings.atAntDashDesignReactDashNative.libImageDashPickerImageItemMod

import typings.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageItemProps extends js.Object {
  var containerWidth: js.UndefOr[Double] = js.undefined
  var imageMargin: Double
  var imagesPerRow: Double
  var item: js.UndefOr[js.Any] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var selected: js.UndefOr[Boolean] = js.undefined
  var selectedMarker: js.UndefOr[Element] = js.undefined
}

object ImageItemProps {
  @scala.inline
  def apply(
    imageMargin: Double,
    imagesPerRow: Double,
    containerWidth: Int | Double = null,
    item: js.Any = null,
    onPress: /* repeated */ js.Any => _ = null,
    selected: js.UndefOr[Boolean] = js.undefined,
    selectedMarker: Element = null
  ): ImageItemProps = {
    val __obj = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
    if (containerWidth != null) __obj.updateDynamic("containerWidth")(containerWidth.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (selectedMarker != null) __obj.updateDynamic("selectedMarker")(selectedMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageItemProps]
  }
}

