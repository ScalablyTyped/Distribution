package typings.aliOss.mod

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
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectPart]
  }
}

