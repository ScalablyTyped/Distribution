package typings
package appDashBuilderDashLibLib.outCodeSignWindowsCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileCodeSigningInfo extends js.Object {
  val file: java.lang.String
  val password: java.lang.String | scala.Null
}

object FileCodeSigningInfo {
  @scala.inline
  def apply(file: java.lang.String, password: java.lang.String = null): FileCodeSigningInfo = {
    val __obj = js.Dynamic.literal(file = file)
    if (password != null) __obj.updateDynamic("password")(password)
    __obj.asInstanceOf[FileCodeSigningInfo]
  }
}

