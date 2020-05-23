package typings.arangodb.authMod

import typings.arangodb.ArangoDB.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var method: js.UndefOr[HashAlgorithm] = js.undefined
  var saltLength: js.UndefOr[Double] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(method: HashAlgorithm = null, saltLength: js.UndefOr[Double] = js.undefined): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(saltLength)) __obj.updateDynamic("saltLength")(saltLength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

