package typings.awsSdk.acmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForCertificateResponse extends js.Object {
  /**
    * The key-value pairs that define the applied tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ListTagsForCertificateResponse {
  @scala.inline
  def apply(): ListTagsForCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForCertificateResponse]
  }
  @scala.inline
  implicit class ListTagsForCertificateResponseOps[Self <: ListTagsForCertificateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

