package typings.arangodb

import typings.arangodb.ArangoDBNs.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: js.UndefOr[HashAlgorithm] = js.undefined
  var secret: js.UndefOr[String] = js.undefined
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: HashAlgorithm = null, secret: String = null): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

