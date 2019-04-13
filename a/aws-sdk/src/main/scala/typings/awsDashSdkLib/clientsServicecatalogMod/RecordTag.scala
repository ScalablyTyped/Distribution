package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordTag extends js.Object {
  /**
    * The key for this tag.
    */
  var Key: js.UndefOr[RecordTagKey] = js.undefined
  /**
    * The value for this tag.
    */
  var Value: js.UndefOr[RecordTagValue] = js.undefined
}

object RecordTag {
  @scala.inline
  def apply(Key: RecordTagKey = null, Value: RecordTagValue = null): RecordTag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[RecordTag]
  }
}

