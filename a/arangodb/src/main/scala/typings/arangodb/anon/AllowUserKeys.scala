package typings.arangodb.anon

import typings.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowUserKeys extends js.Object {
  var allowUserKeys: js.UndefOr[Boolean] = js.undefined
  var increment: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[KeyGeneratorType] = js.undefined
}

object AllowUserKeys {
  @scala.inline
  def apply(
    allowUserKeys: js.UndefOr[Boolean] = js.undefined,
    increment: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    `type`: KeyGeneratorType = null
  ): AllowUserKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUserKeys)) __obj.updateDynamic("allowUserKeys")(allowUserKeys.get.asInstanceOf[js.Any])
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowUserKeys]
  }
}

