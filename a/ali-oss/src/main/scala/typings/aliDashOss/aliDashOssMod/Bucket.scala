package typings.aliDashOss.aliDashOssMod

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
    val __obj = js.Dynamic.literal(StorageClass = StorageClass, creationDate = creationDate, name = name, region = region)
  
    __obj.asInstanceOf[Bucket]
  }
}

