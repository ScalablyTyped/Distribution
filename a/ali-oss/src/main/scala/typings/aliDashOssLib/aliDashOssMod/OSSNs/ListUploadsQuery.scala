package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUploadsQuery extends js.Object {
  var `key-marker`: js.UndefOr[java.lang.String] = js.undefined
  var `max-uploads`: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var `upload-id-marker`: js.UndefOr[java.lang.String] = js.undefined
}

object ListUploadsQuery {
  @scala.inline
  def apply(
    `key-marker`: java.lang.String = null,
    `max-uploads`: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    `upload-id-marker`: java.lang.String = null
  ): ListUploadsQuery = {
    val __obj = js.Dynamic.literal()
    if (`key-marker` != null) __obj.updateDynamic("key-marker")(`key-marker`)
    if (`max-uploads` != null) __obj.updateDynamic("max-uploads")(`max-uploads`.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (`upload-id-marker` != null) __obj.updateDynamic("upload-id-marker")(`upload-id-marker`)
    __obj.asInstanceOf[ListUploadsQuery]
  }
}

