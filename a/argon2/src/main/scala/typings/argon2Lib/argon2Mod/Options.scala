package typings
package argon2Lib.argon2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var hashLength: js.UndefOr[scala.Double] = js.undefined
  var memoryCost: js.UndefOr[scala.Double] = js.undefined
  var parallelism: js.UndefOr[scala.Double] = js.undefined
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  var salt: js.UndefOr[nodeLib.Buffer] = js.undefined
  var saltLength: js.UndefOr[scala.Double] = js.undefined
  var timeCost: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[
    argon2Lib.argon2LibNumbers.`0` | argon2Lib.argon2LibNumbers.`1` | argon2Lib.argon2LibNumbers.`2`
  ] = js.undefined
  var version: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    hashLength: scala.Int | scala.Double = null,
    memoryCost: scala.Int | scala.Double = null,
    parallelism: scala.Int | scala.Double = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    salt: nodeLib.Buffer = null,
    saltLength: scala.Int | scala.Double = null,
    timeCost: scala.Int | scala.Double = null,
    `type`: argon2Lib.argon2LibNumbers.`0` | argon2Lib.argon2LibNumbers.`1` | argon2Lib.argon2LibNumbers.`2` = null,
    version: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (hashLength != null) __obj.updateDynamic("hashLength")(hashLength.asInstanceOf[js.Any])
    if (memoryCost != null) __obj.updateDynamic("memoryCost")(memoryCost.asInstanceOf[js.Any])
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    if (timeCost != null) __obj.updateDynamic("timeCost")(timeCost.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

