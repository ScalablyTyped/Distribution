package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetType extends js.Object {
  var assetType: String = js.native
  var backgroundColor: String = js.native
  var first: Double = js.native
  var groupTypes: String = js.native
  var imageMargin: Double = js.native
  var imagesPerRow: Double = js.native
  var maximum: Double = js.native
  var selectSingleItem: Boolean = js.native
  var selected: js.Array[scala.Nothing] = js.native
  def callback(selectedImages: js.Any, currentImage: js.Any): Unit = js.native
}

object AssetType {
  @scala.inline
  def apply(
    assetType: String,
    backgroundColor: String,
    callback: (js.Any, js.Any) => Unit,
    first: Double,
    groupTypes: String,
    imageMargin: Double,
    imagesPerRow: Double,
    maximum: Double,
    selectSingleItem: Boolean,
    selected: js.Array[scala.Nothing]
  ): AssetType = {
    val __obj = js.Dynamic.literal(assetType = assetType.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], callback = js.Any.fromFunction2(callback), first = first.asInstanceOf[js.Any], groupTypes = groupTypes.asInstanceOf[js.Any], imageMargin = imageMargin.asInstanceOf[js.Any], imagesPerRow = imagesPerRow.asInstanceOf[js.Any], maximum = maximum.asInstanceOf[js.Any], selectSingleItem = selectSingleItem.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssetType]
  }
  @scala.inline
  implicit class AssetTypeOps[Self <: AssetType] (val x: Self) extends AnyVal {
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
    def setAssetType(value: String): Self = this.set("assetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallback(value: (js.Any, js.Any) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def setFirst(value: Double): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupTypes(value: String): Self = this.set("groupTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageMargin(value: Double): Self = this.set("imageMargin", value.asInstanceOf[js.Any])
    @scala.inline
    def setImagesPerRow(value: Double): Self = this.set("imagesPerRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaximum(value: Double): Self = this.set("maximum", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectSingleItem(value: Boolean): Self = this.set("selectSingleItem", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectedVarargs(value: scala.Nothing*): Self = this.set("selected", js.Array(value :_*))
    @scala.inline
    def setSelected(value: js.Array[scala.Nothing]): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

