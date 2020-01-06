package typings.awsDashSdk.clientsEcrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageIdentifier extends js.Object {
  /**
    * The sha256 digest of the image manifest.
    */
  var imageDigest: js.UndefOr[ImageDigest] = js.native
  /**
    * The tag used for the image.
    */
  var imageTag: js.UndefOr[ImageTag] = js.native
}

object ImageIdentifier {
  @scala.inline
  def apply(imageDigest: ImageDigest = null, imageTag: ImageTag = null): ImageIdentifier = {
    val __obj = js.Dynamic.literal()
    if (imageDigest != null) __obj.updateDynamic("imageDigest")(imageDigest.asInstanceOf[js.Any])
    if (imageTag != null) __obj.updateDynamic("imageTag")(imageTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageIdentifier]
  }
}

