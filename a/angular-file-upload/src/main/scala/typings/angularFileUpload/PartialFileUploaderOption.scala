package typings.angularFileUpload

import typings.angularFileUpload.mod.FileItem
import typings.angularFileUpload.mod.Filter
import typings.std.FormData
import typings.std.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<angular-file-upload.angular-file-upload.FileUploaderOptions> */
trait PartialFileUploaderOption extends js.Object {
  var alias: js.UndefOr[String] = js.undefined
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  var disableMultipart: js.UndefOr[Boolean] = js.undefined
  var filters: js.UndefOr[js.Array[Filter]] = js.undefined
  var formData: js.UndefOr[js.Array[FormData]] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var queue: js.UndefOr[js.Array[FileItem]] = js.undefined
  var queueLimit: js.UndefOr[Double] = js.undefined
  var removeAfterUpload: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object PartialFileUploaderOption {
  @scala.inline
  def apply(
    alias: String = null,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    disableMultipart: js.UndefOr[Boolean] = js.undefined,
    filters: js.Array[Filter] = null,
    formData: js.Array[FormData] = null,
    headers: Headers = null,
    method: String = null,
    queue: js.Array[FileItem] = null,
    queueLimit: Int | Double = null,
    removeAfterUpload: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): PartialFileUploaderOption = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMultipart)) __obj.updateDynamic("disableMultipart")(disableMultipart.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (queueLimit != null) __obj.updateDynamic("queueLimit")(queueLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(removeAfterUpload)) __obj.updateDynamic("removeAfterUpload")(removeAfterUpload.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFileUploaderOption]
  }
}

