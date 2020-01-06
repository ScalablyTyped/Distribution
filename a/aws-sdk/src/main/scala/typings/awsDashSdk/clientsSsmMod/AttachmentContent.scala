package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentContent extends js.Object {
  /**
    * The cryptographic hash value of the document content.
    */
  var Hash: js.UndefOr[AttachmentHash] = js.native
  /**
    * The hash algorithm used to calculate the hash value.
    */
  var HashType: js.UndefOr[AttachmentHashType] = js.native
  /**
    * The name of an attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.native
  /**
    * The size of an attachment in bytes.
    */
  var Size: js.UndefOr[ContentLength] = js.native
  /**
    * The URL location of the attachment content.
    */
  var Url: js.UndefOr[AttachmentUrl] = js.native
}

object AttachmentContent {
  @scala.inline
  def apply(
    Hash: AttachmentHash = null,
    HashType: AttachmentHashType = null,
    Name: AttachmentName = null,
    Size: Int | Double = null,
    Url: AttachmentUrl = null
  ): AttachmentContent = {
    val __obj = js.Dynamic.literal()
    if (Hash != null) __obj.updateDynamic("Hash")(Hash.asInstanceOf[js.Any])
    if (HashType != null) __obj.updateDynamic("HashType")(HashType.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (Url != null) __obj.updateDynamic("Url")(Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentContent]
  }
}

