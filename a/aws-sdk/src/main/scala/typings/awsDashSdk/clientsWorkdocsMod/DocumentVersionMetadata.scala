package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentVersionMetadata extends js.Object {
  /**
    * The timestamp when the content of the document was originally created.
    */
  var ContentCreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The timestamp when the content of the document was modified.
    */
  var ContentModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The content type of the document.
    */
  var ContentType: js.UndefOr[DocumentContentType] = js.undefined
  /**
    * The timestamp when the document was first uploaded.
    */
  var CreatedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The ID of the creator.
    */
  var CreatorId: js.UndefOr[IdType] = js.undefined
  /**
    * The ID of the version.
    */
  var Id: js.UndefOr[DocumentVersionIdType] = js.undefined
  /**
    * The timestamp when the document was last uploaded.
    */
  var ModifiedTimestamp: js.UndefOr[TimestampType] = js.undefined
  /**
    * The name of the version.
    */
  var Name: js.UndefOr[ResourceNameType] = js.undefined
  /**
    * The signature of the document.
    */
  var Signature: js.UndefOr[HashType] = js.undefined
  /**
    * The size of the document, in bytes.
    */
  var Size: js.UndefOr[SizeType] = js.undefined
  /**
    * The source of the document.
    */
  var Source: js.UndefOr[DocumentSourceUrlMap] = js.undefined
  /**
    * The status of the document.
    */
  var Status: js.UndefOr[DocumentStatusType] = js.undefined
  /**
    * The thumbnail of the document.
    */
  var Thumbnail: js.UndefOr[DocumentThumbnailUrlMap] = js.undefined
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
    if (ContentCreatedTimestamp != null) __obj.updateDynamic("ContentCreatedTimestamp")(ContentCreatedTimestamp)
    if (ContentModifiedTimestamp != null) __obj.updateDynamic("ContentModifiedTimestamp")(ContentModifiedTimestamp)
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp)
    if (CreatorId != null) __obj.updateDynamic("CreatorId")(CreatorId)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (ModifiedTimestamp != null) __obj.updateDynamic("ModifiedTimestamp")(ModifiedTimestamp)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Signature != null) __obj.updateDynamic("Signature")(Signature)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Thumbnail != null) __obj.updateDynamic("Thumbnail")(Thumbnail)
    __obj.asInstanceOf[DocumentVersionMetadata]
  }
}

