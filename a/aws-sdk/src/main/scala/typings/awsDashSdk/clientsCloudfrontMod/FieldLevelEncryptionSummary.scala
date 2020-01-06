package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldLevelEncryptionSummary extends js.Object {
  /**
    * An optional comment about the field-level encryption item.
    */
  var Comment: js.UndefOr[String] = js.native
  /**
    *  A summary of a content type-profile mapping. 
    */
  var ContentTypeProfileConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.ContentTypeProfileConfig] = js.native
  /**
    * The unique ID of a field-level encryption item.
    */
  var Id: String = js.native
  /**
    * The last time that the summary of field-level encryption items was modified.
    */
  var LastModifiedTime: timestamp = js.native
  /**
    *  A summary of a query argument-profile mapping. 
    */
  var QueryArgProfileConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.QueryArgProfileConfig] = js.native
}

object FieldLevelEncryptionSummary {
  @scala.inline
  def apply(
    Id: String,
    LastModifiedTime: timestamp,
    Comment: String = null,
    ContentTypeProfileConfig: ContentTypeProfileConfig = null,
    QueryArgProfileConfig: QueryArgProfileConfig = null
  ): FieldLevelEncryptionSummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (ContentTypeProfileConfig != null) __obj.updateDynamic("ContentTypeProfileConfig")(ContentTypeProfileConfig.asInstanceOf[js.Any])
    if (QueryArgProfileConfig != null) __obj.updateDynamic("QueryArgProfileConfig")(QueryArgProfileConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldLevelEncryptionSummary]
  }
}

