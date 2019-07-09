package typings
package antdLib.libUploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadFile extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  var lastModified: js.UndefOr[scala.Double] = js.undefined
  var lastModifiedDate: js.UndefOr[stdLib.Date] = js.undefined
  var linkProps: js.UndefOr[js.Any] = js.undefined
  var name: java.lang.String
  var originFileObj: js.UndefOr[stdLib.File | stdLib.Blob] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var response: js.UndefOr[js.Any] = js.undefined
  var size: scala.Double
  var status: js.UndefOr[UploadFileStatus] = js.undefined
  var thumbUrl: js.UndefOr[java.lang.String] = js.undefined
  var `type`: java.lang.String
  var uid: java.lang.String
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object UploadFile {
  @scala.inline
  def apply(
    name: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    uid: java.lang.String,
    error: js.Any = null,
    fileName: java.lang.String = null,
    lastModified: scala.Int | scala.Double = null,
    lastModifiedDate: stdLib.Date = null,
    linkProps: js.Any = null,
    originFileObj: stdLib.File | stdLib.Blob = null,
    percent: scala.Int | scala.Double = null,
    response: js.Any = null,
    status: UploadFileStatus = null,
    thumbUrl: java.lang.String = null,
    url: java.lang.String = null
  ): UploadFile = {
    val __obj = js.Dynamic.literal(name = name, size = size, uid = uid)
    __obj.updateDynamic("type")(`type`)
    if (error != null) __obj.updateDynamic("error")(error)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate)
    if (linkProps != null) __obj.updateDynamic("linkProps")(linkProps)
    if (originFileObj != null) __obj.updateDynamic("originFileObj")(originFileObj.asInstanceOf[js.Any])
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response)
    if (status != null) __obj.updateDynamic("status")(status)
    if (thumbUrl != null) __obj.updateDynamic("thumbUrl")(thumbUrl)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[UploadFile]
  }
}

