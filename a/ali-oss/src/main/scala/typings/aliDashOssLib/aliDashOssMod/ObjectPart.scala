package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPart extends js.Object {
   // {Date} Time when a part is uploaded.
  var ETag: java.lang.String
  var LastModified: js.Any
  var PartNumber: scala.Double
  var size: scala.Double
}

object ObjectPart {
  @scala.inline
  def apply(ETag: java.lang.String, LastModified: js.Any, PartNumber: scala.Double, size: scala.Double): ObjectPart = {
    val __obj = js.Dynamic.literal(ETag = ETag, LastModified = LastModified, PartNumber = PartNumber, size = size)
  
    __obj.asInstanceOf[ObjectPart]
  }
}

