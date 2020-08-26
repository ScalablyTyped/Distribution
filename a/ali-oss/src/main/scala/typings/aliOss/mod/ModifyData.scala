package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyData extends js.Object {
   //  object last modified GMT string
  var etag: String = js.native
  var lastModified: String = js.native
}

object ModifyData {
  @scala.inline
  def apply(etag: String, lastModified: String): ModifyData = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyData]
  }
  @scala.inline
  implicit class ModifyDataOps[Self <: ModifyData] (val x: Self) extends AnyVal {
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
  }
  
}

