package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// parameters type
@js.native
trait ListBucketsQueryType extends js.Object {
   // search buckets using prefix key
  var marker: js.UndefOr[String] = js.native
   // search start from marker, including marker key
  var `max-keys`: js.UndefOr[String | Double] = js.native
  var prefix: js.UndefOr[String] = js.native
}

object ListBucketsQueryType {
  @scala.inline
  def apply(): ListBucketsQueryType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBucketsQueryType]
  }
  @scala.inline
  implicit class ListBucketsQueryTypeOps[Self <: ListBucketsQueryType] (val x: Self) extends AnyVal {
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
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    @scala.inline
    def `setMax-keys`(value: String | Double): Self = this.set("max-keys", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteMax-keys`: Self = this.set("max-keys", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
  
}

