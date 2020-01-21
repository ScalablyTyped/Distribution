package typings.arangodb

import typings.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowUserKeys extends js.Object {
  var allowUserKeys: js.UndefOr[Boolean] = js.undefined
  var increment: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[KeyGeneratorType] = js.undefined
}

object AnonAllowUserKeys {
  @scala.inline
  def apply(
    allowUserKeys: js.UndefOr[Boolean] = js.undefined,
    increment: Int | Double = null,
    offset: Int | Double = null,
    `type`: KeyGeneratorType = null
  ): AnonAllowUserKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUserKeys)) __obj.updateDynamic("allowUserKeys")(allowUserKeys.asInstanceOf[js.Any])
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowUserKeys]
  }
}

