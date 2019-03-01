package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseHeaderType extends js.Object {
  var `cache-control`: js.UndefOr[java.lang.String] = js.undefined
  var `content-disposition`: js.UndefOr[java.lang.String] = js.undefined
  var `content-type`: js.UndefOr[java.lang.String] = js.undefined
}

object ResponseHeaderType {
  @scala.inline
  def apply(
    `cache-control`: java.lang.String = null,
    `content-disposition`: java.lang.String = null,
    `content-type`: java.lang.String = null
  ): ResponseHeaderType = {
    val __obj = js.Dynamic.literal()
    if (`cache-control` != null) __obj.updateDynamic("cache-control")(`cache-control`)
    if (`content-disposition` != null) __obj.updateDynamic("content-disposition")(`content-disposition`)
    if (`content-type` != null) __obj.updateDynamic("content-type")(`content-type`)
    __obj.asInstanceOf[ResponseHeaderType]
  }
}

