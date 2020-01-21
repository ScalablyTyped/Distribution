package typings.arangodb

import typings.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowUserKeysIncrement extends js.Object {
  var allowUserKeys: Boolean
  var increment: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var `type`: KeyGeneratorType
}

object AnonAllowUserKeysIncrement {
  @scala.inline
  def apply(
    allowUserKeys: Boolean,
    `type`: KeyGeneratorType,
    increment: Int | Double = null,
    offset: Int | Double = null
  ): AnonAllowUserKeysIncrement = {
    val __obj = js.Dynamic.literal(allowUserKeys = allowUserKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowUserKeysIncrement]
  }
}

