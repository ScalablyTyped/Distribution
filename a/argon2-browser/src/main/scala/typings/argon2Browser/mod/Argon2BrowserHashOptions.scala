package typings.argon2Browser.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Argon2BrowserHashOptions extends js.Object {
  var distPath: js.UndefOr[String] = js.undefined
  var hashLen: js.UndefOr[Double] = js.undefined
  var mem: js.UndefOr[Double] = js.undefined
  var parallelism: js.UndefOr[Double] = js.undefined
  var pass: String | Uint8Array
  var salt: String | Uint8Array
  var time: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[ArgonType] = js.undefined
}

object Argon2BrowserHashOptions {
  @scala.inline
  def apply(
    pass: String | Uint8Array,
    salt: String | Uint8Array,
    distPath: String = null,
    hashLen: js.UndefOr[Double] = js.undefined,
    mem: js.UndefOr[Double] = js.undefined,
    parallelism: js.UndefOr[Double] = js.undefined,
    time: js.UndefOr[Double] = js.undefined,
    `type`: ArgonType = null
  ): Argon2BrowserHashOptions = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    if (distPath != null) __obj.updateDynamic("distPath")(distPath.asInstanceOf[js.Any])
    if (!js.isUndefined(hashLen)) __obj.updateDynamic("hashLen")(hashLen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mem)) __obj.updateDynamic("mem")(mem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parallelism)) __obj.updateDynamic("parallelism")(parallelism.get.asInstanceOf[js.Any])
    if (!js.isUndefined(time)) __obj.updateDynamic("time")(time.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2BrowserHashOptions]
  }
}

