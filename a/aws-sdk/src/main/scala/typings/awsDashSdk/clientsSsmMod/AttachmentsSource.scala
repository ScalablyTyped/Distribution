package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsSource extends js.Object {
  /**
    * The key of a key-value pair that identifies the location of an attachment to a document.
    */
  var Key: js.UndefOr[AttachmentsSourceKey] = js.native
  /**
    * The name of the document attachment file.
    */
  var Name: js.UndefOr[AttachmentIdentifier] = js.native
  /**
    * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.   For the key SourceUrl, the value is an S3 bucket location. For example:  "Values": [ "s3://my-bucket/my-folder" ]    For the key S3FileUrl, the value is a file in an S3 bucket. For example:  "Values": [ "s3://my-bucket/my-folder/my-file.py" ]    For the key AttachmentReference, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:  "Values": [ "MyOtherDocument/3/my-other-file.py" ]  However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:  "Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]   
    */
  var Values: js.UndefOr[AttachmentsSourceValues] = js.native
}

object AttachmentsSource {
  @scala.inline
  def apply(
    Key: AttachmentsSourceKey = null,
    Name: AttachmentIdentifier = null,
    Values: AttachmentsSourceValues = null
  ): AttachmentsSource = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsSource]
  }
}

