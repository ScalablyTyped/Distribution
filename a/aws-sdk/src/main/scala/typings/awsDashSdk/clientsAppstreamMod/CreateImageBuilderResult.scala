package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImageBuilderResult extends js.Object {
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.ImageBuilder] = js.undefined
}

object CreateImageBuilderResult {
  @scala.inline
  def apply(ImageBuilder: ImageBuilder = null): CreateImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilder != null) __obj.updateDynamic("ImageBuilder")(ImageBuilder)
    __obj.asInstanceOf[CreateImageBuilderResult]
  }
}

