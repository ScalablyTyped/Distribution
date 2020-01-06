package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecordTag extends js.Object {
  /**
    * The key for this tag.
    */
  var Key: js.UndefOr[RecordTagKey] = js.native
  /**
    * The value for this tag.
    */
  var Value: js.UndefOr[RecordTagValue] = js.native
}

object RecordTag {
  @scala.inline
  def apply(Key: RecordTagKey = null, Value: RecordTagValue = null): RecordTag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTag]
  }
}

