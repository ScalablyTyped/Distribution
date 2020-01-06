package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tag extends js.Object {
  /**
    * Name of the tag.
    */
  var Key: ObjectKey = js.native
  /**
    * Value of the tag.
    */
  var Value: typings.awsDashSdk.clientsS3Mod.Value = js.native
}

object Tag {
  @scala.inline
  def apply(Key: ObjectKey, Value: Value): Tag = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tag]
  }
}

