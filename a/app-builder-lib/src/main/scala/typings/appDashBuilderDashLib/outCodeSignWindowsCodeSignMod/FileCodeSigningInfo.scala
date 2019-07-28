package typings.appDashBuilderDashLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCodeSigningInfo extends js.Object {
  val file: String
  val password: String | Null
}

object FileCodeSigningInfo {
  @scala.inline
  def apply(file: String, password: String = null): FileCodeSigningInfo = {
    val __obj = js.Dynamic.literal(file = file)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[FileCodeSigningInfo]
  }
}

