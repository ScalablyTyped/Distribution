package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPart extends js.Object {
   // {Date} Time when a part is uploaded.
  var ETag: String
  var LastModified: js.Any
  var PartNumber: Double
  var size: Double
}

object ObjectPart {
  @scala.inline
  def apply(ETag: String, LastModified: js.Any, PartNumber: Double, size: Double): ObjectPart = {
    val __obj = js.Dynamic.literal(ETag = ETag, LastModified = LastModified, PartNumber = PartNumber, size = size)
  
    __obj.asInstanceOf[ObjectPart]
  }
}

