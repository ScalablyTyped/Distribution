package typings
package arangodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: js.UndefOr[arangodbLib.ArangoDBNs.HashAlgorithm] = js.undefined
  var secret: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: arangodbLib.ArangoDBNs.HashAlgorithm = null, secret: java.lang.String = null): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    if (algorithm != null) __obj.updateDynamic("algorithm")(algorithm)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

