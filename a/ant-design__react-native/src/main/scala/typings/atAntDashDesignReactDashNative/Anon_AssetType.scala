package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetType extends js.Object {
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

object Anon_AssetType {
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
  ): Anon_AssetType = {
    val __obj = js.Dynamic.literal(assetType = assetType, backgroundColor = backgroundColor, callback = js.Any.fromFunction2(callback), first = first, groupTypes = groupTypes, imageMargin = imageMargin, imagesPerRow = imagesPerRow, maximum = maximum, selectSingleItem = selectSingleItem, selected = selected)
  
    __obj.asInstanceOf[Anon_AssetType]
  }
}

