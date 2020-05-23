package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssetType extends js.Object {
  var assetType: String
  var backgroundColor: String
  var first: Double
  var groupTypes: String
  var imageMargin: Double
  var imagesPerRow: Double
  var maximum: Double
  var selectSingleItem: Boolean
  var selected: js.Array[scala.Nothing]
  def callback(selectedImages: js.Any, currentImage: js.Any): Unit
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
}

