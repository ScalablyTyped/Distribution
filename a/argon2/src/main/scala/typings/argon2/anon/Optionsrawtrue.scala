package typings.argon2.anon

import typings.argon2.argon2Booleans.`true`
import typings.argon2.argon2Numbers.`0`
import typings.argon2.argon2Numbers.`1`
import typings.argon2.argon2Numbers.`2`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined argon2.argon2.Options & {  raw  :true} */
trait Optionsrawtrue extends js.Object {
  var associatedData: js.UndefOr[Buffer] = js.undefined
  var hashLength: js.UndefOr[Double] = js.undefined
  var memoryCost: js.UndefOr[Double] = js.undefined
  var parallelism: js.UndefOr[Double] = js.undefined
  var raw: js.UndefOr[Boolean with `true`] = js.undefined
  var salt: js.UndefOr[Buffer] = js.undefined
  var saltLength: js.UndefOr[Double] = js.undefined
  var secret: js.UndefOr[Buffer] = js.undefined
  var timeCost: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[`0` | `1` | `2`] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object Optionsrawtrue {
  @scala.inline
  def apply(
    associatedData: Buffer = null,
    hashLength: js.UndefOr[Double] = js.undefined,
    memoryCost: js.UndefOr[Double] = js.undefined,
    parallelism: js.UndefOr[Double] = js.undefined,
    raw: js.UndefOr[Boolean with `true`] = js.undefined,
    salt: Buffer = null,
    saltLength: js.UndefOr[Double] = js.undefined,
    secret: Buffer = null,
    timeCost: js.UndefOr[Double] = js.undefined,
    `type`: `0` | `1` | `2` = null,
    version: js.UndefOr[Double] = js.undefined
  ): Optionsrawtrue = {
    val __obj = js.Dynamic.literal()
    if (associatedData != null) __obj.updateDynamic("associatedData")(associatedData.asInstanceOf[js.Any])
    if (!js.isUndefined(hashLength)) __obj.updateDynamic("hashLength")(hashLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memoryCost)) __obj.updateDynamic("memoryCost")(memoryCost.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelism)) __obj.updateDynamic("parallelism")(parallelism.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    if (!js.isUndefined(saltLength)) __obj.updateDynamic("saltLength")(saltLength.get.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    if (!js.isUndefined(timeCost)) __obj.updateDynamic("timeCost")(timeCost.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optionsrawtrue]
  }
}

