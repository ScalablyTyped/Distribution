package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartImageBuilderResult extends js.Object {
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ImageBuilder] = js.undefined
}

object StartImageBuilderResult {
  @scala.inline
  def apply(ImageBuilder: ImageBuilder = null): StartImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilder != null) __obj.updateDynamic("ImageBuilder")(ImageBuilder)
    __obj.asInstanceOf[StartImageBuilderResult]
  }
}

