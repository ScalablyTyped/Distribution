package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListPartsResult extends js.Object {
  var PartNumberMarker: scala.Double
  var bucket: java.lang.String
  var isTruncated: scala.Boolean
  var maxParts: scala.Double
  var name: java.lang.String
  var nextPartNumberMarker: scala.Double
  var parts: js.Array[ObjectPart]
  var res: NormalSuccessResponse
  var uploadId: java.lang.String
}

