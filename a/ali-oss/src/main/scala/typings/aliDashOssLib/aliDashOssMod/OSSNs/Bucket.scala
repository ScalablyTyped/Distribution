package typings
package aliDashOssLib.aliDashOssMod.OSSNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("StorageClass")(StorageClass)
    __obj.updateDynamic("creationDate")(creationDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Bucket]
  }
}

