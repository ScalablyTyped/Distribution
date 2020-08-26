package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadsHeaders extends js.Object {
  /**
    * Provides header values by header name
    */
  def getHeader(name: String): js.Array[String] | Null = js.native
}

object ReadsHeaders {
  @scala.inline
  def apply(getHeader: String => js.Array[String] | Null): ReadsHeaders = {
    val __obj = js.Dynamic.literal(getHeader = js.Any.fromFunction1(getHeader))
    __obj.asInstanceOf[ReadsHeaders]
  }
  @scala.inline
  implicit class ReadsHeadersOps[Self <: ReadsHeaders] (val x: Self) extends AnyVal {
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
    def setGetHeader(value: String => js.Array[String] | Null): Self = this.set("getHeader", js.Any.fromFunction1(value))
  }
  
}

