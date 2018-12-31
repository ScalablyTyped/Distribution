package typings
package arangodbLib.sessionsStoragesJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeJwtStorageOptions extends js.Object {
  var algorithm: js.UndefOr[arangodbLib.ArangoDBNs.JwtAlgorithm] = js.undefined
  var maxExp: js.UndefOr[scala.Double] = js.undefined
  var secret: java.lang.String
  var ttl: js.UndefOr[scala.Double] = js.undefined
  var verify: js.UndefOr[scala.Boolean] = js.undefined
}

