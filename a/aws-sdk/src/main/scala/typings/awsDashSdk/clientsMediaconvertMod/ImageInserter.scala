package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageInserter extends js.Object {
  /**
    * Specify the images that you want to overlay on your video. The images must be PNG or TGA files.
    */
  var InsertableImages: js.UndefOr[__listOfInsertableImage] = js.undefined
}

object ImageInserter {
  @scala.inline
  def apply(InsertableImages: __listOfInsertableImage = null): ImageInserter = {
    val __obj = js.Dynamic.literal()
    if (InsertableImages != null) __obj.updateDynamic("InsertableImages")(InsertableImages)
    __obj.asInstanceOf[ImageInserter]
  }
}

