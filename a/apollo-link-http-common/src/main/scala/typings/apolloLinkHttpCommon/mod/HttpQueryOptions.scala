package typings.apolloLinkHttpCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpQueryOptions extends js.Object {
  var includeExtensions: js.UndefOr[Boolean] = js.native
  var includeQuery: js.UndefOr[Boolean] = js.native
}

object HttpQueryOptions {
  @scala.inline
  def apply(): HttpQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpQueryOptions]
  }
  @scala.inline
  implicit class HttpQueryOptionsOps[Self <: HttpQueryOptions] (val x: Self) extends AnyVal {
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
    def setIncludeExtensions(value: Boolean): Self = this.set("includeExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeExtensions: Self = this.set("includeExtensions", js.undefined)
    @scala.inline
    def setIncludeQuery(value: Boolean): Self = this.set("includeQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeQuery: Self = this.set("includeQuery", js.undefined)
  }
  
}

