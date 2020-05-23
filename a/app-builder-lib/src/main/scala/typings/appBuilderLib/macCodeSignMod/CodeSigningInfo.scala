package typings.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeSigningInfo extends js.Object {
  var keychainFile: js.UndefOr[String | Null] = js.undefined
}

object CodeSigningInfo {
  @scala.inline
  def apply(keychainFile: js.UndefOr[Null | String] = js.undefined): CodeSigningInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keychainFile)) __obj.updateDynamic("keychainFile")(keychainFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSigningInfo]
  }
}

