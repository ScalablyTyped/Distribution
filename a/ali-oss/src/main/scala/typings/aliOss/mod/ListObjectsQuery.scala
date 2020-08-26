package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListObjectsQuery extends js.Object {
   // search start from marker, including marker key
  var delimiter: js.UndefOr[String] = js.native
   // search object using prefix key
  var marker: js.UndefOr[String] = js.native
   // delimiter search scope e.g. / only search current dir, not including subdir
  var `max-keys`: String | Double = js.native
  var prefix: js.UndefOr[String] = js.native
}

object ListObjectsQuery {
  @scala.inline
  def apply(`max-keys`: String | Double): ListObjectsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-keys")(`max-keys`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsQuery]
  }
  @scala.inline
  implicit class ListObjectsQueryOps[Self <: ListObjectsQuery] (val x: Self) extends AnyVal {
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
    def `setMax-keys`(value: String | Double): Self = this.set("max-keys", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

