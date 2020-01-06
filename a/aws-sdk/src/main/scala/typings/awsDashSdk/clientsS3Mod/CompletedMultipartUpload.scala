package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedMultipartUpload extends js.Object {
  /**
    * Array of CompletedPart data types.
    */
  var Parts: js.UndefOr[CompletedPartList] = js.native
}

object CompletedMultipartUpload {
  @scala.inline
  def apply(Parts: CompletedPartList = null): CompletedMultipartUpload = {
    val __obj = js.Dynamic.literal()
    if (Parts != null) __obj.updateDynamic("Parts")(Parts.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedMultipartUpload]
  }
}

