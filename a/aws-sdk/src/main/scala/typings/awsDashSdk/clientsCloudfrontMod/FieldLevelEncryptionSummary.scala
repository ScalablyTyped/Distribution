package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryptionSummary extends js.Object {
  /**
    * An optional comment about the field-level encryption item.
    */
  var Comment: js.UndefOr[String] = js.undefined
  /**
    *  A summary of a content type-profile mapping. 
    */
  var ContentTypeProfileConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.ContentTypeProfileConfig] = js.undefined
  /**
    * The unique ID of a field-level encryption item.
    */
  var Id: String
  /**
    * The last time that the summary of field-level encryption items was modified.
    */
  var LastModifiedTime: timestamp
  /**
    *  A summary of a query argument-profile mapping. 
    */
  var QueryArgProfileConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.QueryArgProfileConfig] = js.undefined
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
    val __obj = js.Dynamic.literal(Id = Id, LastModifiedTime = LastModifiedTime)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (ContentTypeProfileConfig != null) __obj.updateDynamic("ContentTypeProfileConfig")(ContentTypeProfileConfig)
    if (QueryArgProfileConfig != null) __obj.updateDynamic("QueryArgProfileConfig")(QueryArgProfileConfig)
    __obj.asInstanceOf[FieldLevelEncryptionSummary]
  }
}

