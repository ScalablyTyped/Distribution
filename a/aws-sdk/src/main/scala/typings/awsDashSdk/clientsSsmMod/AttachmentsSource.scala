package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsSource extends js.Object {
  /**
    * The key of a key and value pair that identifies the location of an attachment to a document.
    */
  var Key: js.UndefOr[AttachmentsSourceKey] = js.undefined
  /**
    * The URL of the location of a document attachment, such as the URL of an Amazon S3 bucket.
    */
  var Values: js.UndefOr[AttachmentsSourceValues] = js.undefined
}

object AttachmentsSource {
  @scala.inline
  def apply(Key: AttachmentsSourceKey = null, Values: AttachmentsSourceValues = null): AttachmentsSource = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[AttachmentsSource]
  }
}

