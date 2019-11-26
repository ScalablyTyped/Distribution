package typings.arangodb.atArangodbFoxxAuthMod

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
  def apply(method: HashAlgorithm = null, saltLength: Int | Double = null): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (saltLength != null) __obj.updateDynamic("saltLength")(saltLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthOptions]
  }
}

