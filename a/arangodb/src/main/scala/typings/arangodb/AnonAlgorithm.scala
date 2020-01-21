package typings.arangodb

import typings.arangodb.ArangoDB.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithm extends js.Object {
  var algorithm: js.UndefOr[HashAlgorithm] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
}

object AnonAlgorithm {
  @scala.inline
  def apply(algorithm: HashAlgorithm = null, secret: String = null): AnonAlgorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm.asInstanceOf[js.Any])
    if (secret != null) __obj.updateDynamic("secret")(secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithm]
  }
}

