package typings.antDesignReactNative.imageItemMod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageItemProps extends js.Object {
  var containerWidth: js.UndefOr[Double] = js.native
  var imageMargin: Double = js.native
  var imagesPerRow: Double = js.native
  var item: js.UndefOr[js.Any] = js.native
  var onPress: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var selected: js.UndefOr[Boolean] = js.native
  var selectedMarker: js.UndefOr[Element] = js.native
}

object ImageItemProps {
  @scala.inline
  def apply(imageMargin: Double, imagesPerRow: Double): ImageItemProps = {
    val __obj = js.Dynamic.literal(imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageItemProps]
  }
  @scala.inline
  implicit class ImageItemPropsOps[Self <: ImageItemProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageMargin(value: Double): Self = this.set("imageMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesPerRow(value: Double): Self = this.set("imagesPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerWidth: Self = this.set("containerWidth", js.undefined)
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    @scala.inline
    def setOnPress(value: /* repeated */ js.Any => _): Self = this.set("onPress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPress: Self = this.set("onPress", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectedMarker(value: Element): Self = this.set("selectedMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedMarker: Self = this.set("selectedMarker", js.undefined)
  }
  
}

