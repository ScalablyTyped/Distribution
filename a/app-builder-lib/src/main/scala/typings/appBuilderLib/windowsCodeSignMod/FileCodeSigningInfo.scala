package typings.appBuilderLib.windowsCodeSignMod

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
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileCodeSigningInfo]
  }
}

