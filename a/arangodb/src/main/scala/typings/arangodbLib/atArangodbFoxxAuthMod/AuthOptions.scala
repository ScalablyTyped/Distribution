package typings
package arangodbLib.atArangodbFoxxAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var method: js.UndefOr[arangodbLib.ArangoDBNs.HashAlgorithm] = js.undefined
  var saltLength: js.UndefOr[scala.Double] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(method: arangodbLib.ArangoDBNs.HashAlgorithm = null, saltLength: scala.Int | scala.Double = null): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

