package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutImageResponse extends js.Object {
  /**
    * Details of the image uploaded.
    */
  var image: js.UndefOr[Image] = js.undefined
}

object PutImageResponse {
  @scala.inline
  def apply(image: Image = null): PutImageResponse = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    __obj.asInstanceOf[PutImageResponse]
  }
}

