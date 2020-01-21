package typings.antd.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSPConfig extends js.Object {
  var nonce: js.UndefOr[String] = js.undefined
}

object CSPConfig {
  @scala.inline
  def apply(nonce: String = null): CSPConfig = {
    val __obj = js.Dynamic.literal()
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSPConfig]
  }
}

