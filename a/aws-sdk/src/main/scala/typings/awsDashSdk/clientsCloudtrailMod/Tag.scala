package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key in a key-value pair. The key must be must be no longer than 128 Unicode characters. The key must be unique for the resource to which it applies.
    */
  var Key: String
  /**
    * The value in a key-value pair of a tag. The value must be no longer than 256 Unicode characters.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object Tag {
  @scala.inline
  def apply(Key: String, Value: String = null): Tag = {
    val __obj = js.Dynamic.literal(Key = Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Tag]
  }
}

