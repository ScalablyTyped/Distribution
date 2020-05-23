package typings.arangodb.anon

import typings.arangodb.ArangoDB.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Increment extends js.Object {
  var allowUserKeys: Boolean
  var increment: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var `type`: KeyGeneratorType
}

object Increment {
  @scala.inline
  def apply(
    allowUserKeys: Boolean,
    `type`: KeyGeneratorType,
    increment: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined
  ): Increment = {
    val __obj = js.Dynamic.literal(allowUserKeys = allowUserKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(increment)) __obj.updateDynamic("increment")(increment.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Increment]
  }
}

