package typings.argon2.mod

import typings.argon2.argon2Numbers.`0`
import typings.argon2.argon2Numbers.`1`
import typings.argon2.argon2Numbers.`2`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var associatedData: js.UndefOr[Buffer] = js.undefined
  var hashLength: js.UndefOr[Double] = js.undefined
  var memoryCost: js.UndefOr[Double] = js.undefined
  var parallelism: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var salt: js.UndefOr[Buffer] = js.undefined
  var saltLength: js.UndefOr[Double] = js.undefined
  var secret: js.UndefOr[Buffer] = js.undefined
  var timeCost: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    associatedData: Buffer = null,
    hashLength: Int | Double = null,
    memoryCost: Int | Double = null,
    parallelism: Int | Double = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    salt: Buffer = null,
    saltLength: Int | Double = null,
    secret: Buffer = null,
    timeCost: Int | Double = null,
    `type`: `0` | `1` | `2` = null,
    version: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (associatedData != null) __obj.updateDynamic("associatedData")(associatedData.asInstanceOf[js.Any])
    if (hashLength != null) __obj.updateDynamic("hashLength")(hashLength.asInstanceOf[js.Any])
    if (memoryCost != null) __obj.updateDynamic("memoryCost")(memoryCost.asInstanceOf[js.Any])
    if (parallelism != null) __obj.updateDynamic("parallelism")(parallelism.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (timeCost != null) __obj.updateDynamic("timeCost")(timeCost.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

