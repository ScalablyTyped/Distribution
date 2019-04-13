package typings
package awsDashSdkLib.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  /**
    * The content of the attachment file.
    */
  var data: js.UndefOr[Data] = js.undefined
  /**
    * The name of the attachment file.
    */
  var fileName: js.UndefOr[FileName] = js.undefined
}

object Attachment {
  @scala.inline
  def apply(data: Data = null, fileName: FileName = null): Attachment = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    __obj.asInstanceOf[Attachment]
  }
}

