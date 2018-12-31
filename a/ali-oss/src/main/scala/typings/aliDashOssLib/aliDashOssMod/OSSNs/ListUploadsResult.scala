package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUploadsResult extends js.Object {
  var bucket: java.lang.String
  var isTruncated: scala.Boolean
  var nextKeyMarker: js.Any
  var nextUploadIdMarker: js.Any
  var res: NormalSuccessResponse
  var uploads: js.Array[Upload]
}

