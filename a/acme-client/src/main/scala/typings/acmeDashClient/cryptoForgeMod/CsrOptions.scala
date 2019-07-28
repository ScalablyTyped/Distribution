package typings.acmeDashClient.cryptoForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsrOptions extends js.Object {
  var altNames: js.UndefOr[js.Array[String]] = js.undefined
  var commonName: js.UndefOr[String] = js.undefined
  var keySize: js.UndefOr[Double] = js.undefined
}

object CsrOptions {
  @scala.inline
  def apply(altNames: js.Array[String] = null, commonName: String = null, keySize: Int | Double = null): CsrOptions = {
    val __obj = js.Dynamic.literal()
    if (altNames != null) __obj.updateDynamic("altNames")(altNames)
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    if (keySize != null) __obj.updateDynamic("keySize")(keySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsrOptions]
  }
}

