package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssetType extends js.Object {
  var assetType: java.lang.String
  var backgroundColor: java.lang.String
  var first: scala.Double
  var groupTypes: java.lang.String
  var imageMargin: scala.Double
  var imagesPerRow: scala.Double
  var maximum: scala.Double
  var selectSingleItem: scala.Boolean
  var selected: js.Array[scala.Nothing]
  def callback(selectedImages: js.Any, currentImage: js.Any): scala.Unit
}

object Anon_AssetType {
  @scala.inline
  def apply(
    assetType: java.lang.String,
    backgroundColor: java.lang.String,
    callback: (js.Any, js.Any) => scala.Unit,
    first: scala.Double,
    groupTypes: java.lang.String,
    imageMargin: scala.Double,
    imagesPerRow: scala.Double,
    maximum: scala.Double,
    selectSingleItem: scala.Boolean,
    selected: js.Array[scala.Nothing]
  ): Anon_AssetType = {
    val __obj = js.Dynamic.literal(assetType = assetType, backgroundColor = backgroundColor, callback = js.Any.fromFunction2(callback), first = first, groupTypes = groupTypes, imageMargin = imageMargin, imagesPerRow = imagesPerRow, maximum = maximum, selectSingleItem = selectSingleItem, selected = selected)
  
    __obj.asInstanceOf[Anon_AssetType]
  }
}

