package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  var StorageClass: StorageType
  var creationDate: String
  var name: String
  var region: String
}

object Bucket {
  @scala.inline
  def apply(StorageClass: StorageType, creationDate: String, name: String, region: String): Bucket = {
    val __obj = js.Dynamic.literal(StorageClass = StorageClass.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
}

