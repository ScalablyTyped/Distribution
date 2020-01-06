package typings.awsDashSdk.clientsStsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * The key for a session tag. You can pass up to 50 session tags. The plain text session tag keys can’t exceed 128 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.
    */
  var Key: tagKeyType = js.native
  /**
    * The value for a session tag. You can pass up to 50 session tags. The plain text session tag values can’t exceed 256 characters. For these and additional limits, see IAM and STS Character Limits in the IAM User Guide.
    */
  var Value: tagValueType = js.native
}

object Tag {
  @scala.inline
  def apply(Key: tagKeyType, Value: tagValueType): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

