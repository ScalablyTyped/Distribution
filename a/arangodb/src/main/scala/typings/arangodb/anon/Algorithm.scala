package typings.arangodb.anon

import typings.arangodb.ArangoDB.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Algorithm extends js.Object {
  var algorithm: js.UndefOr[HashAlgorithm] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
}

object Algorithm {
  @scala.inline
  def apply(algorithm: HashAlgorithm = null, secret: String = null): Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
}

