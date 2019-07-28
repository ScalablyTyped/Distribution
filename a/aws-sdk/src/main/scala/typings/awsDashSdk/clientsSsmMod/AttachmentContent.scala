package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentContent extends js.Object {
  /**
    * The cryptographic hash value of the document content.
    */
  var Hash: js.UndefOr[AttachmentHash] = js.undefined
  /**
    * The hash algorithm used to calculate the hash value.
    */
  var HashType: js.UndefOr[AttachmentHashType] = js.undefined
  /**
    * The name of an attachment.
    */
  var Name: js.UndefOr[AttachmentName] = js.undefined
  /**
    * The size of an attachment in bytes.
    */
  var Size: js.UndefOr[ContentLength] = js.undefined
  /**
    * The URL location of the attachment content.
    */
  var Url: js.UndefOr[AttachmentUrl] = js.undefined
}

object AttachmentContent {
  @scala.inline
  def apply(
    Hash: AttachmentHash = null,
    HashType: AttachmentHashType = null,
    Name: AttachmentName = null,
    Size: js.UndefOr[ContentLength] = js.undefined,
    Url: AttachmentUrl = null
  ): AttachmentContent = {
    val __obj = js.Dynamic.literal()
    if (Hash != null) __obj.updateDynamic("Hash")(Hash)
    if (HashType != null) __obj.updateDynamic("HashType")(HashType.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    __obj.asInstanceOf[AttachmentContent]
  }
}

