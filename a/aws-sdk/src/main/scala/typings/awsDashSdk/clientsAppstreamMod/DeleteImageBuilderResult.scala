package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteImageBuilderResult extends js.Object {
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ImageBuilder] = js.undefined
}

object DeleteImageBuilderResult {
  @scala.inline
  def apply(ImageBuilder: ImageBuilder = null): DeleteImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilder != null) __obj.updateDynamic("ImageBuilder")(ImageBuilder)
    __obj.asInstanceOf[DeleteImageBuilderResult]
  }
}

