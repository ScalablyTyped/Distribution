package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowUserKeysIncrement extends js.Object {
  var allowUserKeys: scala.Boolean
  var increment: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var `type`: arangodbLib.ArangoDBNs.KeyGeneratorType
}

object Anon_AllowUserKeysIncrement {
  @scala.inline
  def apply(
    allowUserKeys: scala.Boolean,
    `type`: arangodbLib.ArangoDBNs.KeyGeneratorType,
    increment: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null
  ): Anon_AllowUserKeysIncrement = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("allowUserKeys")(allowUserKeys)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowUserKeysIncrement]
  }
}

