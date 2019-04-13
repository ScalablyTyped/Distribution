package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  var StorageClass: StorageType
  var creationDate: java.lang.String
  var name: java.lang.String
  var region: java.lang.String
}

object Bucket {
  @scala.inline
  def apply(
    StorageClass: StorageType,
    creationDate: java.lang.String,
    name: java.lang.String,
    region: java.lang.String
  ): Bucket = {
    val __obj = js.Dynamic.literal(StorageClass = StorageClass, creationDate = creationDate, name = name, region = region)
  
    __obj.asInstanceOf[Bucket]
  }
}

