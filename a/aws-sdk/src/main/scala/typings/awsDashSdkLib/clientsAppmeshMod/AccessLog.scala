package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessLog extends js.Object {
  /**
    * The file object to send virtual node access logs to.
    */
  var file: js.UndefOr[FileAccessLog] = js.undefined
}

object AccessLog {
  @scala.inline
  def apply(file: FileAccessLog = null): AccessLog = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[AccessLog]
  }
}

