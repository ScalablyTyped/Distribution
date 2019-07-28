package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyListEntry extends js.Object {
  /**
    * ARN of the key.
    */
  var KeyArn: js.UndefOr[ArnType] = js.undefined
  /**
    * Unique identifier of the key.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.undefined
}

object KeyListEntry {
  @scala.inline
  def apply(KeyArn: ArnType = null, KeyId: KeyIdType = null): KeyListEntry = {
    val __obj = js.Dynamic.literal()
    if (KeyArn != null) __obj.updateDynamic("KeyArn")(KeyArn)
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId)
    __obj.asInstanceOf[KeyListEntry]
  }
}

