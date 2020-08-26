package typings.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Etag extends js.Object {
  var etag: String = js.native
  var number: Double = js.native
}

object Etag {
  @scala.inline
  def apply(etag: String, number: Double): Etag = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    __obj.asInstanceOf[Etag]
  }
  @scala.inline
  implicit class EtagOps[Self <: Etag] (val x: Self) extends AnyVal {
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
    def setNumber(value: Double): Self = this.set("number", value.asInstanceOf[js.Any])
  }
  
}

