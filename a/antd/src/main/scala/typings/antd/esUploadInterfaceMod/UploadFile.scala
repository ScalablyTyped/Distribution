package typings.antd.esUploadInterfaceMod

import typings.std.Blob
import typings.std.Date
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFile[T] extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  var lastModified: js.UndefOr[Double] = js.undefined
  var lastModifiedDate: js.UndefOr[Date] = js.undefined
  var linkProps: js.UndefOr[js.Any] = js.undefined
  var name: String
  var originFileObj: js.UndefOr[File | Blob] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var response: js.UndefOr[T] = js.undefined
  var size: Double
  var status: js.UndefOr[UploadFileStatus] = js.undefined
  var thumbUrl: js.UndefOr[String] = js.undefined
  var `type`: String
  var uid: String
  var url: js.UndefOr[String] = js.undefined
}

object UploadFile {
  @scala.inline
  def apply[T](
    name: String,
    size: Double,
    `type`: String,
    uid: String,
    error: js.Any = null,
    fileName: String = null,
    lastModified: Int | Double = null,
    lastModifiedDate: Date = null,
    linkProps: js.Any = null,
    originFileObj: File | Blob = null,
    percent: Int | Double = null,
    response: T = null,
    status: UploadFileStatus = null,
    thumbUrl: String = null,
    url: String = null
  ): UploadFile[T] = {
    val __obj = js.Dynamic.literal(name = name, size = size, uid = uid)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps)
    if (originFileObj != null) __obj.updateDynamic("originFileObj")(originFileObj.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status)
    if (thumbUrl != null) __obj.updateDynamic("thumbUrl")(thumbUrl)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UploadFile[T]]
  }
}

