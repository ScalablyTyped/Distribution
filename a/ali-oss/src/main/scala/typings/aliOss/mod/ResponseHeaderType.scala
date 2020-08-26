package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseHeaderType extends js.Object {
  var `cache-control`: js.UndefOr[String] = js.native
  var `content-disposition`: js.UndefOr[String] = js.native
  var `content-type`: js.UndefOr[String] = js.native
}

object ResponseHeaderType {
  @scala.inline
  def apply(): ResponseHeaderType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseHeaderType]
  }
  @scala.inline
  implicit class ResponseHeaderTypeOps[Self <: ResponseHeaderType] (val x: Self) extends AnyVal {
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
    def `setCache-control`(value: String): Self = this.set("cache-control", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-control`: Self = this.set("cache-control", js.undefined)
    @scala.inline
    def `setContent-disposition`(value: String): Self = this.set("content-disposition", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-disposition`: Self = this.set("content-disposition", js.undefined)
    @scala.inline
    def `setContent-type`(value: String): Self = this.set("content-type", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteContent-type`: Self = this.set("content-type", js.undefined)
  }
  
}

