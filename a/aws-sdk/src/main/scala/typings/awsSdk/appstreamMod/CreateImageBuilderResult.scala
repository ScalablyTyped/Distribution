package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateImageBuilderResult extends js.Object {
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[typings.awsSdk.appstreamMod.ImageBuilder] = js.native
}

object CreateImageBuilderResult {
  @scala.inline
  def apply(ImageBuilder: ImageBuilder = null): CreateImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilder != null) __obj.updateDynamic("ImageBuilder")(ImageBuilder.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateImageBuilderResult]
  }
}

