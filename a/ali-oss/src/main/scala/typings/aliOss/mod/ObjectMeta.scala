package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectMeta extends js.Object {
   // object last modified GMT date, e.g.: 2015-02-19T08:39:44.000Z
  var etag: String = js.native
   // object name on oss
  var lastModified: String = js.native
  var name: String = js.native
  var owner: OwnerType = js.native
   // object type, e.g.: Normal
  var size: Double = js.native
   // object size, e.g.: 344606
  var storageClass: StorageType = js.native
   // object etag contains ", e.g.: "5B3C1A2E053D763E1B002CC607C5A0FE"
  var `type`: String = js.native
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
  @scala.inline
  implicit class ObjectMetaOps[Self <: ObjectMeta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModified(value: String): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: OwnerType): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setStorageClass(value: StorageType): Self = this.set("storageClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

