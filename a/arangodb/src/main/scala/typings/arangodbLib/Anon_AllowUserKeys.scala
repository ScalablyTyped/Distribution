package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowUserKeys extends js.Object {
  var allowUserKeys: js.UndefOr[scala.Boolean] = js.undefined
  var increment: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[arangodbLib.ArangoDBNs.KeyGeneratorType] = js.undefined
}

object Anon_AllowUserKeys {
  @scala.inline
  def apply(
    allowUserKeys: js.UndefOr[scala.Boolean] = js.undefined,
    increment: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    `type`: arangodbLib.ArangoDBNs.KeyGeneratorType = null
  ): Anon_AllowUserKeys = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUserKeys)) __obj.updateDynamic("allowUserKeys")(allowUserKeys)
    if (increment != null) __obj.updateDynamic("increment")(increment.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AllowUserKeys]
  }
}

