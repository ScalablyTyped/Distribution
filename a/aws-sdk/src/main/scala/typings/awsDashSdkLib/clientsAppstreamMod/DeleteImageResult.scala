package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteImageResult extends js.Object {
  /**
    * Information about the image.
    */
  var Image: js.UndefOr[Image] = js.undefined
}

object DeleteImageResult {
  @scala.inline
  def apply(Image: Image = null): DeleteImageResult = {
    val __obj = js.Dynamic.literal()
    if (Image != null) __obj.updateDynamic("Image")(Image)
    __obj.asInstanceOf[DeleteImageResult]
  }
}

