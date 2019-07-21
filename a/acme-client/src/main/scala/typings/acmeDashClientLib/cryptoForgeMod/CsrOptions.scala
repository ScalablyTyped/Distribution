package typings
package acmeDashClientLib.cryptoForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsrOptions extends js.Object {
  var altNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var commonName: js.UndefOr[java.lang.String] = js.undefined
  var keySize: js.UndefOr[scala.Double] = js.undefined
}

object CsrOptions {
  @scala.inline
  def apply(
    altNames: js.Array[java.lang.String] = null,
    commonName: java.lang.String = null,
    keySize: scala.Int | scala.Double = null
  ): CsrOptions = {
    val __obj = js.Dynamic.literal()
    if (altNames != null) __obj.updateDynamic("altNames")(altNames)
    if (commonName != null) __obj.updateDynamic("commonName")(commonName)
    if (keySize != null) __obj.updateDynamic("keySize")(keySize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsrOptions]
  }
}

