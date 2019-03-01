package typings
package antdLib.libConfigDashProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSPConfig extends js.Object {
  var nonce: js.UndefOr[java.lang.String] = js.undefined
}

object CSPConfig {
  @scala.inline
  def apply(nonce: java.lang.String = null): CSPConfig = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[CSPConfig]
  }
}

