package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentVersionMetadata extends js.Object {
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.native
  /**
    * The timestamp when the document was first uploaded.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.native
  /**
    * The ID of the version.
    */
  var Id: js.UndefOr[DocumentVersionIdType] = js.native
  /**
    * The timestamp when the document was last uploaded.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.native
  /**
    * The name of the version.
    */
  var Name: js.UndefOr[ResourceNameType] = js.native
  /**
    * The signature of the document.
    */
  var Signature: js.UndefOr[HashType] = js.native
  /**
    * The size of the document, in bytes.
    */
  var Size: js.UndefOr[SizeType] = js.native
  /**
    * The source of the document.
    */
  var Source: js.UndefOr[DocumentSourceUrlMap] = js.native
  /**
    * The status of the document.
    */
  var Status: js.UndefOr[DocumentStatusType] = js.native
  /**
    * The thumbnail of the document.
    */
  var Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.native
}

object DocumentVersionMetadata {
  @scala.inline
  def apply(
    ContentCreatedTimestamp: TimestampType = null,
    ContentModifiedTimestamp: TimestampType = null,
    ContentType: DocumentContentType = null,
    CreatedTimestamp: TimestampType = null,
    CreatorId: IdType = null,
    Id: DocumentVersionIdType = null,
    ModifiedTimestamp: TimestampType = null,
    Name: ResourceNameType = null,
    Signature: HashType = null,
    Size: Int | Double = null,
    Source: DocumentSourceUrlMap = null,
    Status: DocumentStatusType = null,
    Thumbnail: DocumentThumbnailUrlMap = null
  ): DocumentVersionMetadata = {
    val __obj = js.Dynamic.literal()
    if (ContentCreatedTimestamp != null) __obj.updateDynamic("ContentCreatedTimestamp")(ContentCreatedTimestamp.asInstanceOf[js.Any])
    if (ContentModifiedTimestamp != null) __obj.updateDynamic("ContentModifiedTimestamp")(ContentModifiedTimestamp.asInstanceOf[js.Any])
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Signature != null) __obj.updateDynamic("Signature")(Signature.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Thumbnail != null) __obj.updateDynamic("Thumbnail")(Thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentVersionMetadata]
  }
}

