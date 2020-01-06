package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessLog extends js.Object {
  /**
    * The file object to send virtual node access logs to.
    */
  var file: js.UndefOr[FileAccessLog] = js.native
}

object AccessLog {
  @scala.inline
  def apply(file: FileAccessLog = null): AccessLog = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessLog]
  }
}

