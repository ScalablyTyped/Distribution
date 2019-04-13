package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopImageBuilderResult extends js.Object {
  /**
    * Information about the image builder.
    */
  var ImageBuilder: js.UndefOr[ImageBuilder] = js.undefined
}

object StopImageBuilderResult {
  @scala.inline
  def apply(ImageBuilder: ImageBuilder = null): StopImageBuilderResult = {
    val __obj = js.Dynamic.literal()
    if (ImageBuilder != null) __obj.updateDynamic("ImageBuilder")(ImageBuilder)
    __obj.asInstanceOf[StopImageBuilderResult]
  }
}

