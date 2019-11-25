package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMeta extends js.Object {
   // object last modified GMT date, e.g.: 2015-02-19T08:39:44.000Z
  var etag: String
   // object name on oss
  var lastModified: String
  var name: String
  var owner: OwnerType
   // object type, e.g.: Normal
  var size: Double
   // object size, e.g.: 344606
  var storageClass: StorageType
   // object etag contains ", e.g.: "5B3C1A2E053D763E1B002CC607C5A0FE"
  var `type`: String
}

object ObjectMeta {
  @scala.inline
  def apply(
    etag: String,
    lastModified: String,
    name: String,
    owner: OwnerType,
    size: Double,
    storageClass: StorageType,
    `type`: String
  ): ObjectMeta = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], storageClass = storageClass.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectMeta]
  }
}

