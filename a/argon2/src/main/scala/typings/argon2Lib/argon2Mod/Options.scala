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

