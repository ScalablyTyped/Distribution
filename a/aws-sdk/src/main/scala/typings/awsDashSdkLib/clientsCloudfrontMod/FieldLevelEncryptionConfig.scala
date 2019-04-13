package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldLevelEncryptionConfig extends js.Object {
  /**
    * A unique number that ensures the request can't be replayed.
    */
  var CallerReference: java.lang.String
  /**
    * An optional comment about the configuration.
    */
  var Comment: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A complex data type that specifies when to forward content if a content type isn't recognized and profiles to use as by default in a request if a query argument doesn't specify a profile to use.
    */
  var ContentTypeProfileConfig: js.UndefOr[ContentTypeProfileConfig] = js.undefined
  /**
    * A complex data type that specifies when to forward content if a profile isn't found and the profile that can be provided as a query argument in a request.
    */
  var QueryArgProfileConfig: js.UndefOr[QueryArgProfileConfig] = js.undefined
}

object FieldLevelEncryptionConfig {
  @scala.inline
  def apply(
    CallerReference: java.lang.String,
    Comment: java.lang.String = null,
    ContentTypeProfileConfig: ContentTypeProfileConfig = null,
    QueryArgProfileConfig: QueryArgProfileConfig = null
  ): FieldLevelEncryptionConfig = {
    val __obj = js.Dynamic.literal(CallerReference = CallerReference)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    if (ContentTypeProfileConfig != null) __obj.updateDynamic("ContentTypeProfileConfig")(ContentTypeProfileConfig)
    if (QueryArgProfileConfig != null) __obj.updateDynamic("QueryArgProfileConfig")(QueryArgProfileConfig)
    __obj.asInstanceOf[FieldLevelEncryptionConfig]
  }
}

