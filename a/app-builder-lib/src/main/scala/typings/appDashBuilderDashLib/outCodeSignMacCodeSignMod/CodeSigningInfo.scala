package typings.appDashBuilderDashLib.outCodeSignMacCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeSigningInfo extends js.Object {
  var keychainFile: js.UndefOr[String | Null] = js.undefined
}

object CodeSigningInfo {
  @scala.inline
  def apply(keychainFile: String = null): CodeSigningInfo = {
    val __obj = js.Dynamic.literal()
    if (keychainFile != null) __obj.updateDynamic("keychainFile")(keychainFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSigningInfo]
  }
}

