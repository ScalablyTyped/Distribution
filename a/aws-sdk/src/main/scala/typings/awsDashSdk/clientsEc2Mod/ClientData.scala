package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientData extends js.Object {
  /**
    * A user-defined comment about the disk upload.
    */
  var Comment: js.UndefOr[String] = js.undefined
  /**
    * The time that the disk upload ends.
    */
  var UploadEnd: js.UndefOr[DateTime] = js.undefined
  /**
    * The size of the uploaded disk image, in GiB.
    */
  var UploadSize: js.UndefOr[Double] = js.undefined
  /**
    * The time that the disk upload starts.
    */
  var UploadStart: js.UndefOr[DateTime] = js.undefined
}

object ClientData {
  @scala.inline
  def apply(
    Comment: String = null,
    UploadEnd: DateTime = null,
    UploadSize: Int | scala.Double = null,
    UploadStart: DateTime = null
  ): ClientData = {
    val __obj = js.Dynamic.literal()
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (UploadEnd != null) __obj.updateDynamic("UploadEnd")(UploadEnd)
    if (UploadSize != null) __obj.updateDynamic("UploadSize")(UploadSize.asInstanceOf[js.Any])
    if (UploadStart != null) __obj.updateDynamic("UploadStart")(UploadStart)
    __obj.asInstanceOf[ClientData]
  }
}

