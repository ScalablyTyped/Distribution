package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUploadsQuery extends js.Object {
  var `key-marker`: js.UndefOr[String] = js.undefined
  var `max-uploads`: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var `upload-id-marker`: js.UndefOr[String] = js.undefined
}

object ListUploadsQuery {
  @scala.inline
  def apply(
    `key-marker`: String = null,
    `max-uploads`: Int | Double = null,
    prefix: String = null,
    `upload-id-marker`: String = null
  ): ListUploadsQuery = {
    val __obj = js.Dynamic.literal()
    if (`key-marker` != null) __obj.updateDynamic("key-marker")(`key-marker`.asInstanceOf[js.Any])
    if (`max-uploads` != null) __obj.updateDynamic("max-uploads")(`max-uploads`.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (`upload-id-marker` != null) __obj.updateDynamic("upload-id-marker")(`upload-id-marker`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUploadsQuery]
  }
}

