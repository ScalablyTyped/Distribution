package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseHeaderType extends js.Object {
  var `cache-control`: js.UndefOr[String] = js.undefined
  var `content-disposition`: js.UndefOr[String] = js.undefined
  var `content-type`: js.UndefOr[String] = js.undefined
}

object ResponseHeaderType {
  @scala.inline
  def apply(
    `cache-control`: String = null,
    `content-disposition`: String = null,
    `content-type`: String = null
  ): ResponseHeaderType = {
    val __obj = js.Dynamic.literal()
    if (`cache-control` != null) __obj.updateDynamic("cache-control")(`cache-control`.asInstanceOf[js.Any])
    if (`content-disposition` != null) __obj.updateDynamic("content-disposition")(`content-disposition`.asInstanceOf[js.Any])
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeaderType]
  }
}

