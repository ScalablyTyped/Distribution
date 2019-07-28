package typings.arangodb

import typings.arangodb.ArangoDBNs.KeyGeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowUserKeysIncrement extends js.Object {
  var allowUserKeys: Boolean
  var increment: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var `type`: KeyGeneratorType
}

object Anon_AllowUserKeysIncrement {
  @scala.inline
  def apply(
    allowUserKeys: Boolean,
    `type`: KeyGeneratorType,
    increment: Int | Double = null,
    offset: Int | Double = null
  ): Anon_AllowUserKeysIncrement = {
    val __obj = js.Dynamic.literal(allowUserKeys = allowUserKeys)
    __obj.updateDynamic("type")(`type`)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowUserKeysIncrement]
  }
}

